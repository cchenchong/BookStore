<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd" >
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Book Store</title>
<link href="css/templatemo_style.css" rel="stylesheet" type="text/css" /> 
</head>
<body>
	<div id="templatemo_container">
		<div id="templatemo_menu">
			<ul>
				<li><a href="message.action" class="current">Home</a></li>
				<li><a href="message.action">Search</a></li>
				<li><a href="message.action">Books</a></li>
				<li><a href="message.action">New Releases</a></li>
				<li><a href="findCar">BookCar</a></li>
				<li><a href="#">Contact</a></li>
			</ul>
		</div>
		<div id="templatemo_header">
			<div id="templatemo_special_offers">
				<p>
					<span>25%</span> discounts for purchase over $80
				</p>
				<a href="subpage.html" style="margin-left: 50px;">Read more...</a>
			</div>
			<div id="templatemo_new_books">
				<ul>
					<li>Suspen disse</li>
					<li>Maece nas metus</li>
					<li>In sed risus ac feli</li>
				</ul>
				<a href="subpage.html" style="margin-left: 50px;">Read more...</a>
			</div>
		</div>
		<div id="templatemo_content">
			<div id="templatemo_content_left">
				<div class="templatemo_content_left_section">
					<h1>Categories</h1>
					<ul>
						<li><a href="subpage.html">Donec accumsan urna</a></li>
						<li><a href="subpage.html">Proin vulputate justo</a></li>
						<li><a href="#">In sed risus ac feli</a></li>
						<li><a href="#">Aliquam tristique dolor</a></li>
						<li><a href="#">Maece nas metus</a></li>
						<li><a href="#">Sed pellentesque placerat</a></li>
						<li><a href="#">Suspen disse</a></li>
						<li><a href="#">Maece nas metus</a></li>
						<li><a href="#">In sed risus ac feli</a></li>
					</ul>
				</div>
				<div class="templatemo_content_left_section">
					<h1>Bestsellers</h1>
					<ul>
						<li><a href="#">Vestibulum ullamcorper</a></li>
						<li><a href="#">Maece nas metus</a></li>
						<li><a href="#">In sed risus ac feli</a></li>
						<li><a href="#">Praesent mattis varius</a></li>
						<li><a href="#">Maece nas metus</a></li>
						<li><a href="#">In sed risus ac feli</a></li>
						<li><a href="#" target="_parent">Flash Templates</a></li>
						<li><a href="http://www.cssmoban.com" target="_parent">CSS Templates</a></li>
						<li><a href="#" target="_parent">Web Design</a></li>
						<li><a href="#" target="_parent">Free Photos</a></li>
					</ul>
				</div>
				<div class="templatemo_content_left_section">
					<a href="http://validator.w3.org/check?uri=referer">
					<img style="border: 0; width: 88px; height: 31px" src="http://www.w3.org/Icons/valid-xhtml10" alt="Valid XHTML 1.0 Transitional" width="88" height="31" vspace="8" border="0" /></a> 
						<a href="http://jigsaw.w3.org/css-validator/check/referer">
						<img style="border: 0; width: 88px; height: 31px" src="http://jigsaw.w3.org/css-validator/images/vcss-blue" alt="Valid CSS!" vspace="8" border="0" /></a>
				</div>
			</div>
				<form action="${ctx }/search1" method="post" name="thisform">
			<input type="text" name="name"/>
			<input type="submit" value="搜索" onclick="sel()"></input>
			</form>
			<c:forEach items="${book }" var="book">
				<img src="img/${book.img }" alt="image" />
			</c:forEach>
			<div id="templatemo_content_right">
				<c:forEach items="${page.getList() }" var="book">
					<div class="templatemo_product_box">
						<h1>${book.bookname }
							<span>author:${book.author}</span>
						</h1>
						<img src="img/${book.img }" alt="image" />
						<div class="product_info">
							<p>Etiam luctus. Quisque facilisis suscipit elit.Curabitur...</p>
							<h3>Price:${book.price }</h3>
							<div class="buy_now_button">
								<a href="car?img=${book.img }&price=${book.price}&id=${book.book_id }&count=1">Buy Now</a>
							</div>
							<div class="detail_button">
								<a href="details?id=${book.book_id }">Detail</a>
							</div>
						</div>
						<div class="cleaner">&nbsp;</div>
					</div>
				</c:forEach>
			<table>
				<tr>
					<td colspan="6" align="center" bgcolor="#5BA8DE">共${page.totalRecords}条记录	共${page.totalPages}页 当前第${page.pageNo}页<br> 
						<a	href="<%=request.getContextPath()%>/${method }?pageNo=${page.topPageNo}&name=${name}">
						<input	type="button" name="fristPage" value="首页" /></a> 
							<c:choose>
								<c:when test="${page.pageNo!=1}">
									<a href="<%=request.getContextPath()%>/${method }?pageNo=${page.previousPageNo }&name=${name} ">
									<input type="button" name="previousPage" value="上一页" /></a>
								</c:when>
								<c:otherwise>
									<input type="button" disabled="disabled" name="previousPage"	value="上一页" />
								</c:otherwise>
							</c:choose> 
							<c:choose>
								<c:when test="${page.pageNo != page.totalPages}">
									<a href="<%=request.getContextPath()%>/${method }?pageNo=${page.nextPageNo }&name=${name}">
									<input	type="button" name="nextPage" value="下一页" /></a>
								</c:when>
								<c:otherwise>
									<input type="button" disabled="disabled" name="nextPage"	value="下一页" />
								</c:otherwise>
							</c:choose> 
							<a href="<%=request.getContextPath()%>/${method }?pageNo=${page.bottomPageNo}&name=${name}">
							<input	type="button" name="lastPage" value="尾页" /></a>
					</td>
				</tr>
			</table>
			<a href="subpage.html"><img src="img/templatemo_ads.jpg"	alt="ads" /></a>
			<div class="cleaner_with_height">&nbsp;</div>
		</div>
		<div id="templatemo_footer">
			<a href="subpage.html">Home</a> | <a href="subpage.html">Search</a> |
			<a href="subpage.html">Books</a> | <a href="#">New Releases</a> | <a
				href="#">FAQs</a> | <a href="#">Contact Us</a><br /> Copyright ©
			2024 <a href="#"><strong>Your Company Name</strong></a> | from <a
				href="http://www.cssmoban.com" target="_parent" title="网站模板">网站模板</a>
		</div>
		<!-- end of footer -->
	</div>
	</div>
</body>
</html>