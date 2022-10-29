<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="s" %>        
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Sign Up</h3>
	<s:form method="post" commandName="account" 
	action="${pageContext.request.contextPath }/account/signup">
	<table border="1">
	
			<tr>
				<td>Username</td>
				<td><s:input path="username"/></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><s:password path="password"/></td>
			</tr>
			<tr>
				<td>Full name</td>
				<td><s:input path="fullName"/></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td><input type="submit" value="Save"></td>
			</tr>	
		
	</table>
 </s:form>	
</body>
</html>