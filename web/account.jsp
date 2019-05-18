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
            <li class="active">Tài khoản</li>
        </ul>
        <!-- BEGIN SIDEBAR & CONTENT -->
        <div class="row margin-bottom-40">
          <!-- BEGIN SIDEBAR -->
          <div class="sidebar col-md-3 col-sm-3">
            <ul class="list-group margin-bottom-25 sidebar-menu">
              <li class="list-group-item clearfix"><a href="javascript:;"><i class="fa fa-angle-right"></i> Khôi phục mật khẩu</a></li>
              <li class="list-group-item clearfix"><a href="/DoAn/account_details.jsp"><i class="fa fa-angle-right"></i> Chi tiết tài khoản</a></li>
            </ul>
          </div>
          <!-- END SIDEBAR -->

          <!-- BEGIN CONTENT -->
          <div class="col-md-9 col-sm-7">
            <h1>Trang cá nhân</h1>
            <div class="content-page">
              <h3>Tài khoản</h3>
              <ul>
                <li><a href="javascript:;">Thay đổi thông tin tài khoản</a></li>
                <li><a href="javascript:;">Thay đổi mật khẩu</a></li>
              </ul>
              <hr>

              <h3>Giao dịch</h3>
              <ul>
                <li><a href="javascript:;">Xem lịch sử giao dịch</a></li>
                <li><a href="javascript:;">Xem thông tin trả hàng</a></li>
                <li><a href="javascript:;">Giao dịch</a></li>
              </ul>
            </div>
          </div>
          <!-- END CONTENT -->
        </div>
        <!-- END SIDEBAR & CONTENT -->
      </div>
    </div>

        <jsp:include page="template/footer.jsp" />
        <!-- END PAGE LEVEL JAVASCRIPTS -->
    </body>
    <!-- END BODY -->
</html>
