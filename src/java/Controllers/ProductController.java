/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Product;
import Models.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
public class ProductController extends HttpServlet {

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
            HttpSession session = request.getSession();
            Integer category = Integer.parseInt(request.getParameter("category")) ;
            Integer currentPage = Integer.parseInt(request.getParameter("page"));
            Integer recordsPerPage = Integer.parseInt(request.getParameter("recordsPerPage"));
            
            Integer rows = ProductDAO.getTotalProductCountInCategory(category);
            
            
            Integer offset=0;
            Integer from=0;
            Integer to=0;
            int nOfPages=0;
            if ((rows % recordsPerPage) == 0)
            {
                nOfPages = rows / recordsPerPage;
            }
            else {
                nOfPages = (rows / recordsPerPage)+1;
            }
            System.out.println(nOfPages);
            
            if (rows <= recordsPerPage) {
                offset = 0;
                from = ((currentPage -1) * recordsPerPage)+1;
                to = rows;
            } else {
                offset = ((currentPage - 1) * recordsPerPage);
                to = currentPage * recordsPerPage;
                from = ((currentPage -1) * recordsPerPage)+1;
            }
            
            List<Product> products = ProductDAO.getProductbyCateId(category, recordsPerPage, offset);
        
            request.setAttribute("products", products);
            request.setAttribute("noOfPages", nOfPages);
            request.setAttribute("currentPage", currentPage);
            request.setAttribute("from", from);
            request.setAttribute("to", to);
            request.setAttribute("total", rows);
            request.setAttribute("recordsPerPage", recordsPerPage);
            request.setAttribute("category", category);
            RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/view_product.jsp");
            dispatcher.forward(request, response);
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
            Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE, null, ex);
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
