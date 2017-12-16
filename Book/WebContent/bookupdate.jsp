<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>UpdateBook</title>
</head>
<body>
	<form action="bookupdate?id=${book.book_id }" method="post">
	<img src="img/${book.img }"></img>
	<input type="text" value="${book.bookname }" name="name">
	<input type="text" value="${book.author }" name="author">
	<input type="text" value="${book.publisher }" name="publisher">
	<input type="text" value="${book.price }" name="price">
	<input type="text" value="${book.description }" name="description">
	<input type="submit" value="确认修改">
	</form>
	<a href="admin.jsp"><input type="button" value="返回admin"></a>
</body>
</html>