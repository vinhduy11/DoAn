package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_end_begin;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_forEach_var_end_begin.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_when_test.release();
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
      out.write("            <li class=\"active\">Men category</li>\n");
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
      out.write("          <!-- BEGIN CONTENT -->\n");
      out.write("          <div class=\"col-md-9 col-sm-7\">\n");
      out.write("            <div class=\"row list-view-sorting clearfix\">\n");
      out.write("              <div class=\"col-md-2 col-sm-2 list-view\">\n");
      out.write("                <a href=\"javascript:;\"><i class=\"fa fa-th-large\"></i></a>\n");
      out.write("                <a href=\"javascript:;\"><i class=\"fa fa-th-list\"></i></a>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-md-10 col-sm-10\">\n");
      out.write("\n");
      out.write("                    <div class=\"pull-right\">\n");
      out.write("                        <label class=\"control-label\">Show:</label>\n");
      out.write("                        <select class=\"form-control input-sm\" id=\"limitSelect\">\n");
      out.write("                          <option value=\"5\">5</option>\n");
      out.write("                          <option value=\"10\">10</option>\n");
      out.write("                          <option value=\"20\">20</option>\n");
      out.write("                          <option value=\"30\">30</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                \n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- BEGIN PRODUCT LIST -->\n");
      out.write("            <div class=\"row product-list\">\n");
      out.write("              <!-- PRODUCT ITEM START -->\n");
      out.write("              ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("            <!-- BEGIN PAGINATOR -->\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-md-4 col-sm-4 items-info\">Items ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${from}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" to ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${to}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" of ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" total</div>\n");
      out.write("              <div class=\"col-md-8 col-sm-8\">\n");
      out.write("                <ul class=\"pagination pull-right\">\n");
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </ul>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- END PAGINATOR -->\n");
      out.write("          </div>\n");
      out.write("          <!-- END CONTENT -->\n");
      out.write("        </div>\n");
      out.write("        <!-- END SIDEBAR & CONTENT -->\n");
      out.write("      </div>\n");
      out.write("</div>\n");
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
      out.write("            \n");
      out.write("            function saveProducttoCart(productId) {\n");
      out.write("                if (productId > 0 && productId != undefined) {\n");
      out.write("                    $.get(\"/DoAn/Cart\", {\"ProductId\": productId, \"Quantities\": 1, \"action\": \"add\"}, function(res){\n");
      out.write("                        window.location.reload();\n");
      out.write("                    });\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            jQuery(document).ready(function() {                \n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("item");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${products}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                  <div class=\"col-md-4 col-sm-6 col-xs-12\">\n");
          out.write("                <div class=\"product-item\">\n");
          out.write("                  <div class=\"pi-img-wrapper\">\n");
          out.write("                    <img src=\"assets/imgs/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.getImg_url()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"img-responsive\" alt=\"Berry Lace Dress\">\n");
          out.write("                    <div>\n");
          out.write("                      <a href=\"assets/imgs/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.getImg_url()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-default fancybox-button\">Zoom</a>\n");
          out.write("                      <a href=\"/DoAn/Item?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.getProduct_id()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-default fancybox-fast-view\">View</a>\n");
          out.write("                    </div>\n");
          out.write("                  </div>\n");
          out.write("                  <h3><a href=\"shop-item.html\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.getProduct_name()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h3>\n");
          out.write("                  <div class=\"pi-price\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.getPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</div>\n");
          out.write("                  <a onclick=\"saveProducttoCart(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.getProduct_id()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(")\" class=\"btn btn-default add2cart\">Add to cart</a>\n");
          out.write("                </div>\n");
          out.write("              </div>\n");
          out.write("              <!-- PRODUCT ITEM END -->\n");
          out.write("                    \n");
          out.write("              ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setBegin(1);
    _jspx_th_c_forEach_1.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${noOfPages}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_c_forEach_1.setVar("i");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        ");
          if (_jspx_meth_c_choose_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_end_begin.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_choose_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentPage eq i}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <li><span>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span></li>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <li><a\n");
        out.write("                                    href=\"Product?category=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("&page=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("&recordsPerPage=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${recordsPerPage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write('"');
        out.write('>');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>\n");
        out.write("                                </li>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }
}
