/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DAO.OrderDAO;
import DAO.ProductDAO;
import Models.Item;
import Models.Order;
import Models.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author vinhd
 */
public class CartController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            HttpSession sessions = request.getSession();
            
            if (sessions.getAttribute("UserInfo") != null) {
                Integer ProductId = Integer.parseInt(request.getParameter("ProductId"));
                Integer Quantities = Integer.parseInt(request.getParameter("Quantities"));
                String action = request.getParameter("action");
                Long TransactionID = OrderDAO.getLastOrderId().getId() + 1;
                sessions.setAttribute("order_id", TransactionID);
                    
                if (ProductId > 0) {
                    Item item;
                    Product p = ProductDAO.getProductbyId(ProductId);
                    
                    switch(action) {
                        case "add": 
                            if (p != null) {
                                if(sessions.getAttribute("cart") == null) {
                                    Map<String, Item> item_list = new HashMap<>();
                                    item = new Item();
                                    item.setOrderId(TransactionID);
                                    item.setProduct(p);
                                    item.setQuantity(Quantities);
                                    item_list.put(ProductId.toString(), item);
                                    sessions.setAttribute("cart", item_list);
                                } else {
                                    Map<String, Item> cart_in_session = (Map<String, Item>) sessions.getAttribute("cart");

                                    if (cart_in_session.containsKey(ProductId.toString())) {
                                        item = new Item();
                                        Integer new_quantities = cart_in_session.get(ProductId.toString()).getQuantity() + Quantities;
                                        item.setOrderId(TransactionID);
                                        item.setProduct(p);
                                        item.setQuantity(new_quantities);
                                        cart_in_session.put(ProductId.toString(), item);
                                    } else {
                                        item = new Item();
                                        item.setOrderId(TransactionID);
                                        item.setProduct(p);
                                        item.setQuantity(Quantities);
                                        cart_in_session.put(ProductId.toString(), item);
                                    }
                                    sessions.setAttribute("cart", cart_in_session);
                                }
                            }
                            break;
                        case "remove":
                            Map<String, Item> cart_in_session = (Map<String, Item>) sessions.getAttribute("cart");
                            cart_in_session.remove(ProductId.toString());
                            sessions.setAttribute("cart", cart_in_session);

                    }

                }
            } else  {
                out.print("no session");
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
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CartController.class.getName()).log(Level.SEVERE, null, ex);
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
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CartController.class.getName()).log(Level.SEVERE, null, ex);
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
