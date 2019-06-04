<%-- 
    Document   : navbar
    Created on : May 9, 2019, 10:39:08 PM
    Author     : vinhd
--%>
<%@page import="Models.Item"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>

<% 
    String url = request.getContextPath().toString();
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!-- BEGIN HEADER -->
<div class="header">
  <div class="container">
    <a class="site-logo" href="/DoAn"><img src="assets/corporate/img/logos/logo-shop-red.png" alt="Metronic Shop UI"></a>

    <a href="javascript:void(0);" class="mobi-toggler"><i class="fa fa-bars"></i></a>

    <!-- BEGIN CART -->
    <div class="top-cart-block">
        <%
                    HashMap<String, Item> carts = (HashMap<String, Item>) session.getAttribute("cart");
                    Integer cart_quantities = 0;
                    Integer cart_total_prices = 0;
        %>
      <div class="top-cart-info">
        <a href="javascript:void(0);" class="top-cart-info-count"></a>
        <a href="javascript:void(0);" class="top-cart-info-value"></a>
      </div>
      <i class="fa fa-shopping-cart"></i>

      <div class="top-cart-content-wrapper">
        <div class="top-cart-content">
          <ul class="scroller" style="height: 250px;">
            <%
                    if(carts != null)  {
                        
                        for (String i : carts.keySet()) {
                            Integer product_id = carts.get(i).getProduct().getProduct_id();
                            String product_name = carts.get(i).getProduct().getProduct_name();
                            String img_url = carts.get(i).getProduct().getImg_url();
                            Integer quantities = carts.get(i).getQuantity();
                            Integer price = carts.get(i).getProduct().getPrice();
                            Integer total_prices = quantities * price;
                            cart_total_prices += total_prices;
                            cart_quantities += carts.get(i).getQuantity();
            %>
                    <li>
                      <a href="shop-item.html"><img src="assets/imgs/<%=img_url%>" alt="<%=product_name%>" width="37" height="34"></a>
                      <span class="cart-content-count">x <%=quantities%></span>
                      <strong><a href="shop-item.html"><%=product_name%></a></strong>
                      <em><%=price%> VND</em>
                      <a onclick="removeProducttoCart(<%=product_id%>)" class="del-goods">&nbsp;</a>
                    </li>
            <%
                
                }}
            %>
          </ul>
          <div class="text-right">
            <a href="<%=url%>/carts.jsp" class="btn btn-default">View Cart</a>
            <a href="<%=url%>/carts.jsp" class="btn btn-primary">Checkout</a>
          </div>
        </div>
      </div>            
    </div>
    <!--END CART -->

    <!-- BEGIN NAVIGATION -->
    <div class="header-navigation">
      <ul>


        <li><a href="<%= url %>" target="">Trang chủ</a></li>
        <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" data-target="#" href="javascript:;">
            Sản phẩm

          </a>

          <!-- BEGIN DROPDOWN MENU -->
          <ul class="dropdown-menu">
            <li><a href="/DoAn/Product?category=0&page=1&recordsPerPage=5">Tất cả</a></li>
            <li><a href="/DoAn/Product?category=4&page=1&recordsPerPage=5">Quần</a></li>
            <li><a href="/DoAn/Product?category=7&page=1&recordsPerPage=5">Áo</a></li>
            <li><a href="/DoAn/Product?category=8&page=1&recordsPerPage=5">Phụ kiện</a></li>
          </ul>
          <!-- END DROPDOWN MENU -->
        </li>
        <li><a href="<%= url %>/about_us.jsp" target="">Giới thiệu</a></li>
        <li><a href="<%= url %>/contact_us.jsp" target="">Liên hệ</a></li>

        <!-- BEGIN TOP SEARCH -->
        <li class="menu-search">
          <span class="sep"></span>
          <i class="fa fa-search search-btn"></i>
          <div class="search-box">
            <form action="#">
              <div class="input-group">
                <input type="text" placeholder="Search" class="form-control">
                <span class="input-group-btn">
                  <button class="btn btn-primary" type="submit">Search</button>
                </span>
              </div>
            </form>
          </div> 
        </li>
        <!-- END TOP SEARCH -->
      </ul>
    </div>
    <!-- END NAVIGATION -->
  </div>
</div>
<!-- Header END -->
<script>
    function removeProducttoCart(productId) {
        if (productId > 0 && productId != undefined) {
            $.get("/DoAn/Cart", {"ProductId": productId, "Quantities": 0, "action": "remove"}, function(res){
                window.location.reload();
            });
        }
    }
    jQuery(document).ready(function() {
        $(".top-cart-info-count").html(<%=cart_quantities %> + " items");
        $(".top-cart-info-value").html(<%=cart_total_prices %> + " VND");
    });
</script>
