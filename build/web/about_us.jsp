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
                  <li><a href="/DoAn/">Trang chủ</a></li>
                  <li class="active">Giới thiệu</li>
              </ul>
              <!-- BEGIN SIDEBAR & CONTENT -->
              <div class="row margin-bottom-40">

                <!-- BEGIN CONTENT -->
                <div class="col-md-9 col-sm-7">
                  <h1>Giới thiệu cửa hàng</h1>
                  <div class="content-form-page">
                      
                      <img src="assets/pages/img/posts/gioithieu.jpg">
                  </div>
                </div>
                <!-- END CONTENT -->
              </div>
              <!-- END SIDEBAR & CONTENT -->
            </div>
          </div>
        
        <jsp:include page="template/footer.jsp" />
        
    </body>
    <!-- END BODY -->
</html>
