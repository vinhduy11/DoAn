<%-- 
    Document   : view_product
    Created on : May 20, 2019, 10:44:14 PM
    Author     : vinhd
--%>
<%@page import="Models.Item"%>
<%@page import="java.util.HashMap"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<% 
    String url = request.getContextPath().toString();
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="template/header.jsp" /> 
    
    <!-- Body BEGIN -->
    <body class="ecommerce">
        
        <jsp:include page="template/topbar.jsp" />
        <jsp:include page="template/navbar.jsp" />
        <div class="title-wrapper">
      <div class="container"><div class="container-inner">
        <h1><span>MEN</span> CATEGORY</h1>
        <em>Over 4000 Items are available here</em>
      </div></div>
    </div>

<div class="main">
      <div class="container">
        <ul class="breadcrumb">
            <li><a href="index.html">Home</a></li>
            <li class="active">Men category</li>
        </ul>
        <!-- BEGIN SIDEBAR & CONTENT -->
        <div class="row margin-bottom-40">
          <!-- BEGIN SIDEBAR -->
          <div class="sidebar col-md-3 col-sm-5">
            <ul class="list-group margin-bottom-25 sidebar-menu">
              <li class="list-group-item clearfix"><a href="/DoAn/Product?category=0&page=1&recordsPerPage=5"><i class="fa fa-angle-right"></i> Tất cả</a></li>
              <li class="list-group-item clearfix"><a href="/DoAn/Product?category=7&page=1&recordsPerPage=5"><i class="fa fa-angle-right"></i> Áo</a></li>
              <li class="list-group-item clearfix"><a href="/DoAn/Product?category=4&page=1&recordsPerPage=5"><i class="fa fa-angle-right"></i> Quần</a></li>
              <li class="list-group-item clearfix"><a href="/DoAn/Product?category=8&page=1&recordsPerPage=5"><i class="fa fa-angle-right"></i> Phụ kiện</a></li>
            </ul>
          </div>
          <!-- END SIDEBAR -->
          <!-- BEGIN CONTENT -->
          <div class="col-md-9 col-sm-7">
            <div class="row list-view-sorting clearfix">
              <div class="col-md-2 col-sm-2 list-view">
                <a href="javascript:;"><i class="fa fa-th-large"></i></a>
                <a href="javascript:;"><i class="fa fa-th-list"></i></a>
              </div>
              <div class="col-md-10 col-sm-10">

                    <div class="pull-right">
                        <label class="control-label">Show:</label>
                        <select class="form-control input-sm" id="limitSelect">
                          <option value="5">5</option>
                          <option value="10">10</option>
                          <option value="20">20</option>
                          <option value="30">30</option>
                        </select>
                    </div>
                
              </div>
            </div>
            <!-- BEGIN PRODUCT LIST -->
            <div class="row product-list">
              <!-- PRODUCT ITEM START -->
              <c:forEach var="item" items="${products}">
                  <div class="col-md-4 col-sm-6 col-xs-12">
                <div class="product-item">
                  <div class="pi-img-wrapper">
                    <img src="assets/imgs/${item.getImg_url()}" class="img-responsive" alt="Berry Lace Dress">
                    <div>
                      <a href="assets/imgs/${item.getImg_url()}" class="btn btn-default fancybox-button">Zoom</a>
                      <a href="/DoAn/Item?id=${item.getProduct_id()}" class="btn btn-default fancybox-fast-view">View</a>
                    </div>
                  </div>
                  <h3><a href="shop-item.html">${item.getProduct_name()}</a></h3>
                  <div class="pi-price">${item.getPrice()}</div>
                  <a onclick="saveProducttoCart(${item.getProduct_id()})" class="btn btn-default add2cart">Add to cart</a>
                </div>
              </div>
              <!-- PRODUCT ITEM END -->
                    
              </c:forEach>
              
            </div>
            <!-- BEGIN PAGINATOR -->
            <div class="row">
              <div class="col-md-4 col-sm-4 items-info">Items ${from} to ${to} of ${total} total</div>
              <div class="col-md-8 col-sm-8">
                <ul class="pagination pull-right">

                    <c:forEach begin="1" end="${noOfPages}" var="i">
                        <c:choose>
                            <c:when test="${currentPage eq i}">
                                <li><span>${i}</span></li>
                            </c:when>
                            <c:otherwise>
                                <li><a
                                    href="Product?category=${category}&page=${i}&recordsPerPage=${recordsPerPage}">${i}</a>
                                </li>
                            </c:otherwise>
                        </c:choose>
                    </c:forEach>
                </ul>
              </div>
            </div>
            <!-- END PAGINATOR -->
          </div>
          <!-- END CONTENT -->
        </div>
        <!-- END SIDEBAR & CONTENT -->
      </div>
</div>
        
    <jsp:include page="template/footer.jsp" />
        <script type="text/javascript">
            function limitSelect(){
                var recordsPerPage = $("#limitSelect").val();
                var url = window.location.origin;
                var pathname = window.location.pathname;
                var urlParams = new URLSearchParams(window.location.search);
                var page = urlParams.get('page');
                var category = urlParams.get('category');
                var newURL = url+pathname+"?category="+category+"&recordsPerPage="+recordsPerPage+"&page="+page;
                window.location = newURL;
            }
            
            function setLimit(){
                var urlParams = new URLSearchParams(window.location.search);
                var recordsPerPage = urlParams.get('recordsPerPage');
                $("#limitSelect").val(recordsPerPage);
            }
            
            function saveProducttoCart(productId) {
                if (productId > 0 && productId != undefined) {
                    var quantities = $("#quantity").val();
                    $.get("/DoAn/Cart", {"ProductId": productId, "Quantities": 1, "action": "add"}, function(res){
                        if (res === "no session") {
                            window.location.href = "<%=url%>/login.jsp";
                        } else {
                            window.location.reload();
                        }
                    });
                }
            }
            
            jQuery(document).ready(function() {                
                $("#limitSelect").change(function (){
                    limitSelect();
                });
                setLimit();
                Layout.init();    
                Layout.initOWL();
                Layout.initImageZoom();
                Layout.initTouchspin();
                Layout.initTwitter();
            });
        </script>
        <!-- END PAGE LEVEL JAVASCRIPTS -->
    </body>
    <!-- END BODY -->
</html>
