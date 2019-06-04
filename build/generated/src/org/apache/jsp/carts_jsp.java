package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Models.Item;
import java.util.HashMap;

public final class carts_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 
    String url = request.getContextPath().toString();

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
      out.write("        <div class=\"container\">\n");
      out.write("          <!-- BEGIN SIDEBAR & CONTENT -->\n");
      out.write("          <div class=\"row margin-bottom-40\">\n");
      out.write("            <!-- BEGIN CONTENT -->\n");
      out.write("            <div class=\"col-md-12 col-sm-12\">\n");
      out.write("              <h1>Shopping cart</h1>\n");
      out.write("              <form method=\"post\" action=\"Checkout\">\n");
      out.write("              <div class=\"goods-page\">\n");
      out.write("                <div class=\"goods-data clearfix\">\n");
      out.write("                  <div class=\"table-wrapper-responsive\">\n");
      out.write("                  <table summary=\"Shopping cart\">\n");
      out.write("                    <tr>\n");
      out.write("                      <th class=\"goods-page-image\">Image</th>\n");
      out.write("                      <th class=\"goods-page-description\">Description</th>\n");
      out.write("                      <th class=\"goods-page-ref-no\">Ref No</th>\n");
      out.write("                      <th class=\"goods-page-price\">Unit price</th>\n");
      out.write("                      <th class=\"goods-page-price\">Quantities</th>\n");
      out.write("                      <th class=\"goods-page-total\" colspan=\"2\">Total</th>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        HashMap<String, Item> carts = (HashMap<String, Item>) session.getAttribute("cart");
                        Integer cart_quantities = 0;
                        Integer cart_total_prices = 0;

                        if(carts != null)  {
                            cart_quantities = carts.size();
                            for (String i : carts.keySet()) {
                                Long order_id = carts.get(i).getOrderId();
                                Integer product_id = carts.get(i).getProduct().getProduct_id();
                                String product_name = carts.get(i).getProduct().getProduct_name();
                                String img_url = carts.get(i).getProduct().getImg_url();
                                Integer quantities = carts.get(i).getQuantity();
                                Integer price = carts.get(i).getProduct().getPrice();
                                Integer total_prices = quantities * price;
                                cart_total_prices += total_prices;
                                cart_quantities += carts.get(i).getQuantity();
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                      <td class=\"goods-page-image\">\n");
      out.write("                        <a href=\"javascript:;\"><img src=\"assets/imgs/");
      out.print(img_url);
      out.write("\" alt=\"");
      out.print(product_name);
      out.write("\"></a>\n");
      out.write("                      </td>\n");
      out.write("                      <td class=\"goods-page-description\">\n");
      out.write("                        <h3><a href=\"javascript:;\">");
      out.print(product_name);
      out.write("</a></h3>\n");
      out.write("                      </td>\n");
      out.write("                      <td class=\"goods-page-ref-no\">\n");
      out.write("                        ");
      out.print(order_id);
      out.write("\n");
      out.write("                      </td>\n");
      out.write("                      <td class=\"goods-page-price\">\n");
      out.write("                        <strong>");
      out.print(price);
      out.write(" <span> VND</span></strong>\n");
      out.write("                      </td>\n");
      out.write("                      <td class=\"goods-page-quantity\">\n");
      out.write("                        <div class=\"product-quantity\">\n");
      out.write("                            <input id=\"product-quantity\" type=\"text\" value=\"");
      out.print(quantities);
      out.write("\" disabled=\"\" class=\"form-control input-sm\">\n");
      out.write("                        </div>\n");
      out.write("                      </td>\n");
      out.write("                      <td class=\"goods-page-total\">\n");
      out.write("                        <strong>");
      out.print(total_prices);
      out.write(" <span> VND</span></strong>\n");
      out.write("                      </td>\n");
      out.write("                      <td class=\"del-goods-col\">\n");
      out.write("                          <a class=\"del-goods\" onclick=\"removeProducttoCart(");
      out.print(carts.get(i).getProduct().getProduct_id());
      out.write(")\">&nbsp;</a>\n");
      out.write("                      </td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
 }} 
      out.write("\n");
      out.write("                  </table>\n");
      out.write("                  </div>\n");
      out.write("\n");
      out.write("                  <div class=\"shopping-total\">\n");
      out.write("                    <ul>\n");
      out.write("                      <li>\n");
      out.write("                        <em>Sub total</em>\n");
      out.write("                        <strong class=\"price\">");
      out.print(cart_total_prices);
      out.write(" <span> VND</span></strong>\n");
      out.write("                      </li>\n");
      out.write("                      <li>\n");
      out.write("                        <em>Shipping cost</em>\n");
      out.write("                        <strong class=\"price\">0 <span> VND</span></strong>\n");
      out.write("                      </li>\n");
      out.write("                      <li class=\"shopping-total-price\">\n");
      out.write("                        <em>Total</em>\n");
      out.write("                        <strong class=\"price\">");
      out.print(cart_total_prices);
      out.write(" <span> VND</span></strong>\n");
      out.write("                      </li>\n");
      out.write("                    </ul>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <a class=\"btn btn-default\" href=\"http://localhost:8080/DoAn/Product?category=0&page=1&recordsPerPage=5\">Continue shopping <i class=\"fa fa-shopping-cart\"></i></a>\n");
      out.write("                <button class=\"btn btn-primary\" type=\"submit\">Checkout <i class=\"fa fa-check\"></i></button>\n");
      out.write("              </div>\n");
      out.write("              </form>\n");
      out.write("            </div>\n");
      out.write("            <!-- END CONTENT -->\n");
      out.write("          </div>\n");
      out.write("          <!-- END SIDEBAR & CONTENT -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("        <script src=\"https://www.paypal.com/sdk/js?client-id=SB_CLIENT_ID\">\n");
      out.write("        </script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function removeProducttoCart(productId) {\n");
      out.write("                if (productId > 0 && productId != undefined) {\n");
      out.write("                    $.get(\"/DoAn/Cart\", {\"ProductId\": productId, \"Quantities\": 0, \"action\": \"remove\"}, function(res){\n");
      out.write("                        if (res === \"no session\") {\n");
      out.write("                            window.location.href = \"");
      out.print(url);
      out.write("/login.jsp\";\n");
      out.write("                        } else {\n");
      out.write("                            window.location.reload();\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
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
