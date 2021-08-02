<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

	<form:form action="loginProcess" method="post">
		<table align="center">
			<tr>
				<td><label name="username">Username: </label></td>
				<td><input type="text" name="uName" id="uName" /></td>
			</tr>
			<tr>
				<td><label path="password">Password:</label></td>
				<td><input type="password" name="uPass"
						id="uPass" /></td>
			</tr>
			<tr>
				<td></td>
				<td align="left"><input type="submit" name="login" value="login"/></td>
			</tr>

			<tr></tr>
			<tr>
				<td></td>
				<td><a href="home.jsp">Home</a></td>
			</tr>
		</table>
	</form:form>
	<table align="center">
		<tr>
			<td style="font-style: italic; color: red;">${message}</td>
		</tr>
	</table>
