<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	 <%@ include file="/taglib/taglib.jsp"%>
<!-- Start header -->
	<header class="top-navbar">
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<div class="container">
				<a class="navbar-brand" href="/index.jsp">
					<img src="<c:url value="/template/templateUser/images/logo.png"/>" alt="" />
				</a>
				<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbars-rs-food" aria-controls="navbars-rs-food" aria-expanded="false" aria-label="Toggle navigation">
				  <span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbars-rs-food">
					<ul class="navbar-nav ml-auto">
						<li class="nav-item active"><a class="nav-link" href="trang-chu">Trang chủ</a></li>
						<li class="nav-item"><a class="nav-link" href="<c:url value="menu"/>">Thực đơn</a></li>
						<!-- <li class="nav-item"><a class="nav-link" href="about.html">About</a></li>
						<li class="nav-item dropdown">
							<a class="nav-link dropdown-toggle" href="#" id="dropdown-a" data-toggle="dropdown">Pages</a>
							<div class="dropdown-menu" aria-labelledby="dropdown-a">
								<a class="dropdown-item" href="reservation.html">Reservation</a>
								<a class="dropdown-item" href="stuff.html">Stuff</a>
								<a class="dropdown-item" href="gallery.html">Gallery</a>
							</div>
						</li>
						<li class="nav-item dropdown">
							<a class="nav-link dropdown-toggle" href="#" id="dropdown-a" data-toggle="dropdown">Blog</a>
							<div class="dropdown-menu" aria-labelledby="dropdown-a">
								<a class="dropdown-item" href="/blog.html">blog</a>
								<a class="dropdown-item" href="/blog-details.html">blog Single</a>
							</div>
						</li> -->
						
					</ul>
					<ul class="navbar-nav ml-auto">
					<li class="nav-item">
							<c:if test="${not empty LoginInfor }">
									<a href="#" class="dropdown-item">${ LoginInfor.tenNguoiDung }</a>
									
									<a href="logout" class="nav-link">Đăng xuất</a>
								</c:if>
								<c:if test="${ empty LoginInfor }">
									<a href="login" class="nav-link">Đăng nhập</a>
									
									<a href="register" class="nav-link">Đăng Ký</a>
								</c:if>
						</li>
					</ul>
				</div>
			</div>
		</nav>
	</header>
	<!-- End header -->
	