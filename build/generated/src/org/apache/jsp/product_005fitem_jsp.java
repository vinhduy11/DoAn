package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_005fitem_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
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
      out.write("        <div class=\"title-wrapper\">\n");
      out.write("      <div class=\"container\"><div class=\"container-inner\">\n");
      out.write("        <h1><span>MEN</span> CATEGORY</h1>\n");
      out.write("        <em>Over 4000 Items are available here</em>\n");
      out.write("      </div></div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("<div class=\"main\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <ul class=\"breadcrumb\">\n");
      out.write("            <li><a href=\"index.html\">Home</a></li>\n");
      out.write("            <li><a href=\"\">Store</a></li>\n");
      out.write("            <li class=\"active\">Cool green dress with red bell</li>\n");
      out.write("        </ul>\n");
      out.write("        <!-- BEGIN SIDEBAR & CONTENT -->\n");
      out.write("        <div class=\"row margin-bottom-40\">\n");
      out.write("          <!-- BEGIN SIDEBAR -->\n");
      out.write("          <div class=\"sidebar col-md-3 col-sm-5\">\n");
      out.write("            <ul class=\"list-group margin-bottom-25 sidebar-menu\">\n");
      out.write("              <li class=\"list-group-item clearfix\"><a href=\"/DoAn/Product?category=0&page=1&recordsPerPage=5\"><i class=\"fa fa-angle-right\"></i> Tất cả</a></li>\n");
      out.write("              <li class=\"list-group-item clearfix\"><a href=\"/DoAn/Product?category=7&page=1&recordsPerPage=5\"><i class=\"fa fa-angle-right\"></i> Áo</a></li>\n");
      out.write("              <li class=\"list-group-item clearfix\"><a href=\"/DoAn/Product?category=4&page=1&recordsPerPage=5\"><i class=\"fa fa-angle-right\"></i> Quần</a></li>\n");
      out.write("              <li class=\"list-group-item clearfix\"><a href=\"/DoAn/Product?category=8&page=1&recordsPerPage=5\"><i class=\"fa fa-angle-right\"></i> Phụ kiện</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("          <!-- END SIDEBAR -->\n");
      out.write("\n");
      out.write("          <!-- BEGIN CONTENT -->\n");
      out.write("          <div class=\"col-md-9 col-sm-7\">\n");
      out.write("            <div class=\"product-page\">\n");
      out.write("              <div class=\"row\">\n");
      out.write("                <div class=\"col-md-6 col-sm-6\">\n");
      out.write("                  <div class=\"product-main-image\">\n");
      out.write("                    <img src=\"assets/pages/img/products/model7.jpg\" alt=\"Cool green dress with red bell\" class=\"img-responsive\" data-BigImgsrc=\"assets/pages/img/products/model7.jpg\">\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"product-other-images\">\n");
      out.write("                    <a href=\"assets/pages/img/products/model3.jpg\" class=\"fancybox-button\" rel=\"photos-lib\"><img alt=\"Berry Lace Dress\" src=\"assets/pages/img/products/model3.jpg\"></a>\n");
      out.write("                    <a href=\"assets/pages/img/products/model4.jpg\" class=\"fancybox-button\" rel=\"photos-lib\"><img alt=\"Berry Lace Dress\" src=\"assets/pages/img/products/model4.jpg\"></a>\n");
      out.write("                    <a href=\"assets/pages/img/products/model5.jpg\" class=\"fancybox-button\" rel=\"photos-lib\"><img alt=\"Berry Lace Dress\" src=\"assets/pages/img/products/model5.jpg\"></a>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6 col-sm-6\">\n");
      out.write("                  <h1>Cool green dress with red bell</h1>\n");
      out.write("                  <div class=\"price-availability-block clearfix\">\n");
      out.write("                    <div class=\"price\">\n");
      out.write("                      <strong><span>$</span>47.00</strong>\n");
      out.write("                      <em>$<span>62.00</span></em>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"availability\">\n");
      out.write("                      Availability: <strong>In Stock</strong>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"description\">\n");
      out.write("                    <p>Lorem ipsum dolor ut sit ame dolore  adipiscing elit, sed nonumy nibh sed euismod laoreet dolore magna aliquarm erat volutpat \n");
      out.write("Nostrud duis molestie at dolore.</p>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"product-page-options\">\n");
      out.write("                    <div class=\"pull-left\">\n");
      out.write("                      <label class=\"control-label\">Size:</label>\n");
      out.write("                      <select class=\"form-control input-sm\">\n");
      out.write("                        <option>L</option>\n");
      out.write("                        <option>M</option>\n");
      out.write("                        <option>XL</option>\n");
      out.write("                      </select>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"pull-left\">\n");
      out.write("                      <label class=\"control-label\">Color:</label>\n");
      out.write("                      <select class=\"form-control input-sm\">\n");
      out.write("                        <option>Red</option>\n");
      out.write("                        <option>Blue</option>\n");
      out.write("                        <option>Black</option>\n");
      out.write("                      </select>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"product-page-cart\">\n");
      out.write("                    <div class=\"product-quantity\">\n");
      out.write("                        <input id=\"product-quantity\" type=\"text\" value=\"1\" readonly class=\"form-control input-sm\">\n");
      out.write("                    </div>\n");
      out.write("                    <button class=\"btn btn-primary\" type=\"submit\">Add to cart</button>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"review\">\n");
      out.write("                    <input type=\"range\" value=\"4\" step=\"0.25\" id=\"backing4\">\n");
      out.write("                    <div class=\"rateit\" data-rateit-backingfld=\"#backing4\" data-rateit-resetable=\"false\"  data-rateit-ispreset=\"true\" data-rateit-min=\"0\" data-rateit-max=\"5\">\n");
      out.write("                    </div>\n");
      out.write("                    <a href=\"javascript:;\">7 reviews</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a href=\"javascript:;\">Write a review</a>\n");
      out.write("                  </div>\n");
      out.write("                  <ul class=\"social-icons\">\n");
      out.write("                    <li><a class=\"facebook\" data-original-title=\"facebook\" href=\"javascript:;\"></a></li>\n");
      out.write("                    <li><a class=\"twitter\" data-original-title=\"twitter\" href=\"javascript:;\"></a></li>\n");
      out.write("                    <li><a class=\"googleplus\" data-original-title=\"googleplus\" href=\"javascript:;\"></a></li>\n");
      out.write("                    <li><a class=\"evernote\" data-original-title=\"evernote\" href=\"javascript:;\"></a></li>\n");
      out.write("                    <li><a class=\"tumblr\" data-original-title=\"tumblr\" href=\"javascript:;\"></a></li>\n");
      out.write("                  </ul>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"product-page-content\">\n");
      out.write("                  <ul id=\"myTab\" class=\"nav nav-tabs\">\n");
      out.write("                    <li><a href=\"#Description\" data-toggle=\"tab\">Description</a></li>\n");
      out.write("                    <li><a href=\"#Information\" data-toggle=\"tab\">Information</a></li>\n");
      out.write("                    <li class=\"active\"><a href=\"#Reviews\" data-toggle=\"tab\">Reviews (2)</a></li>\n");
      out.write("                  </ul>\n");
      out.write("                  <div id=\"myTabContent\" class=\"tab-content\">\n");
      out.write("                    <div class=\"tab-pane fade\" id=\"Description\">\n");
      out.write("                      <p>Lorem ipsum dolor ut sit ame dolore  adipiscing elit, sed sit nonumy nibh sed euismod laoreet dolore magna aliquarm erat sit volutpat Nostrud duis molestie at dolore. Lorem ipsum dolor ut sit ame dolore  adipiscing elit, sed sit nonumy nibh sed euismod laoreet dolore magna aliquarm erat sit volutpat Nostrud duis molestie at dolore. Lorem ipsum dolor ut sit ame dolore  adipiscing elit, sed sit nonumy nibh sed euismod laoreet dolore magna aliquarm erat sit volutpat Nostrud duis molestie at dolore. </p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"tab-pane fade\" id=\"Information\">\n");
      out.write("                      <table class=\"datasheet\">\n");
      out.write("                        <tr>\n");
      out.write("                          <th colspan=\"2\">Additional features</th>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                          <td class=\"datasheet-features-type\">Value 1</td>\n");
      out.write("                          <td>21 cm</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                          <td class=\"datasheet-features-type\">Value 2</td>\n");
      out.write("                          <td>700 gr.</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                          <td class=\"datasheet-features-type\">Value 3</td>\n");
      out.write("                          <td>10 person</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                          <td class=\"datasheet-features-type\">Value 4</td>\n");
      out.write("                          <td>14 cm</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                          <td class=\"datasheet-features-type\">Value 5</td>\n");
      out.write("                          <td>plastic</td>\n");
      out.write("                        </tr>\n");
      out.write("                      </table>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"tab-pane fade in active\" id=\"Reviews\">\n");
      out.write("                      <!--<p>There are no reviews for this product.</p>-->\n");
      out.write("                      <div class=\"review-item clearfix\">\n");
      out.write("                        <div class=\"review-item-submitted\">\n");
      out.write("                          <strong>Bob</strong>\n");
      out.write("                          <em>30/12/2013 - 07:37</em>\n");
      out.write("                          <div class=\"rateit\" data-rateit-value=\"5\" data-rateit-ispreset=\"true\" data-rateit-readonly=\"true\"></div>\n");
      out.write("                        </div>                                              \n");
      out.write("                        <div class=\"review-item-content\">\n");
      out.write("                            <p>Sed velit quam, auctor id semper a, hendrerit eget justo. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Duis vel arcu pulvinar dolor tempus feugiat id in orci. Phasellus sed erat leo. Donec luctus, justo eget ultricies tristique, enim mauris bibendum orci, a sodales lectus purus ut lorem.</p>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"review-item clearfix\">\n");
      out.write("                        <div class=\"review-item-submitted\">\n");
      out.write("                          <strong>Mary</strong>\n");
      out.write("                          <em>13/12/2013 - 17:49</em>\n");
      out.write("                          <div class=\"rateit\" data-rateit-value=\"2.5\" data-rateit-ispreset=\"true\" data-rateit-readonly=\"true\"></div>\n");
      out.write("                        </div>                                              \n");
      out.write("                        <div class=\"review-item-content\">\n");
      out.write("                            <p>Sed velit quam, auctor id semper a, hendrerit eget justo. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Duis vel arcu pulvinar dolor tempus feugiat id in orci. Phasellus sed erat leo. Donec luctus, justo eget ultricies tristique, enim mauris bibendum orci, a sodales lectus purus ut lorem.</p>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("\n");
      out.write("                      <!-- BEGIN FORM-->\n");
      out.write("                      <form action=\"#\" class=\"reviews-form\" role=\"form\">\n");
      out.write("                        <h2>Write a review</h2>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                          <label for=\"name\">Name <span class=\"require\">*</span></label>\n");
      out.write("                          <input type=\"text\" class=\"form-control\" id=\"name\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                          <label for=\"email\">Email</label>\n");
      out.write("                          <input type=\"text\" class=\"form-control\" id=\"email\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                          <label for=\"review\">Review <span class=\"require\">*</span></label>\n");
      out.write("                          <textarea class=\"form-control\" rows=\"8\" id=\"review\"></textarea>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                          <label for=\"email\">Rating</label>\n");
      out.write("                          <input type=\"range\" value=\"4\" step=\"0.25\" id=\"backing5\">\n");
      out.write("                          <div class=\"rateit\" data-rateit-backingfld=\"#backing5\" data-rateit-resetable=\"false\"  data-rateit-ispreset=\"true\" data-rateit-min=\"0\" data-rateit-max=\"5\">\n");
      out.write("                          </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"padding-top-20\">                  \n");
      out.write("                          <button type=\"submit\" class=\"btn btn-primary\">Send</button>\n");
      out.write("                        </div>\n");
      out.write("                      </form>\n");
      out.write("                      <!-- END FORM--> \n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"sticker sticker-sale\"></div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <!-- END CONTENT -->\n");
      out.write("        </div>\n");
      out.write("        <!-- END SIDEBAR & CONTENT -->\n");
      out.write("\n");
      out.write("        <!-- BEGIN SIMILAR PRODUCTS -->\n");
      out.write("        <div class=\"row margin-bottom-40\">\n");
      out.write("          <div class=\"col-md-12 col-sm-12\">\n");
      out.write("            <h2>Most popular products</h2>\n");
      out.write("            <div class=\"owl-carousel owl-carousel4\">\n");
      out.write("              <div>\n");
      out.write("                <div class=\"product-item\">\n");
      out.write("                  <div class=\"pi-img-wrapper\">\n");
      out.write("                    <img src=\"assets/pages/img/products/k1.jpg\" class=\"img-responsive\" alt=\"Berry Lace Dress\">\n");
      out.write("                    <div>\n");
      out.write("                      <a href=\"assets/pages/img/products/k1.jpg\" class=\"btn btn-default fancybox-button\">Zoom</a>\n");
      out.write("                      <a href=\"#product-pop-up\" class=\"btn btn-default fancybox-fast-view\">View</a>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <h3><a href=\"shop-item.html\">Berry Lace Dress</a></h3>\n");
      out.write("                  <div class=\"pi-price\">$29.00</div>\n");
      out.write("                  <a href=\"javascript:;\" class=\"btn btn-default add2cart\">Add to cart</a>\n");
      out.write("                  <div class=\"sticker sticker-new\"></div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div>\n");
      out.write("                <div class=\"product-item\">\n");
      out.write("                  <div class=\"pi-img-wrapper\">\n");
      out.write("                    <img src=\"assets/pages/img/products/k2.jpg\" class=\"img-responsive\" alt=\"Berry Lace Dress\">\n");
      out.write("                    <div>\n");
      out.write("                      <a href=\"assets/pages/img/products/k2.jpg\" class=\"btn btn-default fancybox-button\">Zoom</a>\n");
      out.write("                      <a href=\"#product-pop-up\" class=\"btn btn-default fancybox-fast-view\">View</a>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <h3><a href=\"shop-item.html\">Berry Lace Dress2</a></h3>\n");
      out.write("                  <div class=\"pi-price\">$29.00</div>\n");
      out.write("                  <a href=\"javascript:;\" class=\"btn btn-default add2cart\">Add to cart</a>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div>\n");
      out.write("                <div class=\"product-item\">\n");
      out.write("                  <div class=\"pi-img-wrapper\">\n");
      out.write("                    <img src=\"assets/pages/img/products/k3.jpg\" class=\"img-responsive\" alt=\"Berry Lace Dress\">\n");
      out.write("                    <div>\n");
      out.write("                      <a href=\"assets/pages/img/products/k3.jpg\" class=\"btn btn-default fancybox-button\">Zoom</a>\n");
      out.write("                      <a href=\"#product-pop-up\" class=\"btn btn-default fancybox-fast-view\">View</a>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <h3><a href=\"shop-item.html\">Berry Lace Dress3</a></h3>\n");
      out.write("                  <div class=\"pi-price\">$29.00</div>\n");
      out.write("                  <a href=\"javascript:;\" class=\"btn btn-default add2cart\">Add to cart</a>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div>\n");
      out.write("                <div class=\"product-item\">\n");
      out.write("                  <div class=\"pi-img-wrapper\">\n");
      out.write("                    <img src=\"assets/pages/img/products/k4.jpg\" class=\"img-responsive\" alt=\"Berry Lace Dress\">\n");
      out.write("                    <div>\n");
      out.write("                      <a href=\"assets/pages/img/products/k4.jpg\" class=\"btn btn-default fancybox-button\">Zoom</a>\n");
      out.write("                      <a href=\"#product-pop-up\" class=\"btn btn-default fancybox-fast-view\">View</a>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <h3><a href=\"shop-item.html\">Berry Lace Dress4</a></h3>\n");
      out.write("                  <div class=\"pi-price\">$29.00</div>\n");
      out.write("                  <a href=\"javascript:;\" class=\"btn btn-default add2cart\">Add to cart</a>\n");
      out.write("                  <div class=\"sticker sticker-sale\"></div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div>\n");
      out.write("                <div class=\"product-item\">\n");
      out.write("                  <div class=\"pi-img-wrapper\">\n");
      out.write("                    <img src=\"assets/pages/img/products/k1.jpg\" class=\"img-responsive\" alt=\"Berry Lace Dress\">\n");
      out.write("                    <div>\n");
      out.write("                      <a href=\"assets/pages/img/products/k1.jpg\" class=\"btn btn-default fancybox-button\">Zoom</a>\n");
      out.write("                      <a href=\"#product-pop-up\" class=\"btn btn-default fancybox-fast-view\">View</a>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <h3><a href=\"shop-item.html\">Berry Lace Dress5</a></h3>\n");
      out.write("                  <div class=\"pi-price\">$29.00</div>\n");
      out.write("                  <a href=\"javascript:;\" class=\"btn btn-default add2cart\">Add to cart</a>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div>\n");
      out.write("                <div class=\"product-item\">\n");
      out.write("                  <div class=\"pi-img-wrapper\">\n");
      out.write("                    <img src=\"assets/pages/img/products/k2.jpg\" class=\"img-responsive\" alt=\"Berry Lace Dress\">\n");
      out.write("                    <div>\n");
      out.write("                      <a href=\"assets/pages/img/products/k2.jpg\" class=\"btn btn-default fancybox-button\">Zoom</a>\n");
      out.write("                      <a href=\"#product-pop-up\" class=\"btn btn-default fancybox-fast-view\">View</a>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <h3><a href=\"shop-item.html\">Berry Lace Dress6</a></h3>\n");
      out.write("                  <div class=\"pi-price\">$29.00</div>\n");
      out.write("                  <a href=\"javascript:;\" class=\"btn btn-default add2cart\">Add to cart</a>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- END SIMILAR PRODUCTS -->\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "template/footer.jsp", out, false);
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function limitSelect(){\n");
      out.write("                var recordsPerPage = $(\"#limitSelect\").val();\n");
      out.write("                var url = window.location.origin;\n");
      out.write("                var pathname = window.location.pathname;\n");
      out.write("                var urlParams = new URLSearchParams(window.location.search);\n");
      out.write("                var page = urlParams.get('page');\n");
      out.write("                var category = urlParams.get('category');\n");
      out.write("                var newURL = url+pathname+\"?category=\"+category+\"&recordsPerPage=\"+recordsPerPage+\"&page=\"+page;\n");
      out.write("                window.location = newURL;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            function setLimit(){\n");
      out.write("                var urlParams = new URLSearchParams(window.location.search);\n");
      out.write("                var recordsPerPage = urlParams.get('recordsPerPage');\n");
      out.write("                $(\"#limitSelect\").val(recordsPerPage);\n");
      out.write("            }\n");
      out.write("            jQuery(document).ready(function() {\n");
      out.write("                $(\"#limitSelect\").change(function (){\n");
      out.write("                    limitSelect();\n");
      out.write("                });\n");
      out.write("                setLimit();\n");
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
