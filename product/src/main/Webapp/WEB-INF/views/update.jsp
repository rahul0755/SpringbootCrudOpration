<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/users" method="post" items="${user}">
  <div class="container">
    <h1>Update</h1>
    
     <label for="Id"><b>Id</b></label>
    <input type="hidden"<%--  value="${user.id}"  --%>name="id" id="id"  readonly="readonly"><br><br>
    

    <label for="year"><b>fisrt name</b></label>
    <input type="text" placeholder="Enter fisrtname" value="${user.firstname}" name="fisrtname" id="fisrtname" ><br><br>

    <label for="Type"><b>lastname</b></label>
    <input type="text" placeholder="Enter lastname"  value="${user.lastname}" name="lastname" id="lastname" ><br><br>
    
     <label for="name"><b>address</b></label>
    <input type="text" placeholder="Enter address"value="${user.address}"  name="address" id="address" ><br><br>
    
    <label for="name"><b>emailId</b></label>
    <input type="text" placeholder="Enter emailId" value="${user.emailId}"  name="emailId" id="emailId" ><br><br>

    <label for="year"><b>mobileNumber</b></label>
    <input type="text" placeholder="Enter mobileNumber"  value="${user.mobileNumber}" name="mobileNumber" id="mobileNumber" ><br><br>

    <label for="Type"><b>city</b></label>
    <input type="text" placeholder="Enter city" name="city" id="city" ><br><br>
    
     <label for="name"><b>state</b></label>
    <input type="text" placeholder="Enter state" name="state" id="state" ><br><br>
    
    <label for="name"><b>isBusniessowner</b></label>
    <input type="text" placeholder="Enter isBusniessowner" name="isBusniessowner" id="isBusniessowner" ><br><br>

    <label for="year"><b>password</b></label>
    <input type="text" placeholder="Enter password" name="password" id="password" ><br><br>

    <label for="Type"><b>OTP</b></label>
    <input type="text" placeholder="Enter otp" name="otp" id="otp" ><br><br>
    
     <label for="name"><b>avatarId</b></label>
    <input type="text" placeholder="Enter avatarId" name="avatarId" id="avatarId" ><br><br>
    
    <label for="name"><b>deviceId</b></label>
    <input type="text" placeholder="Enter deviceId" name="deviceId" id="deviceId" ><br><br>
    
    <label for="name"><b>OS</b></label>
    <input type="text" placeholder="Enter os" name="os" id="os" ><br><br>
    


    <button type="submit" class="registerbtn">Update</button>
  </div>
</form>

</body>
</html>