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
    <input type="text"  value="${user. getId()}"  name="id"  readonly="readonly"><br><br>
    

    <label for="year"><b>fisrt name</b></label>
    <input type="text" placeholder="Enter fisrtname" value="${user.getFisrtname()}" name="fisrtname" id="fisrtname" ><br><br>

    <label for="Type"><b>lastname</b></label>
    <input type="text" placeholder="Enter lastname"  value="${user.getLastname()}" name="lastname" id="lastname" ><br><br>
    
     <label for="name"><b>address</b></label>
    <input type="text" placeholder="Enter address"value="${user.getAddress()}"  name="address" id="address" ><br><br>
    
    <label for="name"><b>emailId</b></label>
    <input type="text" placeholder="Enter emailId" value="${user.getEmailId()}"  name="emailId" id="emailId" ><br><br>

    <label for="year"><b>mobileNumber</b></label>
    <input type="text" placeholder="Enter mobileNumber"  value="${user. getMobileNumber()}" name="mobileNumber" id="mobileNumber" ><br><br>

    <label for="Type"><b>city</b></label>
    <input type="text" placeholder="Enter city" name="city" value="${user.getCity()}" id="city" ><br><br>
    
     <label for="name"><b>state</b></label>
    <input type="text" placeholder="Enter state" name="state" value="${user.getState()}" id="state" ><br><br>
    
    <label for="name"><b>isBusniessowner</b></label>
    <input type="text" placeholder="Enter isBusniessowner" name="isBusniessowner" value="${user. getIsBusniessowner()}" id="isBusniessowner" ><br><br>

    <label for="year"><b>password</b></label>
    <input type="text" placeholder="Enter password" name="password" value="${user. getPassword()}" id="password" ><br><br>

    <label for="Type"><b>OTP</b></label>
    <input type="text" placeholder="Enter otp" name="otp"  value="${user. getOtp()}" id="otp" ><br><br>
    
     <label for="name"><b>avatarId</b></label>
    <input type="text" placeholder="Enter avatarId" name="avatarId" value="${user. getAvatarId()}" id="avatarId" ><br><br>
    
    <label for="name"><b>deviceId</b></label>
    <input type="text" placeholder="Enter deviceId" name="deviceId" value="${user. getDeviceId()}" id="deviceId" ><br><br>
    
    <label for="name"><b>OS</b></label>
    <input type="text" placeholder="Enter os" name="os" value="${user. getOs()}" id="os" ><br><br>
    


    <button type="submit" class="registerbtn">Update</button>
  </div>
</form>
<h1> <a href="/home">Back</a></h1>
</body>
</html>