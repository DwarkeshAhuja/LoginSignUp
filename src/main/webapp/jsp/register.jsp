<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="registerProcess" method="post">

		<table align="center">
			<tr>
				<td><label>Username</label></td>
				<td><input type="text" name="userName" id="userName" /></td>
			</tr>
			<tr>
				<td><label>Password</label></td>
				<td><input type="password" name="password" id="password" /></td>
			</tr>
			<tr>
				<td><label>FirstName</label></td>
				<td><input type="text" name="firstName"
						id="firstName" /></td>
			</tr>
			<tr>
				<td><label>LastName</label></td>
				<td><input type="text" name="lastName" id="lastName"/></td>
			</tr>
			<tr>
				<td><label>Email</label></td>
				<td><input type="email" name="email" id="email" /></td>
			</tr>
			<tr>
				<td><label>Address</label></td>
				<td><input type="text" name="address" id="address" /></td>
			</tr>
			<tr>
				<td><label>Phone</label></td>
				<td><input type="text"name="phone" id="phone" /></td>
			</tr>

			<tr>
				<td></td>
				<td><input type="submit" id="register" name="register" value="register"/></td>
			</tr>
			<tr></tr>
			<tr>
				<td></td>
				<td><a href="home.jsp">Home</a></td>
			</tr>
		</table>
	</form>
</body>
</html>