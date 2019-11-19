<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>

 <form action="login" method="post">

<div style="margin:auto;width:80%">
	<div class = "row">	
		<div class = "col-sm-2"> 
	 			UserName: 
	 	</div>
		 <div class = "col-sm-6">
		  <input type="text" name="name" required>
		 </div>
	</div>

	<div class = "row">
		<div class = "col-sm-2">
	 			Password:
	 	</div>
		 <div class = "col-sm-8">
		  <input type="password" name="password" required>
		 </div>
	</div>

<div class = "row">
	<div class = "col-sm-2">
 			   <button type="submit" name = "button" value="login">Login</button>
 	</div>
 	
 		<!--  <div class = "col-sm-2">
 			   <button type="submit" name = "button" onclick="location='user'">Add subject</button>
 	</div>  -->
 		
</div>
</div>
</form>
</body>
</html>