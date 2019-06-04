/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DAO.OrderDAO;
import Models.Order;
import Utils.PaypalPayment;
import com.paypal.api.payments.Payment;
import com.paypal.base.rest.PayPalRESTException;
import java.io.IOException;
import java.io.PrintWriter;
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
public class ConfirmPaymentController extends HttpServlet {

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

    private static String executionMode = "sandbox"; // sandbox or production
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
                HttpSession sessions = request.getSession();
                /* TODO output your page here. You may use following sample code. */
                PaypalPayment PaypalPayment;
                Payment payment = null;
                if (request.getParameter("PayerID") != null) {
                    PaypalPayment = new PaypalPayment(ID,Secret,executionMode);
                    payment = PaypalPayment.completePayment(request);
                }
                
                if (payment != null) {
                    Order order = new Order();
                    order.setId((Long) sessions.getAttribute("order_id"));
                    order.setStatus(2);
                    order.setPayment_id(payment.getId());

                    boolean status = OrderDAO.updatePaymentStatus(order);
                    if (status == true){
                        sessions.removeAttribute("order_id");
                        sessions.removeAttribute("cart");
                        response.sendRedirect("/DoAn/index.jsp");
                    }
                } else {
                    String errorMsg = "System Error! Can not process Payment!";
                        request.setAttribute("errorMsg", errorMsg);
                    RequestDispatcher dispatcher
                        = this.getServletContext().getRequestDispatcher("/carts.jsp");
                    dispatcher.forward(request, response);
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
        } catch (Exception ex) {
            Logger.getLogger(ConfirmPaymentController.class.getName()).log(Level.SEVERE, null, ex);
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
        } catch (Exception ex) {
            Logger.getLogger(ConfirmPaymentController.class.getName()).log(Level.SEVERE, null, ex);
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
