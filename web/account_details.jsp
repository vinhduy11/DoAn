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
              <li class="list-group-item clearfix"><a href="javascript:;"><i class="fa fa-angle-right"></i> Chi tiết tài khoản</a></li>
            </ul>
          </div>
          <!-- END SIDEBAR -->

          <!-- BEGIN CONTENT -->
          <div class="col-md-9 col-sm-7">
            <h1>Trang cá nhân</h1>
            <div class="content-page">
              <form role="form" class="form-horizontal form-without-legend" action="UserController" method="POST">
                    <div class="form-group">
                      <label class="col-lg-2 control-label"></label>
                      <div class="col-lg-8">
                          <c:if test="${errorMsg != null}">
                              <p style="color: red">${errorMsg}</p>
                          </c:if>
                      </div>
                    </div>
                    <input type="hidden" name="doAction" value="update">
                    <div class="form-group">
                      <label class="col-lg-2 control-label" for="fulname">Họ tên </label>
                      <div class="col-lg-8">
                          <input type="text" id="fullname" class="form-control" name="fullname" required>
                      </div>
                    </div>
                    <div class="form-group">
                      <label class="col-lg-2 control-label" for="email">Số điện thoại </label>
                      <div class="col-lg-8">
                          <input type="tel" id="phone_number" class="form-control" name="phone_number" pattern="^(?:0|84\s?)[1-9](?:\d\d){4}$" maxlength="11">
                          <p class="help-block">Chỉ sử dụng số điện thoại của Vietnam bắt đầu bằng 0 hoặc 84. VD 0975696854 hoặc 84975696854</p>
                      </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-2 control-label">Giới tính</label>
                      <div class="col-md-8">
                          <select class="form-control" name="gender">
                            <option value="0">Chưa chọn</option>
                            <option value="1">Nam</option>
                            <option value="2">Nữ</option>
                        </select>
                      </div>
                    </div>
                    <div class="form-group">
                      <label class="col-lg-2 control-label" for="">Ngày Sinh </label>
                      <div class="col-lg-8">
                          <input type="date" id="date_of_birth" class="form-control" name="date_of_birth" min="1900-01-01">
                      </div>
                    </div>
                    <div class="row">
                        <label class="col-lg-2 control-label" for=""></label>
                        <div class="col-lg-8">
                            <button class="btn btn-primary" type="submit">Cập nhật</button>
                        </div>
                    </div>
                  </form>
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
