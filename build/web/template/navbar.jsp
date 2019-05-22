<%-- 
    Document   : navbar
    Created on : May 9, 2019, 10:39:08 PM
    Author     : vinhd
--%>
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
      <div class="top-cart-info">
        <a href="javascript:void(0);" class="top-cart-info-count">3 items</a>
        <a href="javascript:void(0);" class="top-cart-info-value">$1260</a>
      </div>
      <i class="fa fa-shopping-cart"></i>

      <div class="top-cart-content-wrapper">
        <div class="top-cart-content">
          <ul class="scroller" style="height: 250px;">
            <li>
              <a href="shop-item.html"><img src="assets/pages/img/cart-img.jpg" alt="Rolex Classic Watch" width="37" height="34"></a>
              <span class="cart-content-count">x 1</span>
              <strong><a href="shop-item.html">Rolex Classic Watch</a></strong>
              <em>$1230</em>
              <a href="javascript:void(0);" class="del-goods">&nbsp;</a>
            </li>
            <li>
              <a href="shop-item.html"><img src="assets/pages/img/cart-img.jpg" alt="Rolex Classic Watch" width="37" height="34"></a>
              <span class="cart-content-count">x 1</span>
              <strong><a href="shop-item.html">Rolex Classic Watch</a></strong>
              <em>$1230</em>
              <a href="javascript:void(0);" class="del-goods">&nbsp;</a>
            </li>
            <li>
              <a href="shop-item.html"><img src="assets/pages/img/cart-img.jpg" alt="Rolex Classic Watch" width="37" height="34"></a>
              <span class="cart-content-count">x 1</span>
              <strong><a href="shop-item.html">Rolex Classic Watch</a></strong>
              <em>$1230</em>
              <a href="javascript:void(0);" class="del-goods">&nbsp;</a>
            </li>
            <li>
              <a href="shop-item.html"><img src="assets/pages/img/cart-img.jpg" alt="Rolex Classic Watch" width="37" height="34"></a>
              <span class="cart-content-count">x 1</span>
              <strong><a href="shop-item.html">Rolex Classic Watch</a></strong>
              <em>$1230</em>
              <a href="javascript:void(0);" class="del-goods">&nbsp;</a>
            </li>
            <li>
              <a href="shop-item.html"><img src="assets/pages/img/cart-img.jpg" alt="Rolex Classic Watch" width="37" height="34"></a>
              <span class="cart-content-count">x 1</span>
              <strong><a href="shop-item.html">Rolex Classic Watch</a></strong>
              <em>$1230</em>
              <a href="javascript:void(0);" class="del-goods">&nbsp;</a>
            </li>
            <li>
              <a href="shop-item.html"><img src="assets/pages/img/cart-img.jpg" alt="Rolex Classic Watch" width="37" height="34"></a>
              <span class="cart-content-count">x 1</span>
              <strong><a href="shop-item.html">Rolex Classic Watch</a></strong>
              <em>$1230</em>
              <a href="javascript:void(0);" class="del-goods">&nbsp;</a>
            </li>
            <li>
              <a href="shop-item.html"><img src="assets/pages/img/cart-img.jpg" alt="Rolex Classic Watch" width="37" height="34"></a>
              <span class="cart-content-count">x 1</span>
              <strong><a href="shop-item.html">Rolex Classic Watch</a></strong>
              <em>$1230</em>
              <a href="javascript:void(0);" class="del-goods">&nbsp;</a>
            </li>
            <li>
              <a href="shop-item.html"><img src="assets/pages/img/cart-img.jpg" alt="Rolex Classic Watch" width="37" height="34"></a>
              <span class="cart-content-count">x 1</span>
              <strong><a href="shop-item.html">Rolex Classic Watch</a></strong>
              <em>$1230</em>
              <a href="javascript:void(0);" class="del-goods">&nbsp;</a>
            </li>
          </ul>
          <div class="text-right">
            <a href="shop-shopping-cart.html" class="btn btn-default">View Cart</a>
            <a href="shop-checkout.html" class="btn btn-primary">Checkout</a>
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
