<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     <%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
    prefix="decorator" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">   
   
    <!-- Mobile Metas -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
 
     <!-- Site Metas -->
    <title>Trà sữa CHNM</title>  
    <meta name="keywords" content="">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Site Icons -->
    <link rel="shortcut icon" href="<c:url value="templateUser/images/favicon.ico" />" type="image/x-icon">
    <link rel="apple-touch-icon" href="<c:url value="templateUser/images/apple-touch-icon.png"/>">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="<c:url value="templateUser/css/bootstrap.min.css"/>">    
	<!-- Site CSS -->
    <link rel="stylesheet" href="<c:url value="templateUser/css/style.css"/>">    
    <!-- Responsive CSS -->
    <link rel="stylesheet" href="<c:url value="templateUser/css/responsive.css"/>">
    <!-- Custom CSS -->
    <link rel="stylesheet" href="<c:url value="templateUser/css/custom.css"/>">

    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

	
<body>
	<%@include file ="/WEB-INF/views/layouts/user/header.jsp" %>
	<%-- <%@include file ="/WEB-INF/views/user/index.jsp" %>
	 --%>
	<decorator:body />
	
	<%@include file ="/WEB-INF/views/layouts/user/footer.jsp" %>
	
	<!-- ALL JS FILES -->
	<script src="<c:url value="templateUser/js/jquery-3.2.1.min.js" />"></script>
	<script src="<c:url value="templateUser/js/popper.min.js" />"></script>
	<script src=<c:url value="templateUser/js/bootstrap.min.js" />></script>
    <!-- ALL PLUGINS -->
	<script src=<c:url value="templateUser/js/jquery.superslides.min.js" />></script>
	<script src=<c:url value="templateUser/js/images-loded.min.js" />></script>
	<script src=<c:url value="templateUser/js/isotope.min.js" />></script>
	<script src=<c:url value="templateUser/js/baguetteBox.min.js" />></script>
	<script src=<c:url value="templateUser/js/form-validator.min.js" />></script>
    <script src=<c:url value="templateUser/js/contact-form-script.js" />></script>
    <script src=<c:url value="templateUser/js/custom.js" />></script>
</body>
</html>