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
h2{
font-family: monospace;
font-size: 36px; 
color : #000066;
}
h3{
font-family: monospace;
font-size: 24px; 
color : #000066;
}
a{
text-decoration: none;
font-size: 22px;
}
a:link {
  color: red;
}
a:visited {
  color: green;
}
a:hover {
  color: hotpink;
}
a:active {
  color: blue;
}
</style>
</head>
<body>
<a href="login.html">Logout</a>


	<h2>Welcome to Admin Page</h2>
	
	<a href="addstudent.html">Add Student ||</a>
	<a href="addteacher.html">Add Teacher ||</a>
	<a href="addClass.html">Add Class ||</a>
	<a href="addsubject.html">Add Subject</a>
	
	<h3>Master Lists</h3>
	<a href="studentlist.jsp">Student List ||</a>
	<a href="teacherlist.jsp">Teacher List ||</a>
	<a href="Classlist.jsp">Class List ||</a>
	<a href="subjectlist.jsp">Subject List ||</a>
	
<br><br><br>
	

</body>
</html>