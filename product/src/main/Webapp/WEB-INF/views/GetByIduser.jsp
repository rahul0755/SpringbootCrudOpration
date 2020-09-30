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
	<!--  <table border="1" style="width=90%;">
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
		</tr> -->
			<h1>${user}</h1>
				<%-- <td>${user.id}</td>
				<td>${user.getFisrtname()}</td>
				<td>${user.getLastname() }</td>
				<td>${user.getAddress()}</td>
				<td>${user.getEmailId()}</td>
				<td>${user.getMobileNumber()}</td>
				<td>${user.getCity()}</td>
				<td>${user.getState() }</td>
				<td>${user.getIsBusniessowner()}</td>
				<td>${user.getPassword()}</td>
				<td>${user.getOtp()}</td>
				<td>${user. getAvatarId()}</td>
				<td>${user.getDeviceId() }</td>
				<td>${user.getOs()}</td>
				<td><a href="/updateUser?id=${user.getId()}">Edit</a></td>
				<td><a href="/deleteCar?id=${user.getId()}">Delete</a></td>
			</tr>
	</table>  --%>

<h1> <a href="/home">Back</a></h1>
</body>
</html>