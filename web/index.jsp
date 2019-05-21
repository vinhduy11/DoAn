<%-- 
    Document   : index
    Created on : May 8, 2019, 9:50:44 PM
    Author     : vinhd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="template/header.jsp" /> 
    
    <!-- Body BEGIN -->
    <body class="ecommerce">
        
        <jsp:include page="template/topbar.jsp" />
        <jsp:include page="template/navbar.jsp" />

        <!-- BEGIN SLIDER -->
        <div class="page-slider margin-bottom-35">
            <div id="carousel-example-generic" class="carousel slide carousel-slider">
                <!-- Indicators -->
                <ol class="carousel-indicators">
                    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
                    <li data-target="#carousel-example-generic" data-slide-to="3"></li>
                </ol>

                <!-- Wrapper for slides -->
                <div class="carousel-inner" role="listbox">
                    <!-- First slide -->
                    <div class="item carousel-item-four active">
                        <div class="container">
                            <div class="carousel-position-four text-center">
                                <h2 class="margin-bottom-20 animate-delay carousel-title-v3 border-bottom-title text-uppercase" data-animation="animated fadeInDown">
                                    Tones of <br/><span class="color-red-v2">Shop UI Features</span><br/> designed
                                </h2>
                                <p class="carousel-subtitle-v2" data-animation="animated fadeInUp">Lorem ipsum dolor sit amet constectetuer diam <br/>
                                adipiscing elit euismod ut laoreet dolore.</p>
                            </div>
                        </div>
                    </div>

                    <!-- Second slide -->
                    <div class="item carousel-item-five">
                        <div class="container">
                            <div class="carousel-position-four text-center">
                                <h2 class="animate-delay carousel-title-v4" data-animation="animated fadeInDown">
                                    Unlimted
                                </h2>
                                <p class="carousel-subtitle-v2" data-animation="animated fadeInDown">
                                    Layout Options
                                </p>
                                <p class="carousel-subtitle-v3 margin-bottom-30" data-animation="animated fadeInUp">
                                    Fully Responsive
                                </p>
                                <a class="carousel-btn" href="#" data-animation="animated fadeInUp">See More Details</a>
                            </div>
                            <img class="carousel-position-five animate-delay hidden-sm hidden-xs" src="assets/pages/img/shop-slider/slide2/price.png" alt="Price" data-animation="animated zoomIn">
                        </div>
                    </div>

                    <!-- Third slide -->
                    <div class="item carousel-item-six">
                        <div class="container">
                            <div class="carousel-position-four text-center">
                                <span class="carousel-subtitle-v3 margin-bottom-15" data-animation="animated fadeInDown">
                                    Full Admin &amp; Frontend
                                </span>
                                <p class="carousel-subtitle-v4" data-animation="animated fadeInDown">
                                    eCommerce UI
                                </p>
                                <p class="carousel-subtitle-v3" data-animation="animated fadeInDown">
                                    Is Ready For Your Project
                                </p>
                            </div>
                        </div>
                    </div>

                    <!-- Fourth slide -->
                    <div class="item carousel-item-seven">
                       <div class="center-block">
                            <div class="center-block-wrap">
                                <div class="center-block-body">
                                    <h2 class="carousel-title-v1 margin-bottom-20" data-animation="animated fadeInDown">
                                        The most <br/>
                                        wanted bijouterie
                                    </h2>
                                    <a class="carousel-btn" href="#" data-animation="animated fadeInUp">But It Now!</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <!-- Controls -->
                <a class="left carousel-control carousel-control-shop" href="#carousel-example-generic" role="button" data-slide="prev">
                    <i class="fa fa-angle-left" aria-hidden="true"></i>
                </a>
                <a class="right carousel-control carousel-control-shop" href="#carousel-example-generic" role="button" data-slide="next">
                    <i class="fa fa-angle-right" aria-hidden="true"></i>
                </a>
            </div>
        </div>
        <!-- END SLIDER -->

        <div class="main">
          <div class="container">
            <!-- BEGIN SALE PRODUCT & NEW ARRIVALS -->
            <div class="row margin-bottom-40">
              <!-- BEGIN SALE PRODUCT -->
              <div class="col-md-12 sale-product">
                <h2>New Arrivals</h2>
                <div class="owl-carousel owl-carousel5">
                  <div>
                    <div class="product-item">
                      <div class="pi-img-wrapper">
                        <img src="assets/pages/img/products/model1.jpg" class="img-responsive" alt="Berry Lace Dress">
                        <div>
                          <a href="assets/pages/img/products/model1.jpg" class="btn btn-default fancybox-button">Zoom</a>
                          <a href="#product-pop-up" class="btn btn-default fancybox-fast-view">View</a>
                        </div>
                      </div>
                      <h3><a href="shop-item.html">Berry Lace Dress</a></h3>
                      <div class="pi-price">$29.00</div>
                      <a href="javascript:;" class="btn btn-default add2cart">Add to cart</a>
                      <div class="sticker sticker-sale"></div>
                    </div>
                  </div>
                  <div>
                    <div class="product-item">
                      <div class="pi-img-wrapper">
                        <img src="assets/pages/img/products/model2.jpg" class="img-responsive" alt="Berry Lace Dress">
                        <div>
                          <a href="assets/pages/img/products/model2.jpg" class="btn btn-default fancybox-button">Zoom</a>
                          <a href="#product-pop-up" class="btn btn-default fancybox-fast-view">View</a>
                        </div>
                      </div>
                      <h3><a href="shop-item.html">Berry Lace Dress2</a></h3>
                      <div class="pi-price">$29.00</div>
                      <a href="javascript:;" class="btn btn-default add2cart">Add to cart</a>
                    </div>
                  </div>
                  <div>
                    <div class="product-item">
                      <div class="pi-img-wrapper">
                        <img src="assets/pages/img/products/model6.jpg" class="img-responsive" alt="Berry Lace Dress">
                        <div>
                          <a href="assets/pages/img/products/model6.jpg" class="btn btn-default fancybox-button">Zoom</a>
                          <a href="#product-pop-up" class="btn btn-default fancybox-fast-view">View</a>
                        </div>
                      </div>
                      <h3><a href="shop-item.html">Berry Lace Dress2</a></h3>
                      <div class="pi-price">$29.00</div>
                      <a href="javascript:;" class="btn btn-default add2cart">Add to cart</a>
                    </div>
                  </div>
                  <div>
                      <div class="product-item">
                        <div class="pi-img-wrapper">
                          <img src="assets/pages/img/products/model4.jpg" class="img-responsive" alt="Berry Lace Dress">
                          <div>
                            <a href="assets/pages/img/products/model4.jpg" class="btn btn-default fancybox-button">Zoom</a>
                            <a href="#product-pop-up" class="btn btn-default fancybox-fast-view">View</a>
                          </div>
                        </div>
                        <h3><a href="javascript:;">Berry Lace Dress4</a></h3>
                        <div class="pi-price">$29.00</div>
                        <a href="javascript:;" class="btn btn-default add2cart">Add to cart</a>
                        <div class="sticker sticker-new"></div>
                      </div>
                  </div>
                  <div>
                    <div class="product-item">
                      <div class="pi-img-wrapper">
                        <img src="assets/pages/img/products/model5.jpg" class="img-responsive" alt="Berry Lace Dress">
                        <div>
                          <a href="assets/pages/img/products/model5.jpg" class="btn btn-default fancybox-button">Zoom</a>
                          <a href="#product-pop-up" class="btn btn-default fancybox-fast-view">View</a>
                        </div>
                      </div>
                      <h3><a href="shop-item.html">Berry Lace Dress5</a></h3>
                      <div class="pi-price">$29.00</div>
                      <a href="javascript:;" class="btn btn-default add2cart">Add to cart</a>
                    </div>
                  </div>
                  <div>
                    <div class="product-item">
                      <div class="pi-img-wrapper">
                        <img src="assets/pages/img/products/model3.jpg" class="img-responsive" alt="Berry Lace Dress">
                        <div>
                          <a href="assets/pages/img/products/model3.jpg" class="btn btn-default fancybox-button">Zoom</a>
                          <a href="#product-pop-up" class="btn btn-default fancybox-fast-view">View</a>
                        </div>
                      </div>
                      <h3><a href="shop-item.html">Berry Lace Dress3</a></h3>
                      <div class="pi-price">$29.00</div>
                      <a href="javascript:;" class="btn btn-default add2cart">Add to cart</a>
                    </div>
                  </div>
                  <div>
                    <div class="product-item">
                      <div class="pi-img-wrapper">
                        <img src="assets/pages/img/products/model7.jpg" class="img-responsive" alt="Berry Lace Dress">
                        <div>
                          <a href="assets/pages/img/products/model7.jpg" class="btn btn-default fancybox-button">Zoom</a>
                          <a href="#product-pop-up" class="btn btn-default fancybox-fast-view">View</a>
                        </div>
                      </div>
                      <h3><a href="shop-item.html">Berry Lace Dress3</a></h3>
                      <div class="pi-price">$29.00</div>
                      <a href="javascript:;" class="btn btn-default add2cart">Add to cart</a>
                    </div>
                  </div>
                </div>
              </div>
              <!-- END SALE PRODUCT -->
            </div>
            <!-- END SALE PRODUCT & NEW ARRIVALS -->

            <!-- BEGIN SIDEBAR & CONTENT -->
            <div class="row margin-bottom-40 ">
              <!-- BEGIN SIDEBAR -->
              <div class="sidebar col-md-3 col-sm-4">
                <ul class="list-group margin-bottom-25 sidebar-menu">
                    <li class="list-group-item clearfix"><a href="/DoAn/Product?category=0&page=1&recordsPerPage=5"><i class="fa fa-angle-right"></i> Tất cả</a></li>
                    <li class="list-group-item clearfix"><a href="/DoAn/Product?category=7&page=1&recordsPerPage=5"><i class="fa fa-angle-right"></i> Áo</a></li>
                    <li class="list-group-item clearfix"><a href="/DoAn/Product?category=4&page=1&recordsPerPage=5"><i class="fa fa-angle-right"></i> Quần</a></li>
                    <li class="list-group-item clearfix"><a href="/DoAn/Product?category=8&page=1&recordsPerPage=5"><i class="fa fa-angle-right"></i> Phụ kiện</a></li>
                </ul>
              </div>
              <!-- END SIDEBAR -->
              <!-- BEGIN CONTENT -->
              <div class="col-md-9 col-sm-8">
                <h2>Three items</h2>
                <div class="owl-carousel owl-carousel3">
                  <div>
                    <div class="product-item">
                      <div class="pi-img-wrapper">
                        <img src="assets/pages/img/products/k1.jpg" class="img-responsive" alt="Berry Lace Dress">
                        <div>
                          <a href="assets/pages/img/products/k1.jpg" class="btn btn-default fancybox-button">Zoom</a>
                          <a href="#product-pop-up" class="btn btn-default fancybox-fast-view">View</a>
                        </div>
                      </div>
                      <h3><a href="shop-item.html">Berry Lace Dress</a></h3>
                      <div class="pi-price">$29.00</div>
                      <a href="javascript:;" class="btn btn-default add2cart">Add to cart</a>
                      <div class="sticker sticker-new"></div>
                    </div>
                  </div>
                  <div>
                    <div class="product-item">
                      <div class="pi-img-wrapper">
                        <img src="assets/pages/img/products/k2.jpg" class="img-responsive" alt="Berry Lace Dress">
                        <div>
                          <a href="assets/pages/img/products/k2.jpg" class="btn btn-default fancybox-button">Zoom</a>
                          <a href="#product-pop-up" class="btn btn-default fancybox-fast-view">View</a>
                        </div>
                      </div>
                      <h3><a href="shop-item.html">Berry Lace Dress2</a></h3>
                      <div class="pi-price">$29.00</div>
                      <a href="javascript:;" class="btn btn-default add2cart">Add to cart</a>
                    </div>
                  </div>
                  <div>
                    <div class="product-item">
                      <div class="pi-img-wrapper">
                        <img src="assets/pages/img/products/k3.jpg" class="img-responsive" alt="Berry Lace Dress">
                        <div>
                          <a href="assets/pages/img/products/k3.jpg" class="btn btn-default fancybox-button">Zoom</a>
                          <a href="#product-pop-up" class="btn btn-default fancybox-fast-view">View</a>
                        </div>
                      </div>
                      <h3><a href="shop-item.html">Berry Lace Dress3</a></h3>
                      <div class="pi-price">$29.00</div>
                      <a href="javascript:;" class="btn btn-default add2cart">Add to cart</a>
                    </div>
                  </div>
                  <div>
                    <div class="product-item">
                      <div class="pi-img-wrapper">
                        <img src="assets/pages/img/products/k4.jpg" class="img-responsive" alt="Berry Lace Dress">
                        <div>
                          <a href="assets/pages/img/products/k4.jpg" class="btn btn-default fancybox-button">Zoom</a>
                          <a href="#product-pop-up" class="btn btn-default fancybox-fast-view">View</a>
                        </div>
                      </div>
                      <h3><a href="shop-item.html">Berry Lace Dress4</a></h3>
                      <div class="pi-price">$29.00</div>
                      <a href="javascript:;" class="btn btn-default add2cart">Add to cart</a>
                      <div class="sticker sticker-sale"></div>
                    </div>
                  </div>
                  <div>
                    <div class="product-item">
                      <div class="pi-img-wrapper">
                        <img src="assets/pages/img/products/k1.jpg" class="img-responsive" alt="Berry Lace Dress">
                        <div>
                          <a href="assets/pages/img/products/k1.jpg" class="btn btn-default fancybox-button">Zoom</a>
                          <a href="#product-pop-up" class="btn btn-default fancybox-fast-view">View</a>
                        </div>
                      </div>
                      <h3><a href="shop-item.html">Berry Lace Dress5</a></h3>
                      <div class="pi-price">$29.00</div>
                      <a href="javascript:;" class="btn btn-default add2cart">Add to cart</a>
                    </div>
                  </div>
                  <div>
                    <div class="product-item">
                      <div class="pi-img-wrapper">
                        <img src="assets/pages/img/products/k2.jpg" class="img-responsive" alt="Berry Lace Dress">
                        <div>
                          <a href="assets/pages/img/products/k2.jpg" class="btn btn-default fancybox-button">Zoom</a>
                          <a href="#product-pop-up" class="btn btn-default fancybox-fast-view">View</a>
                        </div>
                      </div>
                      <h3><a href="shop-item.html">Berry Lace Dress6</a></h3>
                      <div class="pi-price">$29.00</div>
                      <a href="javascript:;" class="btn btn-default add2cart">Add to cart</a>
                    </div>
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
            jQuery(document).ready(function() {
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
