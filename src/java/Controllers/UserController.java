/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.MyUtils;
import Models.User;
import DAO.UserDAO;
import Utils.Email;
import Utils.verifyUtils;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Multipart;
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
public class UserController extends HttpServlet {

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
            throws ServletException, IOException, SQLException, ClassNotFoundException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            HttpSession session = request.getSession();
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String doAction = request.getParameter("doAction");
            User user;
            String errorMsg="";
            boolean valid = true;
            
            switch(doAction) {
                case "register":
                    user = new User();
                    String email = request.getParameter("email");
                    String conf_password = request.getParameter("conf_password");
                    String fullname = request.getParameter("fullname");
                    String phone_number = request.getParameter("phone_number");
                    Integer gender = Integer.parseInt(request.getParameter("gender"));
                    String date_of_birth = request.getParameter("date_of_birth");
                    
                    
                    if (username == null || password == null || email == null || username.length() == 0 || password.length() == 0 || email.length() == 0 || conf_password == null || conf_password.length() == 0)
                    {
                        errorMsg = "Các ô có * là bắt buộc! Vui lòng kiểm tra lại";
                        request.setAttribute("errorMsg", errorMsg);
                        RequestDispatcher dispatcher
                            = this.getServletContext().getRequestDispatcher("/register.jsp");
                        dispatcher.forward(request, response);
                    }
                    else
                    {
                        user.setUsername(username);
                        user.setEmail(email);
                        user.setFullname(fullname);
                        user.setPassword(password);
                        user.setMobile_phone(phone_number);
                        user.setGender(gender);
                        if (date_of_birth == null || date_of_birth.length() == 0)
                        {
                            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                            Date date = new Date();
                            date_of_birth = (String) dateFormat.format(date);
                            user.setDate_of_birth(date_of_birth);
                        }
                        else{
                            user.setDate_of_birth(date_of_birth);
                        }
                        
                    
                        User check = new User();
                        check = UserDAO.checkDataExisted(username, email);
                        String gRecaptchaResponse = request.getParameter("g-recaptcha-response");
 
                        System.out.println("gRecaptchaResponse=" + gRecaptchaResponse);

                        // Verify CAPTCHA.
                        valid = verifyUtils.verify(gRecaptchaResponse);
                        if (check != null)
                        {
                            if (username.equals(check.getUsername()))
                            {
                                errorMsg = "Tài khoản bị trùng. Vui lòng chọn tài khoản khác!";
                                request.setAttribute("errorMsg", errorMsg);
                                RequestDispatcher dispatcher 
                                    = this.getServletContext().getRequestDispatcher("/register.jsp");
                                dispatcher.forward(request, response);
                            }
                            else if (email.equals(check.getEmail()))
                            {
                                errorMsg = "Email bị trùng. Vui lòng chọn email khác!";
                                request.setAttribute("errorMsg", errorMsg);
                                RequestDispatcher dispatcher
                                    = this.getServletContext().getRequestDispatcher("/register.jsp");
                                dispatcher.forward(request, response);
                            }
                        }
                        else if (!password.equalsIgnoreCase(conf_password))
                        {
                            errorMsg =  "Mật khẩu và mật khẩu xác nhận không giống nhau!";
                            request.setAttribute("errorMsg", errorMsg);
                            RequestDispatcher dispatcher //
                                = this.getServletContext().getRequestDispatcher("/register.jsp");
                            dispatcher.forward(request, response);
                        }
                        else
                        {
                            if (valid)
                            {
                                int result = UserDAO.addCustomer(user);

                                if (result == 1)
                                {
                                    String to_add = user.getEmail();
                                    String subject = "Xac nhan thong tin tai khoan";
                                    String content = "<html>"
                                            + "<meta charset=\"UTF-8\">"
                                            + "<body>"
                                            + "Bạn đã đăng ký tài khoản vào trang web Super Shop. <br />"
                                            + "Thông tin tài khoản là: <br />"
                                            + "Tài khoản: "+username+"<br />"
                                            + "Xin vui lòng nhấp vào link sau để xác nhận thông tin. Xin cảm ơn. <br />"
                                            + "<a href='http://localhost:8080/DoAn/verifyUserController?username="+username+"'>Xác nhận tài khoản</a>"
                                            + "</body>"
                                                    + "</html>";

                                    Email.getInstance().sendEmail(to_add, subject, content);
                                    response.sendRedirect("/DoAn/index.jsp");
                                }
                                else
                                {
                                    errorMsg =  "Có lỗi xảy ra. Không thê thêm thông tin thành viên!";
                                    request.setAttribute("errorMsg", errorMsg);
                                    RequestDispatcher dispatcher //
                                        = this.getServletContext().getRequestDispatcher("login.jsp");
                                    dispatcher.forward(request, response);
                                }
                            }
                            else
                            {
                                errorMsg =  "Capcha không đúng!";
                                request.setAttribute("errorMsg", errorMsg);
                                RequestDispatcher dispatcher //
                                    = this.getServletContext().getRequestDispatcher("/register.jsp");
                                dispatcher.forward(request, response);
                            }
                        }
                    }
                    
                    break;
                case "update":
                    Boolean status = false;
                    user = new User();
                    username = request.getParameter("username");
                    fullname = request.getParameter("fullname");
                    phone_number = request.getParameter("phone_number");
                    gender = Integer.parseInt(request.getParameter("gender"));
                    date_of_birth = request.getParameter("date_of_birth");

                    user.setUsername(username);
                    user.setFullname(fullname);
                    user.setMobile_phone(phone_number);
                    user.setGender(gender);
                    user.setDate_of_birth(date_of_birth);
                    
                    if (user != null) {
                        status = UserDAO.update(user);
                    }
                    
                    if (status != true) {
                        errorMsg =  "<div class=\"alert alert-danger\" role=\"alert\">\n" +
                                    "  Cập nhật thông tin thất bại\n" +
                                    "</div>";
                        request.setAttribute("errorMsg", errorMsg);
                        RequestDispatcher dispatcher //
                            = this.getServletContext().getRequestDispatcher("/account_details.jsp");
                        dispatcher.forward(request, response);
                    } else {
                        MyUtils.storeLoginedUser(session, user);
                        errorMsg =  "<div class=\"alert alert-success\" role=\"alert\">\n" +
                                    "  Cập nhật thông tin thành công!\n" +
                                    "</div>";
                        request.setAttribute("errorMsg", errorMsg);
                        response.sendRedirect("/DoAn/account_details.jsp");
                    }
                    
                    
                    break;
                case "login":
                    if (username == null || username.length() == 0)
                    {
                        errorMsg = "Tài khoản không được bỏ trống! Vui lòng thử lại";
                        valid = false;
                    }
                    else if (password == null || password.length() == 0)
                    {
                        errorMsg = "Mật khẩu không được bỏ trống! Vui lòng thử lại";
                        valid = false;
                    }
                    
                    if (valid)
                    {
                        user = UserDAO.validate(username, password);
                        if (user != null)
                        {
                            
                            MyUtils.storeLoginedUser(session, user);
                            response.sendRedirect(request.getContextPath() + "/index.jsp");
                        }
                        else
                        {
                            errorMsg = "Tài khoản hay Mật khẩu không đúng! Vui lòng thử lại";
                            request.setAttribute("errorMsg", errorMsg);
                            RequestDispatcher dispatcher //
                                = this.getServletContext().getRequestDispatcher("/login.jsp");
                            dispatcher.forward(request, response);
                        }
                        
                    }
                    else
                    {
                        request.setAttribute("errorMsg", errorMsg);
                        RequestDispatcher dispatcher //
                            = this.getServletContext().getRequestDispatcher("/login.jsp");
                        dispatcher.forward(request, response);
                    }
                    
                    break;
                case "logout":
            
                    if ((Boolean) session.getAttribute("isLogged")  && session.getAttribute("UserInfo") != null) {
                        session.invalidate();
                        errorMsg = "You are successfully logged out!";  

                        response.sendRedirect(request.getContextPath() + "/index.jsp");
                    } else {
                        response.sendRedirect(request.getContextPath() + "/index.jsp");
                    }
                    break;
                
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
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
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
