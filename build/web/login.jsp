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
                  <li class="active">Đăng nhập</li>
              </ul>
              <!-- BEGIN SIDEBAR & CONTENT -->
              <div class="row margin-bottom-40">

                <!-- BEGIN CONTENT -->
                <div class="col-md-9 col-sm-7">
                  <h1>Đăng nhập</h1>
                  <div class="content-form-page">
                    <form role="form" class="form-horizontal form-without-legend" action="UserController" method="POST">
                      <input type="hidden" name="doAction" value="login">
                      
                      <div class="form-group">
                        <label class="col-lg-2 control-label"></label>
                        <div class="col-lg-8">
                            <c:if test="${errorMsg != null}">
                                <p style="color: red">${errorMsg}</p>
                            </c:if>
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="col-lg-2 control-label" for="username">Tài khoản <span class="require">*</span></label>
                        <div class="col-lg-8">
                            <input type="text" id="first-name" class="form-control" name="username">
                        </div>
                      </div>
                      
                      <div class="form-group">
                        <label class="col-lg-2 control-label" for="password">Mật khẩu <span class="require">*</span></label>
                        <div class="col-lg-8">
                          <input type="password" id="first-name" class="form-control" name="password">
                        </div>
                      </div>
                      
                      <div class="row">
                        <div class="col-lg-8 col-md-offset-2 padding-left-0 padding-top-20">
                            <button class="btn btn-primary" type="submit">Đăng nhập</button>
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
