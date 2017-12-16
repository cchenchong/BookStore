<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Order</title>
</head>
<body>
<table>
		<tr>
			<td>img</td>
			<td>price</td>
			<td>count of Book</td>
		</tr>
		<c:set var="Allprice" value="0" /> 
		<c:forEach items="${list }" var="l">
			<tr>
				<td><img src="${ctx}/img/${l.img }"></img></td>
				<td>${l.price }</td>
				<td>${l.count }</input></td>
				<c:set var="Allprice" value="${l.price*l.count+Allprice }" /> 
			</tr>
		</c:forEach>
	</table>
	Allprice: ${Allprice }</br>
	name:${order.name }address:${order.address }
	<a href="Shop.jsp"><input type="submit" value="确认订单"></a>
</body>
</html>