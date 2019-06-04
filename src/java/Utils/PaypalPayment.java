/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import Models.Order;
import Models.Item;
import com.paypal.api.payments.Amount;
import com.paypal.api.payments.Details;
import com.paypal.api.payments.ItemList;
import com.paypal.api.payments.Links;
import com.paypal.api.payments.Payer;
import com.paypal.api.payments.Payment;
import com.paypal.api.payments.PaymentExecution;
import com.paypal.api.payments.RedirectUrls;
import com.paypal.api.payments.RelatedResources;
import com.paypal.api.payments.Transaction;
import com.paypal.base.rest.APIContext;
import com.paypal.base.rest.PayPalRESTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author vinhd
 */
public class PaypalPayment {
    private APIContext apiContext;
    private static Integer VNDtoUSD = 22000;
    public PaypalPayment(String clientId,String clientSecret,String mode) {
        apiContext = new APIContext(clientId, clientSecret, mode);  
    }
    public void processPayment(Order order, HashMap<String, Item> carts, HttpServletResponse response) throws IOException {
        // Set payer details
        Payer payer = new Payer();
        payer.setPaymentMethod("paypal");
 
        // Set redirect URLs
        RedirectUrls redirectUrls = new RedirectUrls();
        redirectUrls.setCancelUrl("http://localhost:8080/DoAn/Checkout");
        redirectUrls.setReturnUrl("http://localhost:8080/DoAn/ConfirmPayment");
 
        
 
        // Transaction information
        List<Transaction> transactions = new ArrayList<Transaction>();
        ItemList itemLists = new ItemList();
        double order_total=0;
        List<com.paypal.api.payments.Item> items = new ArrayList<com.paypal.api.payments.Item>();
        for (String key: carts.keySet()) {
            com.paypal.api.payments.Item item = new com.paypal.api.payments.Item();
            item.setCurrency("USD");
            item.setName(carts.get(key).getProduct().getProduct_name());
            item.setQuantity(carts.get(key).getQuantity().toString());
            double price = carts.get(key).getProduct().getPrice() / VNDtoUSD;
            double totalPrice = price * carts.get(key).getQuantity();
            item.setPrice(price+"");
            order_total += totalPrice;
            items.add(item);
        }
        itemLists.setItems(items);
        // Set payment details
        double shipping = Double.parseDouble("0");
        double paymentTotal = order_total;
        double cartTotal = paymentTotal;
        double tax  = (cartTotal*5)/100;
         
        Details details = new Details();
        details.setShipping(shipping+"");
        details.setSubtotal(cartTotal+"");
        details.setTax(tax+"");
        double total = cartTotal+shipping+tax;
         
        // Payment amount
        Amount amount = new Amount();
        amount.setCurrency("USD");
        // Total must be equal to sum of shipping, tax and subtotal.
        amount.setTotal(""+total);
        amount.setDetails(details);
        
        Transaction transaction = new Transaction();
        transaction.setNoteToPayee("OrderID: " + order.getId().toString());
        transaction.setAmount(amount);
        transaction.setDescription("Thu thanh toan paypal");
        transaction.setItemList(itemLists);
        
        // Add transaction to a list

        transactions.add(transaction);
        //System.out.println(transactions);
        //Add payment details
        Payment payment = new Payment();
        payment.setIntent("sale");
        payment.setPayer(payer);
        payment.setRedirectUrls(redirectUrls);
        payment.setTransactions(transactions);  
         
        // Create payment
        try {
          Payment createdPayment = payment.create(apiContext);
           
         // System.out.println(createdPayment);
 
          Iterator<Links> links = createdPayment.getLinks().iterator();
          while (links.hasNext()) {
            Links link = links.next();
            if (link.getRel().equalsIgnoreCase("approval_url")) {
              // REDIRECT USER TO link.getHref()    
             response.sendRedirect(link.getHref()); 
            }
          }
        } catch (PayPalRESTException e) {
            System.err.println(e.getDetails());
        } catch (IOException e) {
            e.printStackTrace();
        }
         
    }
    
    public Payment completePayment(HttpServletRequest req) {
        HttpSession sessions = req.getSession();
        Payment payment = new Payment();
        payment.setId(req.getParameter("paymentId"));
 
        PaymentExecution paymentExecution = new PaymentExecution();
        paymentExecution.setPayerId(req.getParameter("PayerID"));
        String id = "";
        try {
            Payment createdPayment = payment.execute(apiContext, paymentExecution);
            
            return payment;
        } catch (PayPalRESTException e) {
            System.err.println(e.getDetails());
        }
        return null;
    }
}
