<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<form action="register" method="post">

<div style="margin:auto;width:80%">
	<div class = "row">
		<div class = "col-sm-3">
	 			  Roll No:
	 	</div>
		 <div class = "col-sm-8">
		  <input type="text" name="roll" required>
		 </div>
	</div>
	
	<div class = "row">
		<div class = "col-sm-3">
	 			  UserName:
	 	</div>
		 <div class = "col-sm-8">
		  <input type="text" name="name" required>
		 </div>
	</div>
	
	<div class = "row">
		<div class = "col-sm-3">
	 			  Password:
	 	</div>
		 <div class = "col-sm-8">
		  <input type="password" name="password" required>
		 </div>
	</div>
	<div class = "row">
		<div class = "col-sm-3">
	 			Phone No:
	 	</div>
		 <div class = "col-sm-8">
		  <input type="text" name="phone" required>
		 </div>
	</div>
	
		<div class = "row">
		<div class = "col-sm-3">
	 			 Address:
			 
	 	</div>
		 <div class = "col-sm-8">
		  <input type="text" name="address" required>
		 </div>
	</div>

<div class = "row">
	<div class = "col-sm-1">
 			   <button type="submit" name = "button" value="register">Register</button>
 	</div> 	
 	
 	<div class = "col-sm-1" style="margin-left:40px;">
		<button type="button" onclick="location='login.jsp'">Login</button>
 	</div>
 	
</div>
</div>
</form>
</body>
</html>