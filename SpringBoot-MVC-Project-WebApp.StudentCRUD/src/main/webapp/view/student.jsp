<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Rupesh Jondhale MVC</title>
</head>
<body style="background-color: Cornsilk;">

	<center>
		<h1 style="background-color:#9ACD32 ;">Student Record
			Crud</h1>
	</center>
	<br>
		<br>
			<br>

	<form action="/" method="post">
		<span style="margin-left:23em">ID<span style="margin-left: 1.6em"></span><input type="text" name="id"><br>
		<br><span style="margin-left:23em"> Name<span style="margin-left: 0.3em"></span><input
			type="text" name="name"><br>
		<br><span style="margin-left:23em"> City<span style="margin-left: 1em"></span><input type="text"
			name="city"><br>
		<br>

		
		<span style="margin-left:23em"><button type="submit" formaction="save">
			Save <a href="save"></a>
			<span style="margin-left:0.5em"><button type="submit" formaction="update">
				Update <a href="update"></a>
				<span style="margin-left:0.5em"><button type="submit" formaction="delete">
					Delete <a href="delete"></a>
					<span style="margin-left:0.5em"><button type="reset" formaction="reset">
					Reset

				</button>
	</form>



</body>
</html><br><br>
<span style="margin-left:23em"><a href="viewtable">View Tables</a>



