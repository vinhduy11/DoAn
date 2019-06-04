package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Body BEGIN -->\n");
      out.write("    <body class=\"ecommerce\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "template/topbar.jsp", out, false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "template/navbar.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"main\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("              <ul class=\"breadcrumb\">\n");
      out.write("                  <li><a href=\"/DoAn/\">Trang chủ</a></li>\n");
      out.write("                  <li class=\"active\">Đăng nhập</li>\n");
      out.write("              </ul>\n");
      out.write("              <!-- BEGIN SIDEBAR & CONTENT -->\n");
      out.write("              <div class=\"row margin-bottom-40\">\n");
      out.write("\n");
      out.write("                <!-- BEGIN CONTENT -->\n");
      out.write("                <div class=\"col-md-9 col-sm-7\">\n");
      out.write("                  <h1>Đăng nhập</h1>\n");
      out.write("                  <div class=\"content-form-page\">\n");
      out.write("                    <form role=\"form\" class=\"form-horizontal form-without-legend\" action=\"UserController\" method=\"POST\">\n");
      out.write("                      <input type=\"hidden\" name=\"doAction\" value=\"login\">\n");
      out.write("                      \n");
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
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                        <label class=\"col-lg-2 control-label\" for=\"username\">Tài khoản <span class=\"require\">*</span></label>\n");
      out.write("                        <div class=\"col-lg-8\">\n");
      out.write("                            <input type=\"text\" id=\"first-name\" class=\"form-control\" name=\"username\">\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      \n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                        <label class=\"col-lg-2 control-label\" for=\"password\">Mật khẩu <span class=\"require\">*</span></label>\n");
      out.write("                        <div class=\"col-lg-8\">\n");
      out.write("                          <input type=\"password\" id=\"first-name\" class=\"form-control\" name=\"password\">\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      \n");
      out.write("                      <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-8 col-md-offset-2 padding-left-0 padding-top-20\">\n");
      out.write("                            <button class=\"btn btn-primary\" type=\"submit\">Đăng nhập</button>\n");
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
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "template/footer.jsp", out, false);
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            jQuery(document).ready(function() {\n");
      out.write("                Layout.init();    \n");
      out.write("                Layout.initOWL();\n");
      out.write("                Layout.initImageZoom();\n");
      out.write("                Layout.initTouchspin();\n");
      out.write("                Layout.initTwitter();\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <!-- END PAGE LEVEL JAVASCRIPTS -->\n");
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
