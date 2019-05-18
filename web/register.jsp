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
        <!-- reCAPTCHA Libary -->
        
        <div class="main">
            <div class="container">
              <ul class="breadcrumb">
                  <li><a href="/DoAn/">Trang chủ</a></li>
                  <li class="active">Đăng ký</li>
              </ul>
              <!-- BEGIN SIDEBAR & CONTENT -->
              <div class="row margin-bottom-40">

                <!-- BEGIN CONTENT -->
                <div class="col-md-9 col-sm-7">
                  <h1>Đăng ký thông tin</h1>
                  <div class="content-form-page">
                      
                    <form role="form" class="form-horizontal form-without-legend" action="UserController" method="POST">
                      <div class="form-group">
                        <label class="col-lg-2 control-label"></label>
                        <div class="col-lg-8">
                            <c:if test="${errorMsg != null}">
                                <p style="color: red">${errorMsg}</p>
                            </c:if>
                            <p style="color: red">Dấu * bắt buộc điền</p>
                        </div>
                      </div>
                      <input type="hidden" name="doAction" value="register">
                      <div class="form-group">
                        <label class="col-lg-2 control-label" for="username">Tài khoản <span class="require">*</span></label>
                        <div class="col-lg-8">
                            <input type="text" id="first-name" class="form-control" name="username" pattern="^[a-zA-Z][a-zA-Z0-9-_\.]{1,20}$" required>
                            
                        </div>
                      </div>
                      
                      <div class="form-group">
                        <label class="col-lg-2 control-label" for="password">Mật khẩu <span class="require">*</span></label>
                        <div class="col-lg-8">
                            <input type="password" id="password" class="form-control" name="password" pattern="^(?=^.{8,}$)(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?!.*\s).*$"  required>
                            <p class="help-block">Phải kết hợp chữ hoa, chữ thường, chữ số và nhỏ nhất là 8 ký tự</p>
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="col-lg-2 control-label" for="conf_password">Xác nhận mật khẩu <span class="require">*</span></label>
                        <div class="col-lg-8">
                          <input type="password" id="conf_password" class="form-control" name="conf_password" pattern="^(?=^.{8,}$)(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?!.*\s).*$" required>
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="col-lg-2 control-label" for="email">E-Mail <span class="require">*</span></label>
                        <div class="col-lg-8">
                            <input type="email" id="email" class="form-control" name="email" required>
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="col-lg-2 control-label" for="fulname">Họ tên <span class="require">*</span></label>
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
                        <div class="col-lg-8 col-md-offset-2 padding-left-0 padding-top-20">
                            <div class="g-recaptcha" data-sitekey="6LcleqMUAAAAAAq1isO5JZv-1GzZd2b59m5w9fJs"></div>
                            <br />
                            <button class="btn btn-primary" type="submit">Đăng ký</button>
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
        
    </body>
    <!-- END BODY -->
</html>
