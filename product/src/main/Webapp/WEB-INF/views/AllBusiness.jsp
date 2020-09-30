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
			<th>CatagaryId</th>
			<th>UserId</th>
			<th>nameOfbusiness</th>
			<th>streetAddress</th>
			<th>postalCode</th>
			<th>city</th>
			<th>stateProvince</th>
			<th>latitude</th>
			<th>longitude</th>
			<th>country</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<c:forEach var="business" items="${businessList}">
			<tr>
				<td>${business.id}</td>
				<td>${business.categoryId }</td>
				<td>${business.userId}</td>
				<td>${business.nameOfbusiness}</td>
				<td>${business.streetAddress}</td>
				<td>${business.postalCode}</td>
				<td>${business.city}</td>
				<td>${business.stateProvince}</td>
				<td>${business.latitude}</td>
				<td>${business.longitude}</td>
				<td>${business.country}</td>
				<td><a href="/updateBusiness?id=${business.getId()}">Edit</a></td>
				<td><a href="/deleteBusiness?id=${business.getId()}">Delete</a></td>
			</tr>
		</c:forEach>
	</table><br><br>
<h1> <a href="/home">Back</a></h1>
</body>
</html>