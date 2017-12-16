<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>admin</title>
</head>
<body>
	<form action="finduser">
		<input type="submit" value="查询用户">
	<h3>User</h3>
	<table>
		<tr>
			<td>name</td>
			<td>password</td>
			<td>email</td>
			<td>address</td>
			<td>tel</td>
		</tr>
		<c:forEach items="${list }" var="l">
			<tr>
				<td>${l.name }</td>
				<td>${l.password}</td>
				<td>${l.email }</td>
				<td>${l.address }</td>
				<td>${l.tel }</td>
				<form action="user_delete?id=${ l.id}" method="post">
					<td><input type="submit" value="delete"></input></td>
				</form>
			</tr>
		</c:forEach>
	</table>
	</form>
	<form action="findorder">
		<input type="submit" value="查询订单">
	<h3>Order</h3>
	<table>
		<tr>
			<td>name</td>
			<td>tel</td>
			<td>email</td>
			<td>address</td>
		</tr>
		<c:forEach items="${orders }" var="o">
			<tr>
				<td>${o.name }</td>
				<td>${o.email }</td>
				<td>${o.address }</td>
				<td>${o.tel }</td>
				<form action="order_delete?id=${ o.id}" method="post">
					<td><input type="submit" value="delete"></input></td>
				</form>
			</tr>
		</c:forEach>
	</table>
		</form>
		<form action="findbook">
		<input type="submit" value="查询book">
	<h3>Book</h3>
	<table>
		<tr>
			<td>name</td>
			<td>img</td>
			<td>author</td>
			<td>publisher</td>
			<td>price</td>
			<td>description</td>
		</tr>
		<c:forEach items="${book }" var="b">
			<tr>
				<td>${b.bookname }</td>
				<td><img src="${ctx}/img/${b.img }"></img></td>
				<td>${b.author }</td>
				<td>${b.publisher }</td>
				<td>${b.price }</td>
				<td>${b.description }</td>
				<td><a href="book1?id=${ b.book_id}"><input type="button" value="更新图书"></input></a></td>
				<td><a href="book_delete?id=${ b.book_id}"><input type="button" value="delete"></input></td>
				</a>
			</tr>
		</c:forEach>
	</table>
		</form>
<a href="bookModify.jsp"><input type="button" value="新增图书"></input></a>
</body>
</html>