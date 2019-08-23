<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Hotels</title>
<link rel="stylesheet" href="css/style.css" />
</head>
<body>
<h1>Search Hotels</h1>

<form method="post" action="hotel.do">
		Search <input type="text" name="searchCriteria" required/> <br />

		<button type="submit">Search Hotels</button>
	</form>
</body>
</html>