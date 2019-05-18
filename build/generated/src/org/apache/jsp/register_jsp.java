package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "template/header.jsp", out, false);
      out.write(" \n");
      out.write("    \n");
      out.write("    <!-- Body BEGIN -->\n");
      out.write("    <body class=\"ecommerce\">\n");
      out.write("        \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "template/topbar.jsp", out, false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "template/navbar.jsp", out, false);
      out.write("\n");
      out.write("        <!-- reCAPTCHA Libary -->\n");
      out.write("        \n");
      out.write("        <div class=\"main\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("              <ul class=\"breadcrumb\">\n");
      out.write("                  <li><a href=\"/DoAn/\">Trang chủ</a></li>\n");
      out.write("                  <li class=\"active\">Đăng ký</li>\n");
      out.write("              </ul>\n");
      out.write("              <!-- BEGIN SIDEBAR & CONTENT -->\n");
      out.write("              <div class=\"row margin-bottom-40\">\n");
      out.write("\n");
      out.write("                <!-- BEGIN CONTENT -->\n");
      out.write("                <div class=\"col-md-9 col-sm-7\">\n");
      out.write("                  <h1>Đăng ký thông tin</h1>\n");
      out.write("                  <div class=\"content-form-page\">\n");
      out.write("                      \n");
      out.write("                    <form role=\"form\" class=\"form-horizontal form-without-legend\" action=\"UserController\" method=\"POST\">\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                        <label class=\"col-lg-2 control-label\"></label>\n");
      out.write("                        <div class=\"col-lg-8\">\n");
      out.write("                            <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errorMsg != null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                <p style=\"color: red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errorMsg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                            </c:if>\n");
      out.write("                            <p style=\"color: red\">Dấu * bắt buộc điền</p>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <input type=\"hidden\" name=\"doAction\" value=\"register\">\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                        <label class=\"col-lg-2 control-label\" for=\"username\">Tài khoản <span class=\"require\">*</span></label>\n");
      out.write("                        <div class=\"col-lg-8\">\n");
      out.write("                            <input type=\"text\" id=\"first-name\" class=\"form-control\" name=\"username\" pattern=\"^[a-zA-Z][a-zA-Z0-9-_\\.]{1,20}$\" required>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      \n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                        <label class=\"col-lg-2 control-label\" for=\"password\">Mật khẩu <span class=\"require\">*</span></label>\n");
      out.write("                        <div class=\"col-lg-8\">\n");
      out.write("                            <input type=\"password\" id=\"password\" class=\"form-control\" name=\"password\" pattern=\"^(?=^.{8,}$)(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?!.*\\s).*$\"  required>\n");
      out.write("                            <p class=\"help-block\">Phải kết hợp chữ hoa, chữ thường, chữ số và nhỏ nhất là 8 ký tự</p>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                        <label class=\"col-lg-2 control-label\" for=\"conf_password\">Xác nhận mật khẩu <span class=\"require\">*</span></label>\n");
      out.write("                        <div class=\"col-lg-8\">\n");
      out.write("                          <input type=\"password\" id=\"conf_password\" class=\"form-control\" name=\"conf_password\" pattern=\"^(?=^.{8,}$)(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?!.*\\s).*$\" required>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                        <label class=\"col-lg-2 control-label\" for=\"email\">E-Mail <span class=\"require\">*</span></label>\n");
      out.write("                        <div class=\"col-lg-8\">\n");
      out.write("                            <input type=\"email\" id=\"email\" class=\"form-control\" name=\"email\" required>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                        <label class=\"col-lg-2 control-label\" for=\"fulname\">Họ tên <span class=\"require\">*</span></label>\n");
      out.write("                        <div class=\"col-lg-8\">\n");
      out.write("                            <input type=\"text\" id=\"fullname\" class=\"form-control\" name=\"fullname\" required>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                        <label class=\"col-lg-2 control-label\" for=\"email\">Số điện thoại </label>\n");
      out.write("                        <div class=\"col-lg-8\">\n");
      out.write("                            <input type=\"tel\" id=\"phone_number\" class=\"form-control\" name=\"phone_number\" pattern=\"^(?:0|84\\s?)[1-9](?:\\d\\d){4}$\" maxlength=\"11\">\n");
      out.write("                            <p class=\"help-block\">Chỉ sử dụng số điện thoại của Vietnam bắt đầu bằng 0 hoặc 84. VD 0975696854 hoặc 84975696854</p>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                          <label class=\"col-md-2 control-label\">Giới tính</label>\n");
      out.write("                        <div class=\"col-md-8\">\n");
      out.write("                            <select class=\"form-control\" name=\"gender\">\n");
      out.write("                              <option value=\"0\">Chưa chọn</option>\n");
      out.write("                              <option value=\"1\">Nam</option>\n");
      out.write("                              <option value=\"2\">Nữ</option>\n");
      out.write("                          </select>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                        <label class=\"col-lg-2 control-label\" for=\"\">Ngày Sinh </label>\n");
      out.write("                        <div class=\"col-lg-8\">\n");
      out.write("                            <input type=\"date\" id=\"date_of_birth\" class=\"form-control\" name=\"date_of_birth\" min=\"1900-01-01\">\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-8 col-md-offset-2 padding-left-0 padding-top-20\">\n");
      out.write("                            <div class=\"g-recaptcha\" data-sitekey=\"6LcleqMUAAAAAAq1isO5JZv-1GzZd2b59m5w9fJs\"></div>\n");
      out.write("                            <br />\n");
      out.write("                            <button class=\"btn btn-primary\" type=\"submit\">Đăng ký</button>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                    </form>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- END CONTENT -->\n");
      out.write("              </div>\n");
      out.write("              <!-- END SIDEBAR & CONTENT -->\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "template/footer.jsp", out, false);
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("    <!-- END BODY -->\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
