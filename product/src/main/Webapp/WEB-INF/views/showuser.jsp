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
			<th>FirstName</th>
			<th>LastName</th>
			<th>EmailId</th>
			<th>MobileNumber</th>
			<th>Address</th>
			<th>city</th>
			<th>State</th>
			<th>BuisnessOwner</th>
			<th>AvtarId</th>
			<th>Password</th>
			<th>Otp</th>
			<th>Device Id</th>
			<th>OS</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<c:forEach var="user" items="${userlist}">
			<tr>
				<td>${user.id}</td>
				<td>${user.emailId}</td>
				<td>${user.mobileNumber}</td>
				<td>${user.fisrtname}</td>
				<td>${user.lastname}</td>
				<td>${user.address}</td>
				<td>${user.city}</td>
				<td>${user.state}</td>
				<td>${user.isBusniessowner}</td>
				<td>${user.password}</td>
				<td>${user.otp}</td>
				<td>${user.avatarId}</td>
				<td>${user.deviceId}</td>
				<td>${user.os}</td>
				<td><a href="/updateUser?id=${user.getId()}">Edit</a></td>
				<td><a href="/deleteUser?id=${user.getId()}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>