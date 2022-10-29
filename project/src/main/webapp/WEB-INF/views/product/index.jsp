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

	<h3>Products List</h3>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Price</th>
			<th>Photo</th>
			<th>Option</th>
		</tr>
		<c:forEach var="product" items="${products }">
			<tr>
				<td>${product.id }</td>
				<td>${product.name }</td>
				<td>${product.price }</td>
				<td><img src="${pageContext.request.contextPath }/resources/images/${product.photo }"width="60"></td>
				<td><a href="${pageContext.request.contextPath }/product/detail/${product.id }">Detail</a></td>
			</tr>	
		</c:forEach>
	</table>

</body>
</html>