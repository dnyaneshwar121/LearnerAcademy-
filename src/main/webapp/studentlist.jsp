<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Learner's Academy</title>
<style type="text/css">
body{
background-color: #f2f2f2;
}
h3{
font-family: monospace;
font-size: 36px; 
color : #000066;
}
table,th,td{
border : 1px solid #0000cc;
border-collapse :collapse;
font-size: 26px;
}
th {
  background-color: #04AA6D;
  color: white;
}
tr:nth-child(even) {
background-color: #99ccff;
}
td{
color : #003300;
}
th, td {
  padding: 15px;
  text-align: left;
}
</style>
</head>
<body>
<table>
  <tr>
  <th>Student Name</th>
  <th>Student Roll No</th>
  <th>Student Class</th>
  </tr>
<%
  try {
	  Class.forName("com.mysql.cj.jdbc.Driver" );
	  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/learneracademy","root","root");
	  Statement stmt=con.createStatement();
	  ResultSet rs=stmt.executeQuery("Select name,rollno,class from student");
	  while (rs.next()){%>
		 
		 <tr>
		 <td><%= rs.getString(1) %> </td>
		 <td><%= rs.getInt(2) %></td>
		  <td><%= rs.getString(3) %> </td>
		  </tr>
		  
	 <% }
  } catch (Exception e){
	  e.printStackTrace();
  }
%>
</table>
</body>
</html>
