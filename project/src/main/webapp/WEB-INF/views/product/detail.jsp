<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@taglib uri="http://www.springframework.org/tags/form" prefix="s" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">

$(function () {
	
	$("#rating").rateYo({
		rating:0,
		numStars:5,
		maxValue:5,
		halfStar:true,
		onChange:function(rating, rateYoInstance){
			$('#hdrating').val(rating);
		}
	});
});
</script>
</head>
<body>
	<h3>Product Detail</h3>
	<a href="${pageContext.request.contextPath }/product">Back</a>
	<table border="1">
			<tr>
				<td>Id</td>
				<td>${product.id }</td>
			</tr>
			<tr>
				<td>Name</td>	
				<td>${product.name }</td>
			</tr>
			<tr>
				<td>Price</td>	
				<td>${product.price }</td>
			</tr>
			<tr>
				<td>Photo</td>	
				<td><img src="${pageContext.request.contextPath }/resources/images/${product.photo }"width="60"></td>
			</tr>
	</table>
	<h3>Rating and Review</h3>
	<table>
		<c:forEach var="r" items="${product.reviews }" varStatus="i">
			<tr>
				<td>
					<script type="text/javascript">
						
						$(function () {
							
							$("#rating${i.index }").rateYo({
								rating:${r.rating },
								readOnly:true
							});
						});
					</script>
					${r.account.username }
					<br>
					<div id="rating${i.index }"></div>
					${r.rating }
					<br>
					${r.content }
			</tr>
		</c:forEach>
		
	</table>
	<c:if test="${sessionScope.username == null }">
		<a href="${pageContext.request.contextPath } /account/login">Login to post your comment</a>
	</c:if>	
	
	<c:if test="${sessionScope.username != null }">
		<s:form method="post" commandName="review" 
		action="${pageContext.request.contextPath }/product/sendReview">
			<table border="0">
		
				<tr>
					<td>Rating</td>
					<td>
						<div id="rating"></div>
						<input type="hidden" id="hdrating" name="hdrating">
					</td>
				</tr>
				
				<tr>
					<td>Content</td>
					<td><s:textarea path="content"/></td>
				</tr>	
				<tr>
					<td>&nbsp;</td>
					<td>
						<input type="submit" value="Send">
						<s:hidden path="product.io"/>
					</td>
					
				</tr>	
			
			</table>
	</s:form>
	
	</c:if>
	
	
</body>
</html>