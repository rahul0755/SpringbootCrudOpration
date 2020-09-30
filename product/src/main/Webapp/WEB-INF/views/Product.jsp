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
<h3>Product Register Page</h3>
<div class="container">

<form action="/Products" method="post">

 <label for="Id"><b>Id</b></label>
    <input type="text" placeholder="Enter Id" name="id" ><br><br>

 <label for="ProductName"><b>ProductName</b></label>
    <input type="text" placeholder="Enter Product Name " name="ProductName " ><br><br>

     <label for="CategoryId"><b>categoryId </b></label>
    <input type="text" placeholder="Enter categoryid " name="categoryid" ><br><br>
    
    <label for="select option">select any one</label>
     <select name="isValid">
     <option value="true">true</option>
     <option value="false">false</option>
     
     </select><br><br>
    
    <button type="submit">Submit</button>
    
</form>
</div>
