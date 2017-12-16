<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd" >
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>BookCar</title>
</head>
<body>
	<table>
		<tr>
			<td>img</td>
			<td>price</td>
			<td>count of Book</td>
			<td>Are you sure</td>
		</tr>
		<c:set var="Allprice" value="0" /> 
		<c:forEach items="${list }" var="l">
			
			<form action="<%=request.getContextPath()%>/update?id=${ l.bookcar_id}" method="post">
			<tr>
				<td><img src="${ctx}/img/${l.img }"></img></td>
				<td>${l.price }</td>
				<td><input type="text" value="${l.count }" name="count"></input></td>
				<td><input type="submit" value="ok"/></td>
			</form>
			<form action="<%=request.getContextPath()%>/delete?id=${ l.bookcar_id}" method="post">
				<td><input type="submit" value="delete"></input></td>
			</form>
				<c:set var="Allprice" value="${l.price*l.count+Allprice }" /> 
			</tr>
		</c:forEach>
	</table>
	Allprice: ${Allprice }</br>
	userName:${User.name }</br>
	userAddress:${User.address}</br>
	userTel:${User.tel }</br>
	userEmail:${User.email }
<form action="order?name=${User.name }&address=${User.address}&tel=${User.tel }&email=${User.email }" method="post">
<input type="submit" value="payFor"></input>
</form>
</body>
</html>