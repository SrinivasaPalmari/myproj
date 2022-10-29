<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Login</h3>
	${error }
	<form method="post" action="${pageContext.request.contextPath }/account/login">
		<table border="1">
		
				<tr>
					<td>Username</td>
					<td><input type="text" name="username"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>
						<input type="submit" value="Login">
						<br>
						<a href="${pageContext.request.contextPath }/account/signup">Sign Up</a>
					</td>
					
					
				</tr>	
			
		</table>
	</form>
</body>
</html>