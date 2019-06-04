/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DAO.OrderDAO;
import Models.Item;
import Models.Order;
import Models.User;
import Utils.PaypalPayment;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.paypal.api.payments.Amount;
import com.paypal.api.payments.Authorization;
import com.paypal.api.payments.Details;
import com.paypal.api.payments.Links;
import com.paypal.api.payments.Payer;
import com.paypal.api.payments.PayerInfo;
import com.paypal.api.payments.Payment;
import com.paypal.api.payments.PaymentExecution;
import com.paypal.api.payments.RedirectUrls;
import com.paypal.api.payments.Transaction;
import com.paypal.base.rest.APIContext;
import com.paypal.base.rest.PayPalRESTException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

/**
 *
 * @author vinhd
 */
public class CheckoutController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private static String ID = "AWAgyG6kbBUFNzNB7PJ5NPZW8Bm37L6xC7_lf2vSRGa5C-l_FndGmTKnL5nrglC3B4OVeqr5UDGaLOUs";
    private static String Secret = "EFud1zW07WBcj9HM2eGTHQa-PuqV143fxoJI_rPyWTEAFaNia6mHFczkX9K2SqV0VC0lCUbW2cONNsjl";
    private static String PayerID = "STCL9GGGLWSUC";
    

    private static String executionMode = "sandbox"; // sandbox or production
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            		/*
            * Flow would look like this: 
            * 1. Create Payer object and set PaymentMethod 
            * 2. Set RedirectUrls and set cancelURL and returnURL 
            * 3. Set Details and Add PaymentDetails
            * 4. Set Amount
            * 5. Set Transaction
            * 6. Add Payment Details and set Intent to "authorize"
            * 7. Create APIContext by passing the clientID, secret and mode
            * 8. Create Payment object and get paymentID
            * 9. Set payerID to PaymentExecution object
            * 10. Execute Payment and get Authorization
            * 
            */
           String errorMsg;
           HttpSession sessions = request.getSession();
           Order order;
           if (sessions.getAttribute("UserInfo") == null) {
               response.sendRedirect("/DoAn/login.jsp");
           } else {
               HashMap<String, Item> carts = (HashMap<String, Item>) sessions.getAttribute("cart");
               Integer total = 0;
               User user = (User) sessions.getAttribute("UserInfo");
               order = new Order();
               order.setId((Long) sessions.getAttribute("order_id"));
               order.setCustomer_id(Integer.parseInt(user.getUser_id()));
               for (String key: carts.keySet()) {
                   total += carts.get(key).getQuantity() * carts.get(key).getProduct().getPrice();
               }
               order.setTotal(total);
               order.setStatus(1);
               boolean status = OrderDAO.addOrder(order, carts);

               if (status == true) {
                   PaypalPayment PaypalPayment;
                   PaypalPayment = new PaypalPayment(ID,Secret,executionMode);
                   PaypalPayment.processPayment(order, carts ,response);

                   if (PaypalPayment == null) {
                       errorMsg = "System Error! Can not process Payment!";
                       request.setAttribute("errorMsg", errorMsg);
                       RequestDispatcher dispatcher
                           = this.getServletContext().getRequestDispatcher("/carts.jsp");
                       dispatcher.forward(request, response);
                   }
               } else {
                   errorMsg = "System Error! Can not save to DB!";
                   request.setAttribute("errorMsg", errorMsg);
                   RequestDispatcher dispatcher
                       = this.getServletContext().getRequestDispatcher("/carts.jsp");
                   dispatcher.forward(request, response);
               }
           }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(CheckoutController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CheckoutController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(CheckoutController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CheckoutController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
