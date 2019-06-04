<%-- 
    Document   : register
    Created on : May 8, 2019, 9:58:07 PM
    Author     : vinhd
--%>
<%@page import="Models.Item"%>
<%@page import="java.util.HashMap"%>
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

        <div class="main">
        <div class="container">
          <!-- BEGIN SIDEBAR & CONTENT -->
          <div class="row margin-bottom-40">
            <!-- BEGIN CONTENT -->
            <div class="col-md-12 col-sm-12">
              <h1>Shopping cart</h1>
              <form method="post" action="Checkout">
              <div class="goods-page">
                <div class="goods-data clearfix">
                  <div class="table-wrapper-responsive">
                  <table summary="Shopping cart">
                    <tr>
                      <th class="goods-page-image">Image</th>
                      <th class="goods-page-description">Description</th>
                      <th class="goods-page-ref-no">Ref No</th>
                      <th class="goods-page-price">Unit price</th>
                      <th class="goods-page-price">Quantities</th>
                      <th class="goods-page-total" colspan="2">Total</th>
                    </tr>
                    <%
                        HashMap<String, Item> carts = (HashMap<String, Item>) session.getAttribute("cart");
                        Integer cart_quantities = 0;
                        Integer cart_total_prices = 0;

                        if(carts != null)  {
                            cart_quantities = carts.size();
                            for (String i : carts.keySet()) {
                                Long order_id = carts.get(i).getOrderId();
                                Integer product_id = carts.get(i).getProduct().getProduct_id();
                                String product_name = carts.get(i).getProduct().getProduct_name();
                                String img_url = carts.get(i).getProduct().getImg_url();
                                Integer quantities = carts.get(i).getQuantity();
                                Integer price = carts.get(i).getProduct().getPrice();
                                Integer total_prices = quantities * price;
                                cart_total_prices += total_prices;
                                cart_quantities += carts.get(i).getQuantity();
                    %>
                    <tr>
                      <td class="goods-page-image">
                        <a href="javascript:;"><img src="assets/imgs/<%=img_url%>" alt="<%=product_name%>"></a>
                      </td>
                      <td class="goods-page-description">
                        <h3><a href="javascript:;"><%=product_name%></a></h3>
                      </td>
                      <td class="goods-page-ref-no">
                        <%=order_id%>
                      </td>
                      <td class="goods-page-price">
                        <strong><%=price%> <span> VND</span></strong>
                      </td>
                      <td class="goods-page-quantity">
                        <div class="product-quantity">
                            <input id="product-quantity" type="text" value="<%=quantities%>" disabled="" class="form-control input-sm">
                        </div>
                      </td>
                      <td class="goods-page-total">
                        <strong><%=total_prices%> <span> VND</span></strong>
                      </td>
                      <td class="del-goods-col">
                          <a class="del-goods" onclick="removeProducttoCart(<%=carts.get(i).getProduct().getProduct_id()%>)">&nbsp;</a>
                      </td>
                    </tr>
                    <% }} %>
                  </table>
                  </div>

                  <div class="shopping-total">
                    <ul>
                      <li>
                        <em>Sub total</em>
                        <strong class="price"><%=cart_total_prices%> <span> VND</span></strong>
                      </li>
                      <li>
                        <em>Shipping cost</em>
                        <strong class="price">0 <span> VND</span></strong>
                      </li>
                      <li class="shopping-total-price">
                        <em>Total</em>
                        <strong class="price"><%=cart_total_prices%> <span> VND</span></strong>
                      </li>
                    </ul>
                  </div>
                </div>
                <a class="btn btn-default" href="http://localhost:8080/DoAn/Product?category=0&page=1&recordsPerPage=5">Continue shopping <i class="fa fa-shopping-cart"></i></a>
                <button class="btn btn-primary" type="submit">Checkout <i class="fa fa-check"></i></button>
              </div>
              </form>
            </div>
            <!-- END CONTENT -->
          </div>
          <!-- END SIDEBAR & CONTENT -->

        </div>
      </div>
        <script src="https://www.paypal.com/sdk/js?client-id=SB_CLIENT_ID">
        </script>
        <script type="text/javascript">
            function removeProducttoCart(productId) {
                if (productId > 0 && productId != undefined) {
                    $.get("/DoAn/Cart", {"ProductId": productId, "Quantities": 0, "action": "remove"}, function(res){
                        if (res === "no session") {
                            window.location.href = "<%=url%>/login.jsp";
                        } else {
                            window.location.reload();
                        }
                    });
                }
            }
        </script>
        <jsp:include page="template/footer.jsp" />
        
    </body>
    <!-- END BODY -->
</html>
