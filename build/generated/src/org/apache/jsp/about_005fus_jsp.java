package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_005fus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("        <div class=\"main\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("              <ul class=\"breadcrumb\">\n");
      out.write("                  <li><a href=\"/DoAn/\">Trang chủ</a></li>\n");
      out.write("                  <li class=\"active\">Giới thiệu</li>\n");
      out.write("              </ul>\n");
      out.write("              <!-- BEGIN SIDEBAR & CONTENT -->\n");
      out.write("              <div class=\"row margin-bottom-40\">\n");
      out.write("\n");
      out.write("                <!-- BEGIN CONTENT -->\n");
      out.write("                <div class=\"col-md-9 col-sm-7\">\n");
      out.write("                  <h1>Giới thiệu cửa hàng</h1>\n");
      out.write("                  <div class=\"content-form-page\">\n");
      out.write("                      \n");
      out.write("                      <img src=\"assets/pages/img/posts/gioithieu.jpg\">\n");
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
