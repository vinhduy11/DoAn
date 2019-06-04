<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
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
            <li><a href="/DoAn">Home</a></li>
            <li class="active">${product.getProduct_name()}</li>
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
            <div class="product-page">
              <div class="row">
                <div class="col-md-6 col-sm-6">
                  <div class="product-main-image">
                    <img src="assets/imgs/${product.getImg_url()}" alt="Cool green dress with red bell" class="img-responsive" data-BigImgsrc="assets/imgs/${product.getImg_url()}">
                  </div>
                </div>
                <div class="col-md-6 col-sm-6">
                  <h1>${product.getProduct_name()}</h1>
                  <div class="price-availability-block clearfix">
                    <div class="price">
                      <strong>${product.getPrice()} <span>VND</span></strong>
                    </div>
                    <div class="availability">
                      Số lượng: <strong>${product.getQuantities()}</strong>
                    </div>
                  </div>
                  <div class="description">
                    <p>${product.getProduct_desc()}</p>
                  </div>
                  <div class="product-page-options">
                    <div class="pull-left">
                      <label class="control-label">Size:</label>
                      <select class="form-control input-sm">
                        <option>L</option>
                        <option>M</option>
                        <option>XL</option>
                      </select>
                    </div>
                    <div class="pull-left">
                      <label class="control-label">Color:</label>
                      <select class="form-control input-sm">
                        <option>Red</option>
                        <option>Blue</option>
                        <option>Black</option>
                      </select>
                    </div>
                  </div>
                  <div class="product-page-cart">
                    <div class="product-quantity">
                        <input id="quantity" type="text" value="1" readonly class="form-control input-sm">
                    </div>
                      <button class="btn btn-primary" onclick="saveProducttoCart(${product.getProduct_id()})">Add to cart</button>
                  </div>
                  <div class="review">
                    <input type="range" value="4" step="0.25" id="backing4">
                    <div class="rateit" data-rateit-backingfld="#backing4" data-rateit-resetable="false"  data-rateit-ispreset="true" data-rateit-min="0" data-rateit-max="5">
                    </div>
                    <a href="javascript:;">7 reviews</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="javascript:;">Write a review</a>
                  </div>
                  <ul class="social-icons">
                    <li><a class="facebook" data-original-title="facebook" href="javascript:;"></a></li>
                    <li><a class="twitter" data-original-title="twitter" href="javascript:;"></a></li>
                    <li><a class="googleplus" data-original-title="googleplus" href="javascript:;"></a></li>
                    <li><a class="evernote" data-original-title="evernote" href="javascript:;"></a></li>
                    <li><a class="tumblr" data-original-title="tumblr" href="javascript:;"></a></li>
                  </ul>
                </div>

                <div class="product-page-content">
                  <ul id="myTab" class="nav nav-tabs">
                    <li class="active"><a href="#Reviews" data-toggle="tab">Reviews (2)</a></li>
                  </ul>
                  <div id="myTabContent" class="tab-content">
                    <div class="tab-pane fade in active" id="Reviews">
                      <!--<p>There are no reviews for this product.</p>-->
                      <div class="review-item clearfix">
                        <div class="review-item-submitted">
                          <strong>Bob</strong>
                          <em>30/12/2013 - 07:37</em>
                          <div class="rateit" data-rateit-value="5" data-rateit-ispreset="true" data-rateit-readonly="true"></div>
                        </div>                                              
                        <div class="review-item-content">
                            <p>Sed velit quam, auctor id semper a, hendrerit eget justo. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Duis vel arcu pulvinar dolor tempus feugiat id in orci. Phasellus sed erat leo. Donec luctus, justo eget ultricies tristique, enim mauris bibendum orci, a sodales lectus purus ut lorem.</p>
                        </div>
                      </div>
                      <div class="review-item clearfix">
                        <div class="review-item-submitted">
                          <strong>Mary</strong>
                          <em>13/12/2013 - 17:49</em>
                          <div class="rateit" data-rateit-value="2.5" data-rateit-ispreset="true" data-rateit-readonly="true"></div>
                        </div>                                              
                        <div class="review-item-content">
                            <p>Sed velit quam, auctor id semper a, hendrerit eget justo. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Duis vel arcu pulvinar dolor tempus feugiat id in orci. Phasellus sed erat leo. Donec luctus, justo eget ultricies tristique, enim mauris bibendum orci, a sodales lectus purus ut lorem.</p>
                        </div>
                      </div>

                      <!-- BEGIN FORM-->
                      <form action="#" class="reviews-form" role="form">
                        <h2>Write a review</h2>
                        <div class="form-group">
                          <label for="name">Name <span class="require">*</span></label>
                          <input type="text" class="form-control" id="name">
                        </div>
                        <div class="form-group">
                          <label for="email">Email</label>
                          <input type="text" class="form-control" id="email">
                        </div>
                        <div class="form-group">
                          <label for="review">Review <span class="require">*</span></label>
                          <textarea class="form-control" rows="8" id="review"></textarea>
                        </div>
                        <div class="form-group">
                          <label for="email">Rating</label>
                          <input type="range" value="4" step="0.25" id="backing5">
                          <div class="rateit" data-rateit-backingfld="#backing5" data-rateit-resetable="false"  data-rateit-ispreset="true" data-rateit-min="0" data-rateit-max="5">
                          </div>
                        </div>
                        <div class="padding-top-20">                  
                          <button type="submit" class="btn btn-primary">Send</button>
                        </div>
                      </form>
                      <!-- END FORM--> 
                    </div>
                  </div>
                </div>

                <div class="sticker sticker-sale"></div>
              </div>
            </div>
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
                    $.get("/DoAn/Cart", {"ProductId": productId, "Quantities": quantities, "action": "add"}, function(res){
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
