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

<form action="/category" method="post" items="${category}">

 <label for="name"><b>Id</b></label>
    <input type="text"  value="${category.getId()}" placeholder="Enter Id" name="id" readonly="readonly"><br><br>

 <label for="name"><b>Category</b></label>
    <input type="text" placeholder="Enter Id" name="category" value="${category. getCategory()}" ><br><br>

   <label for="year"><b>Image</b></label>
    <input type="text" placeholder="Enter category Id " name="indicatorImage "  value="${category. getIndicatorImage()}"  ><br><br>
    
    <lable for="isvalid">select option</lable>
     <select name="isValid" value="${category.getIsValid()}">
     <option value="true">true</option>
     <option value="false">false</option>
     
     </select><br><br>

     <button type="submit">update</button>
    </form>
    </div>
    </body>