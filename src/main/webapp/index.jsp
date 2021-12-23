<%--
  Created by IntelliJ IDEA.
  User: Lovin
  Date: 12/23/2021
  Time: 2:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<head>
  <title>Product Discount Calculator</title>
  <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h2>Product Discount Calculator</h2>
<form action="/discount" method="get">
  <input type="text" name="product_description" placeholder="Enter description: "/>
  <input type="text" name="list_price" placeholder="Enter your listing price: "/>
  <input type="text" name="discount_percent" placeholder="Enter your Discount_Percent: "/>
  <input type = "submit" id = "submit" value = "Calculator"/>
</form>
</body>
</html>
