<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="/taglib/taglib.jsp"%>
        <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Đăng nhập Admin</title> 
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <style>
        body {
            background: linear-gradient(132deg, #f44336, #E91E63, #9C27B0, #673AB7, #3F51B5, #2196F3, #03A9F4, #00BCD4, #009688, #4CAF50, #FFC107, #FF9800, #f44336, #E91E63, #9C27B0, #673AB7, #3F51B5, #2196F3, #03A9F4, #00BCD4, #009688, #4CAF50, #FFC107, #FF9800);
            background-size: 400% 400%;
            animation: BackgroundGradient 30s ease infinite;
        }
        
        @keyframes BackgroundGradient {
            0% {
                background-position: 0% 50%;
            }
            50% {
                background-position: 100% 50%;
            }
            100% {
                background-position: 0% 50%;
            }
        }
        
        .baslik {
            color: #fff;
            text-align: center;
            font-family: 'Fira Sans', sans-serif;
        }
        
        .arkalogin {
            width: 300px;
            text-align: center;
            background: #fff;
            height: 300px;
            padding: 10px;
            margin: 50px auto;
        }
        
        .loginbaslik {
            color: #888888;
            text-align: left;
            font-size: 19px;
            margin-top: 15px;
        }
        
        .giris {
            width: 100%;
            height: 40px;
            margin-top: 10px;
            border: none;
            background: #E5E5E5;
            outline: none;
            padding: 0 10px;
        }
        
        .butonlogin {
            width: 100%;
            margin-top: 10px;
            height: 40px;
            font-weight: bold;
            background: #2196F3;
            border: none;
            color: #fff;
            transition: all 250ms;
        }
        
        .butonlogin:hover {
            background: #1E88E5;
        }
        
        body {
            margin: 0;
        }
    </style>
 <section style="height: 100vh;">
        <div style="background-image: url(images/arka.jpg); background-attachment: fixed; background-size: cover; width: 100%; height: 100vh; position: relative;">
            <div class="baslik">
                <b style="font-size: 101px; text-align: center; margin-bottom: -21px; display: block;">CHNM</b>
                <span style="font-size: 19px; text-align: center; display: block; margin-bottom: 25px;">Xin Chào!!</span>
            </div>
            <section>
                <form:form action="/trasua/admin/login" method="post" modelAttribute="user">
                    <div class="arkalogin">
                        <div class="loginbaslik">Đăng nhập</div>
                        <hr style="border: 1px solid #ccc;">
                        <!-- <input class="giris" type="text" name="kadi" placeholder="Email"> -->
                        <form:input type="email" name="kadi" placeholder="username/email" class="giris" id="username"
								path="email" pattern="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"/>
                        <!-- <input class="giris" type="password" name="sifre" placeholder="•••••"> -->
                        <form:input type="password" class="giris" name="sifre" placeholder="password" id="psw" path="matKhau"/>
                        <a style="color:red;" target="blank">${StatusloginAdmin}</a>
                        <input class="butonlogin" type="submit" name="" value="Đăng Nhập" />
                    </div>
                </form:form> 
            </section><br>
            <span style="font-size: 23px; text-align: center; display: block; color: #E6E6E6;
        ">Chào mừng đến với trang quản trị</span>
            <span style="font-size: 24px; text-align: center; display: block; color: #fff; font-weight: bold; margin-bottom: 34px;
        ">Đăng nhập</span>
            <span style="font-size: 17px; text-align: center; display: block; color: #fff;
        ">www.trasuaCHNM.com</span>
        </div>
    </section>