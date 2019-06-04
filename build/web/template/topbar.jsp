<%-- 
    Document   : topbar
    Created on : May 9, 2019, 10:38:08 PM
    Author     : vinhd
--%>

<%@page import="Models.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
    String url = request.getContextPath().toString();
%>
<!-- BEGIN TOP BAR -->
    <div class="pre-header">
        <div class="container">
            <div class="row">
                <!-- BEGIN TOP BAR LEFT PART -->
                <div class="col-md-6 col-sm-6 additional-shop-info">
                    <ul class="list-unstyled list-inline">
                        <li><i class="fa fa-phone"></i><span>+1 456 6717</span></li>
                    </ul>
                </div>
                <!-- END TOP BAR LEFT PART -->
                <!-- BEGIN TOP BAR MENU -->
                <div class="col-md-6 col-sm-6 additional-nav">
                    <ul class="list-unstyled list-inline pull-right">

                        <%
                            User info = (User) session.getAttribute("UserInfo");
                            
                            if(info != null)  {
                        %>            
                            <li>Chào mừng <%= info.getFullname() %></li>
                            <li><a href="<%=url%>/carts.jsp">Giỏ hàng</a></li>
                            <li><a href="/DoAn/account.jsp">Tài khoản</a></li>
                            <li><a href="UserController?doAction=logout">Đăng xuất</a></li>
                        <%
                            } else {
                        %>
                            <li>Chào mừng khách hàng</li>
                            <li><a href="login.jsp">Đăng nhập</a></li>
                            <li><a href="register.jsp">Đăng ký</a></li>
                        <%
                            }
                        %>

                    </ul>
                </div>
                <!-- END TOP BAR MENU -->
            </div>
        </div>        
    </div>
    <!-- END TOP BAR -->
