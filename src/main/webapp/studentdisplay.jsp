<%@page import="com.mongodb.session.SessionContext"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.decipher.model.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: ;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}
</style>
</head>
<body align="center">
    </head>
    <body>
<table>
   <% 
 /*   HttpSession session = request.getSession();  iski or student display servlet ki linking ek hi he */
 
 ArrayList<Student> studentList = (ArrayList<Student>) session.getAttribute("studentlist");
   for (Student student : studentList) 
   {
	   
		  %>
		  <form action="takestudent" method="post">
		    <tr>		
		    <%String userName = student.getUsername(); %> 
		    <td> <%=student.getUsername()%></td> 	  
		    <td> <%=student.getAddress()%></td>   
		  <td> <%=student.getRollNumber()%></td>
		  <td> <%=student.getPhone()%></td>
	
	 <input id="userId" name="userId" type="hidden" value="<%=userName%>"> 

<td> <button style="background-color: yellow" type="submit" name = "button" value = "insert">AddSubject</button> </td> 
			  
<%-- 			  <td> <%=student.getPassword()%></td>
 --%>				
       </tr>			  
		  </form>		
		      <%
		         }
%>	  
</table>
<br>
</body>
</html>
