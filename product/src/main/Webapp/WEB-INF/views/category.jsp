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

<form action="/category" method="post">

 <label for="name"><b>Id</b></label>
    <input type="text" placeholder="Enter Id" name="id"  readonly="readonly"><br><br>

 <label for="year"><b>categoryName</b></label>
    <input type="text" placeholder="Enter category Name " name="category" ><br><br>

    <!-- <label for="Type"><b>indicatorImage </b></label>
    <input type="text" placeholder="Enter indicatorImage " name="indicatorImage" ><br><br> -->
    
     <select name="isValid">
     <option value="true">true</option>
     <option value="false">false</option>
     
     </select><br><br>
    
    <button type="submit">Submit</button>
    
</form>
</div>
