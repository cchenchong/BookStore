<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>BookDetail</title>
<link href="css/templatemo_style.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<div id="templatemo_container">
		<div id="templatemo_menu">
			<ul>
				<li><a href="Shop.jsp">Home</a></li>
				<li><a href="#" class="current">Search</a></li>
				<li><a href="Shop.jsp">Books</a></li>
				<li><a href="Shop.jsp">New Releases</a></li>
				<li><a href="#">Company</a></li>
				<li><a href="#">Contact</a></li>
			</ul>
		</div>
		<div id="templatemo_header">
			<div id="templatemo_special_offers">
				<p>
					<span>25%</span> discounts for purchase over $ 40
				</p>
				<a href="#" style="margin-left: 50px;">Read more...</a>
			</div>
			<div id="templatemo_new_books">
				<ul>
					<li>Suspen disse</li>
					<li>Maece nas metus</li>
					<li>In sed risus ac feli</li>
				</ul>
				<a href="#" style="margin-left: 50px;">Read more...</a>
			</div>
		</div>
		<!-- end of header -->
		<div id="templatemo_content">
			<div id="templatemo_content_left">
				<div class="templatemo_content_left_section">
					<h1>Categories</h1>
					<ul>
						<li><a href="Shop.jsp">Donec accumsan urna</a></li>
						<li><a href="Shop.jsp">Proin vulputate justo</a></li>
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
						<li><a href="http://www.cssmoban.com" target="_parent">CSSTemplates</a></li>
						<li><a href="#" target="_parent">Web Design</a></li>
						<li><a href="#" target="_parent">Free Photos</a></li>
					</ul>
				</div>
				<div class="templatemo_content_left_section">
					<a href="http://validator.w3.org/check?uri=referer">
					<img style="border: 0; width: 88px; height: 31px" src="http://www.w3.org/Icons/valid-xhtml10" alt="Valid XHTML 1.0 Transitional" width="88" height="31" vspace="8" border="0" />
					</a> 
					<a href="http://jigsaw.w3.org/css-validator/check/referer">
					<img style="border: 0; width: 88px; height: 31px" src="http://jigsaw.w3.org/css-validator/images/vcss-blue" alt="Valid CSS!" vspace="8" border="0" />
					</a>
				</div>
			</div>
			<div id="templatemo_content_right">
				<h1>
					Book Title 
				</h1>
				<div class="image_panel">
					<img src="img/${book.img }" alt="CSS Template" width="100" height="150" />
				</div>
				<h2>BookName:${book.bookname }</h2>
				<ul>
					<li>Author:${book.author }</li>
					<li>January 2024</li>
					<li>Pages: 498</li>
					<li>publisher:${book.publisher }</li>
				</ul>
				<p>${book.description }</p>
				<div class="cleaner_with_height">&nbsp;</div>
				<a href="index.html">
				<img src="img/templatemo_ads.jpg" alt="css template ad" />
				</a>
			</div>
			<div class="cleaner_with_height">&nbsp;</div>
		</div>
		<div id="templatemo_footer">
			<a href="shop.jsp">Home</a> | <a href="shop.jsp">Search</a> | <a
				href="shop.jsp">Books</a> | <a href="#">New Releases</a> | <a
				href="#">FAQs</a> | <a href="#">Contact Us</a><br /> Copyright ©
			2024 <a href="#"><strong>Your Company Name</strong></a> | from <a
				href="http://www.cssmoban.com" target="_parent">网站模板</a>
		</div>
	</div>
</body>
</html>