<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
.container
{
	text-align: center;
	margin: 10px;
}
</style>
<body>

<%@ page import="com.product.Model.BusinessRegistration" %>
<h3>Businiess Register Page</h3>
<div class="container">

<form action="/BusinessRagister" method="post" items="${business}">

 <label for="name"><b>Id</b></label>
    <input type="text"  value="${business.getId()}" placeholder="Enter Id" name="id" readonly="readonly"><br><br>

 <label for="name"><b>categoryId</b></label>
    <input type="text" placeholder="Enter categoryId " name="categoryId" value="${business.getCategoryId()}" ><br><br>

 <label for="year"><b>userId</b></label>
    <input type="text" placeholder="Enter userId "  value="${business.getUserId()}"  ><br><br>

    <label for="Type"><b>nameOfbusiness </b></label>
    <input type="text" placeholder="Enter nameOfbusiness " name="nameOfbusiness" value="${business.getNameOfbusiness()}"  ><br><br>
    
     <label for="name"><b>streetAddress</b></label>
    <input type="text" placeholder="Enter streetAddress" name="streetAddress"  value="${business.getStreetAddress()}"  ><br><br>
    
    <label for="name"><b> postalCode</b></label>
    <input type="text" placeholder="Enter  postalCode" name="postalCode"  value="${business.getPostalCode()}" ><br><br>

    <label for="year"><b>city</b></label>
    <input type="text" placeholder="Enter city" name="city"  value="${business.getCity()}" ><br><br>

    <label for="Type"><b>stateProvince</b></label>
    <input type="text" placeholder="Enter stateProvince" name="stateProvince" value="${business.getStateProvince()}" ><br><br>
    
     <label for="name"><b>latitude</b></label>
    <input type="text" placeholder="Enter latitude" name="latitude" value="${business.getLatitude()}"  ><br><br>
    
    <label for="name"><b>longitude</b></label>
    <input type="text" placeholder="Enter longitude" name="longitude"  value="${business.getLongitude()}" ><br><br>

    <label for="year"><b>country</b></label>
    <input type="text" placeholder="Enter country" name="country"  value="${business.getCountry()}" ><br><br>

 
    <button type="submit">Register</button>
    </form>
</div>
<h1> <a href="/home">Back</a></h1>
</body>
</html>