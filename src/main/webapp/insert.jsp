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
<form action="add" method="post">

   <div style="margin:auto;width:80%">

    <div class="row">
    <div class="col-sm-2">
        UserName:
     </div>
        <div class="col-sm-6">
     
       <input type="text" name="name" value="<%session.getAttribute("name");%>">
    
    </div>
      </div>

	<div class = "row">
		<div class = "col-sm-2"> 
	 			Subject: 
	 	</div>
		 <div class = "col-sm-6">
		  <input type="text" name="subject" required>
		 </div>
	</div>

	<div class = "row">
		<div class = "col-sm-2">
	 			Marks:
	 	</div>
		 <div class = "col-sm-8">
		  <input type="text" name="mark" required>
		 </div>
	</div>

    <div class = "row">
	  <div class = "col-sm-2">
 			   <button type="submit" name = "button" value="insert">Admin</button>
 	</div>
 <!-- 	 <div class = "col-sm-2">
 			   <button type="submit" name = "button" onclick="location='display'">Display</button>
 	</div>  -->
</div>
</div>
</form>

</body>
</html>