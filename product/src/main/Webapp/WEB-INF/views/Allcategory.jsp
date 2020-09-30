<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Welcome to Prodct of Tablab</h3>
	<br>
	<h3>All Data</h3>
	<table border="1" width="90%">
		<tr>
			<th>Id</th>
			<th>Catagary </th>
			<th>Image</th>
			<th>isValid</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<c:forEach var="category" items="${categorylist}">
			<tr>
				<td>${category.id}</td>
				<td>${category.category }</td>
				<td>${category.indicatorImage}</td>
				<td>${category.isValid}</td>
				<td><a href="/updateCategory?id=${category.getId()}">Edit</a></td>
				<td><a href="/deletecatogry?id=${category.getId()}">Delete</a></td>
			</tr>
		</c:forEach>
	</table><br><br>
<h1> <a href="/home">Back</a></h1>
</body>
</html>