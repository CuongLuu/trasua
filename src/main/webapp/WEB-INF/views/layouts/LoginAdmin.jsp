<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     <%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
    prefix="decorator" %>
<html lang="en">

<head>
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
</head>

<body>
   <decorator:body />
</body>

</html>