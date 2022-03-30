<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="/taglib/taglib.jsp"%>
<div class="container">
	<div class="d-flex justify-content-center h-100">
		<div class="card">
			<div class="card-header">
				<h3>Đăng Nhập</h3>
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
		<%-- <h4>${LoginInfor}</h4> --%>

				<div class="d-flex justify-content-end social_icon">
=======
=======
>>>>>>> 85f30fd83e0e2974f2ee87b751d0e01e9330bbf6
				
<<<<<<< HEAD
				<div class="d-flex justify-content-end social_icon">
=======
				<div class="d-flex justify-content-end social_icon" style="margin-top: 30px">
<<<<<<< HEAD
=======
>>>>>>> refs/remotes/origin/minh
=======
<<<<<<< HEAD
<<<<<<< HEAD
		<%-- <h4>${LoginInfor}</h4> --%>

				<div class="d-flex justify-content-end social_icon">
=======
				
				<div class="d-flex justify-content-end social_icon" style="margin-top: 30px">
>>>>>>> 85f30fd83e0e2974f2ee87b751d0e01e9330bbf6
>>>>>>> 418d53e0ce486259fe99ae7c978b14eaaf959d33
=======
				<%-- <h4>${LoginInfor}</h4> --%>
				<div class="d-flex justify-content-end social_icon">
>>>>>>> 20fc8b644522b0aeb5ee11eb79478f4dde3086fd
<<<<<<< HEAD
=======
>>>>>>> c7b8b054995cd8f2dc60b42b86e731b4653b4577
>>>>>>> 85f30fd83e0e2974f2ee87b751d0e01e9330bbf6
					<span><i class="fab fa-facebook-square"></i></span>
					<span><i class="fab fa-google-plus-square"></i></span>
					<span><i class="fab fa-twitter-square"></i></span>
				</div>
			</div>
			<div class="card-body">
				<form:form action="login"  method="post" modelAttribute="user">
				 <a style="color:red;" target="blank">${Statuslogin}</a>
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-user"></i></span>
						</div>
						
						<form:input type="email" placeholder="username/email" class="form-control" id="username"
								path="email" pattern="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"/>
					</div>
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-key"></i></span>
						</div>
						
						<form:input type="password" class="form-control" placeholder="password" id="psw" path="matKhau"/>
					</div>
					<div class="row align-items-center remember">
						<input type="checkbox">Nhớ Mật Khẩu
					</div>
					<div class="form-group">
						<input type="submit" value="Đăng Nhập" class="btn btn-warning" style="margin-left:120px">
					</div>
				</form:form> 
			</div>
			<div class="card-footer">
				<div class="d-flex justify-content-center links">
					Bạn chưa có tài khoản??<a href="/trasua/register">Đăng Ký</a>
				</div>
				<div class="d-flex justify-content-center">
					<a href="#">Quên mật khẩu?</a>
				</div>
			</div>
		</div>
	</div>
</div>