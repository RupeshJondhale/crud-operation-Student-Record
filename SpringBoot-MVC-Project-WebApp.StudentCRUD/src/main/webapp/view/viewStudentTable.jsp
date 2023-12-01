<%@page import="com.example.SpringBootMVCProjectWebApp.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Rupesh Page</title>
</head>
<body style="background-color:powderblue;">

<center>
		<h1 style="background-color:#33FF99">Student Table</h1>
	</center>
	<table >
		<span style="margin-left:10em"><tr>
			<th><span style="margin-left:10em">ID</th>
			<th>Name</th>
			<th>City</th>
	</tr>
		<%
		List<Student> list = (List<Student>) request.getAttribute("al");
		%>

		<%
		for (Student c1 : list) {
		%>
		<tr>
			<td>
				<span style="margin-left:10em"><%
				out.print(c1.getId());
				%>
			</td>
			<td>
				<span style="margin-left:1.5em"><%
				out.print(c1.getName());
				%>
			</td>
			<td>
				<span style="margin-left:3em"><%
				out.print(c1.getCity());
				%>
			</td>
		</tr>

		<%
		}
		%>


</body>
</html>



