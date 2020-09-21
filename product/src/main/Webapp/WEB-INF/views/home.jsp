<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Welcome to Product Home</h3>
<form action="/GetUserById" method="post">
<label>Enter userId:</label>
<input type="text" palceholder="Enter User Id" name="id" id="id">
	<button type="submit">view</button>
</form><br>
<h1>
<a href="/register">Register</a>&nbsp;&nbsp;&nbsp;
<a href=/showuser>Show All User</a><br>
<br>
<br>
</h1>
<br>
</body>
</html>