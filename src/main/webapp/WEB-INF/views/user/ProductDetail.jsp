
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!-- Start All Pages -->
	<div class="all-page-title page-breadcrumb">
		<div class="container text-center">
			<div class="row">
				<div class="col-lg-12">
					<h1>Chi tiết sản phẩm</h1>
				</div>
			</div>
		</div>
	</div>
<!-- End All Pages -->
	<!-- Start About -->
	<div class="about-section-box">
		<div class="container">
			<div class="row">
				<div class="col-lg-6 col-md-6 text-center">
				
					<div class="inner-column">
						<h1>Welcome To <span>Live Dinner Restaurant</span></h1>
						<h9>${item.tenSanPham}</h9>
						<p>Tên sản phẩm ${item.tenSanPham}</p>
						<a class="btn btn-lg btn-circle btn-outline-new-white" href="#">Mua hàng</a>
					</div>
				</div>
				<div class="col-lg-6 col-md-6">
				<c:forEach var="item" items="${sanpham}">
				
									<div class="col-lg-4 col-md-6 special-grid drinks">
										<div class="gallery-single fix">
											<img
												src="<c:url value="/template/templateUser/images/${item.hinhAnh }"/>"
												class="img-fluid" alt="Image">
											<div class="why-text">
												<h4>${item.tenSanPham}</h4>
												<h5>${item.giaBan}</h5>
											</div>
										</div>
									</div>
								</c:forEach>
					<%-- <img src="<c:url value= "/template/templateUser/images/${item.hinhAnh }}"/>" alt="" class="img-fluid"> --%>
				</div>
				<div class="col-md-12">
					<div class="inner-pt">
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- End About -->