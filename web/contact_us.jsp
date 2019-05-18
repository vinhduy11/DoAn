<%-- 
    Document   : register
    Created on : May 8, 2019, 9:58:07 PM
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

        <div class="main">
            <div class="container">
              <ul class="breadcrumb">
                  <li><a href="/DoAn/index.jsp">Trang chủ</a></li>
                  <li class="active">Liên hệ</li>
              </ul>
              <div class="row margin-bottom-40">
                <!-- BEGIN SIDEBAR -->
                <div class="sidebar col-md-3 col-sm-3">
                  <h2>Thông tin liên hệ</h2>
                  <address>
                    <b>Công ty Super Shop S.G </b>
                    <br>249 - Nguyễn Thị Minh Khai, phường Nguyễn Cư Trinh, Quận 1 
                    <br>TP. Hồ Chí Minh - Việt Nam
                    <br>Tel: 08 39 250 590 – 08 39 250 591 (Xin số 38 - Gặp bộ phận bán hàng qua mạng)
                  </address>
                  <address>
                    <strong>Email</strong><br>
                    <a href="mailto:supershop@supershop.com.vn">supershop@supershop.com.vn</a><br>
                  </address>
                  <ul class="social-icons margin-bottom-10">
                    <li><a href="javascript:;" data-original-title="facebook" class="facebook"></a></li>
                    <li><a href="javascript:;" data-original-title="github" class="github"></a></li>
                    <li><a href="javascript:;" data-original-title="Goole Plus" class="googleplus"></a></li>
                    <li><a href="javascript:;" data-original-title="linkedin" class="linkedin"></a></li>
                    <li><a href="javascript:;" data-original-title="rss" class="rss"></a></li>
                  </ul>
                </div>
                <!-- END SIDEBAR -->

                <!-- BEGIN CONTENT -->
                <div class="col-md-9 col-sm-9">
                  <h1>Liên hệ</h1>
                  <div class="content-page">

                    <!-- BEGIN FORM-->
                    <form action="#" class="default-form" role="form">
                      <div class="form-group">
                        <label for="name">Họ tên</label>
                        <input type="text" class="form-control" id="name">
                      </div>
                      <div class="form-group">
                        <label for="email">Email <span class="require">*</span></label>
                        <input type="text" class="form-control" id="email">
                      </div>
                      <div class="form-group">
                        <label for="message">Tin nhắn</label>
                        <textarea class="form-control" rows="8" id="message"></textarea>
                      </div>
                      <div class="padding-top-20">                  
                        <button type="submit" class="btn btn-primary">Submit</button>
                      </div>
                    </form>
                    <!-- END FORM-->          
                  </div>
                </div>
                <!-- END CONTENT -->
              </div>
            </div>
          </div>
        
        <jsp:include page="template/footer.jsp" />
        
    </body>
    <!-- END BODY -->
</html>
