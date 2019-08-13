<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product List</title>
<form method="post" action="cart">
<table border="1">
<tr><th> Name </th> <th>Price</th><th>Category</th> <th> select </th></tr>
<c:forEach items="${products}" var="p">
<tr>
<!-- invoking getter methods by prefixing with get. So, use name of method not attributes -->
<td>${p.name }</td>
<td>${p.price }</td>
<td>${p.category }</td>
<td><input type="checkbox" name="prds" value="${p.id }"/></td>
</tr>
</c:forEach>
</table>
<button type="submit">Add To Cart</button>
</form>
</head>
<body>

</body>
</html>