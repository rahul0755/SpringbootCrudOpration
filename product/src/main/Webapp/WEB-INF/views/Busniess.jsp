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
<h3>Businiess Register Page</h3>
<div class="container">

<form action="/BusinessRagister" method="post">

 <label for="name"><b>Id</b></label>
    <input type="text" placeholder="Enter Id" name="id" id="id" ><br><br>

 <label for="year"><b>CategoryId</b></label>
    <input type="text" placeholder="Enter category Id " name="categoryId " id="categoryId " ><br><br>

    <label for="Type"><b>userId </b></label>
    <input type="text" placeholder="Enter userId " name="userId " id="userId " ><br><br>
    
     <label for="name"><b>nameOfbusiness</b></label>
    <input type="text" placeholder="Enter nameOfbusiness" name="nameOfbusiness" id="nameOfbusiness" ><br><br>
    
    <label for="name"><b> streetAddress</b></label>
    <input type="text" placeholder="Enter  streetAddress" name="streetAddress" id=" streetAddress" ><br><br>

    <label for="year"><b>postalCode</b></label>
    <input type="text" placeholder="Enter postalCode" name="postalCode" id="postalCode" ><br><br>

    <label for="Type"><b>city</b></label>
    <input type="text" placeholder="Enter city" name="city" id="city" ><br><br>
    
     <label for="name"><b>stateProvince</b></label>
    <input type="text" placeholder="Enter stateProvince" name="stateProvince" id="stateProvince" ><br><br>
    
    <label for="name"><b>latitude</b></label>
    <input type="text" placeholder="Enter latitude" name="latitude" id="latitude" ><br><br>

    <label for="year"><b>longitude</b></label>
    <input type="text" placeholder="Enter longitude" name="longitude" id="longitude" ><br><br>

    <label for="Type"><b>country</b></label>
    <input type="text" placeholder="Enter country" name="country" id="country" ><br><br>
    
 
    <button type="submit">Register</button>
    </form>
</div>
<h1> <a href="/home">Back</a></h1>
</body>
</html>