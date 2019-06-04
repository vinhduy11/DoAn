<%-- 
    Document   : footer
    Created on : May 9, 2019, 10:40:11 PM
    Author     : vinhd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
    String url = request.getContextPath().toString();
%>
<!-- BEGIN STEPS -->
<div class="steps-block steps-block-red">
  <div class="container">
    <div class="row">
      <div class="col-md-4 steps-block-col">
        <i class="fa fa-truck"></i>
        <div>
          <h2>Miễn phí chuyển hàng</h2>
          <em>Vận chuyển trong 3 ngày</em>
        </div>
        <span>&nbsp;</span>
      </div>
      <div class="col-md-4 steps-block-col">
        <i class="fa fa-gift"></i>
        <div>
          <h2>Quà tặng hàng ngày</h2>
          <em>3 phần quà may mắn cho khách hàng</em>
        </div>
        <span>&nbsp;</span>
      </div>
      <div class="col-md-4 steps-block-col">
        <i class="fa fa-phone"></i>
        <div>
          <h2>1900 5454</h2>
          <em>Chăm sóc khách hàng 24/7</em>
        </div>
      </div>
    </div>
  </div>
</div>
<!-- END STEPS -->

<!-- BEGIN PRE-FOOTER -->
<div class="pre-footer">
  <div class="container">
    <div class="row">
      <!-- BEGIN BOTTOM INFO BLOCK -->
      <div class="col-md-3 col-sm-6 pre-footer-col">
        <h2>Thông tin</h2>
        <ul class="list-unstyled">
          <li><i class="fa fa-angle-right"></i> <a href="<%= url %>/about_us.jsp">Giới thiệu</a></li>
          <li><i class="fa fa-angle-right"></i> <a href="<%= url %>/contact.jsp">Liên hệ</a></li>
        </ul>
      </div>
      <!-- END INFO BLOCK -->
      <!-- BEGIN BOTTOM INFO BLOCK -->
      <div class="col-md-3 col-sm-6 pre-footer-col">
        
      </div>
      <!-- END INFO BLOCK -->

      <!-- BEGIN BOTTOM INFO BLOCK -->
      <div class="col-md-3 col-sm-6 pre-footer-col">
        
      </div>
      <!-- END INFO BLOCK -->

      <!-- BEGIN BOTTOM CONTACTS -->
      <div class="col-md-3 col-sm-6 pre-footer-col">
        <h2>Thông tin liên hệ</h2>
        <address class="margin-bottom-40">
            <b>Công ty Super Shop S.G </b>
            <br>249 - Nguyễn Thị Minh Khai, phường Nguyễn Cư Trinh, Quận 1 
            <br>TP. Hồ Chí Minh - Việt Nam
            <br>Tel: 08 39 250 590 – 08 39 250 591 (Xin số 38 - Gặp bộ phận bán hàng qua mạng)
            <br>E-mail:  supershop@supershop.com.vn
        </address>
      </div>
      <!-- END BOTTOM CONTACTS -->
    </div>
    <hr>
    <div class="row">
      <!-- BEGIN SOCIAL ICONS -->
      <div class="col-md-6 col-sm-6">
        <ul class="social-icons">
          <li><a class="rss" data-original-title="rss" href="javascript:;"></a></li>
          <li><a class="facebook" data-original-title="facebook" href="javascript:;"></a></li>
          <li><a class="twitter" data-original-title="twitter" href="javascript:;"></a></li>
          <li><a class="googleplus" data-original-title="googleplus" href="javascript:;"></a></li>
          <li><a class="linkedin" data-original-title="linkedin" href="javascript:;"></a></li>
          <li><a class="youtube" data-original-title="youtube" href="javascript:;"></a></li>
          <li><a class="vimeo" data-original-title="vimeo" href="javascript:;"></a></li>
          <li><a class="skype" data-original-title="skype" href="javascript:;"></a></li>
        </ul>
      </div>
      <!-- END SOCIAL ICONS -->
      <!-- BEGIN NEWLETTER -->
      <div class="col-md-6 col-sm-6">
        <div class="pre-footer-subscribe-box pull-right">
          <h2>Newsletter</h2>
          <form action="#">
            <div class="input-group">
              <input type="text" placeholder="youremail@mail.com" class="form-control">
              <span class="input-group-btn">
                <button class="btn btn-primary" type="submit">Subscribe</button>
              </span>
            </div>
          </form>
        </div> 
      </div>
      <!-- END NEWLETTER -->
    </div>
  </div>
</div>
<!-- END PRE-FOOTER -->

<!-- BEGIN FOOTER -->
<div class="footer">
  <div class="container">
    <div class="row">
      <!-- BEGIN COPYRIGHT -->
      <div class="col-md-4 col-sm-4 padding-top-10">
        2015 © Keenthemes. ALL Rights Reserved. 
      </div>
      <!-- END COPYRIGHT -->
      <!-- BEGIN PAYMENTS -->
      <div class="col-md-4 col-sm-4">
        <ul class="list-unstyled list-inline pull-right">
          <li><img src="assets/corporate/img/payments/western-union.jpg" alt="We accept Western Union" title="We accept Western Union"></li>
          <li><img src="assets/corporate/img/payments/american-express.jpg" alt="We accept American Express" title="We accept American Express"></li>
          <li><img src="assets/corporate/img/payments/MasterCard.jpg" alt="We accept MasterCard" title="We accept MasterCard"></li>
          <li><img src="assets/corporate/img/payments/PayPal.jpg" alt="We accept PayPal" title="We accept PayPal"></li>
          <li><img src="assets/corporate/img/payments/visa.jpg" alt="We accept Visa" title="We accept Visa"></li>
        </ul>
      </div>
      <!-- END PAYMENTS -->
      <!-- BEGIN POWERED -->
      <div class="col-md-4 col-sm-4 text-right">
        <p class="powered">Powered by: <a href="http://www.keenthemes.com/">KeenThemes.com</a></p>
      </div>
      <!-- END POWERED -->
    </div>
  </div>
</div>
<!-- END FOOTER -->



<!-- Load javascripts at bottom, this will reduce page load time -->
<!-- BEGIN CORE PLUGINS (REQUIRED FOR ALL PAGES) -->
<!--[if lt IE 9]>
<script src="assets/plugins/respond.min.js"></script>  
<![endif]-->


<!-- BEGIN PAGE LEVEL JAVASCRIPTS (REQUIRED ONLY FOR CURRENT PAGE) -->
<script src="assets/plugins/fancybox/source/jquery.fancybox.pack.js" type="text/javascript"></script><!-- pop up -->
<script src="assets/plugins/owl.carousel/owl.carousel.min.js" type="text/javascript"></script><!-- slider for products -->
<script src='assets/plugins/zoom/jquery.zoom.min.js' type="text/javascript"></script><!-- product zoom -->
<script src="assets/plugins/bootstrap-touchspin/bootstrap.touchspin.js" type="text/javascript"></script><!-- Quantity -->

<script src="assets/corporate/scripts/layout.js" type="text/javascript"></script>
<script src="assets/pages/scripts/bs-carousel.js" type="text/javascript"></script>

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
