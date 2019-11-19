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
  border-collapse: collapse;
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
  <tr>    
    <th>Subjects</th>
    <th>Score</th>
  </tr>
  
   <% 
  HashMap<String,String> subjects = (HashMap<String,String>) session.getAttribute("subjectScore");
   
   /* System.out.println(subjects); */
   
   
  /*
   Map<String, Float> map = new HashMap<String, Float>();   
   map.put("Cookies",  90.87f);  
   for (Map.Entry<String,Float> entry : map.entrySet()) //using map.entrySet() for iteration  
   {  
   //returns keys and values respectively  
   System.out.println("Item: " + entry.getKey() + ", Price: " + entry.getValue());*/   
   
   for(Map.Entry<String,String> entry : subjects.entrySet()) 
   {
		  %>
		  <tr>
			  <td> <%=entry.getKey()%></td>
			  <td> <%=entry.getValue()%></td>
		  </tr>		  
		  <%
		  }
%>	  
</table>
<br>
</body>
</html>