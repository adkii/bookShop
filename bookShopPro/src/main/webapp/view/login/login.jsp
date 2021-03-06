<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>登录页面</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="Free HTML5 Template by FreeHTML5.co" />
    <meta name="keywords" content="free html5, free template, free bootstrap, html5, css3, mobile first, responsive" />
    <!-- Facebook and Twitter integration -->
    <meta property="og:title" content=""/>
    <meta property="og:image" content=""/>
    <meta property="og:url" content=""/>
    <meta property="og:site_name" content=""/>
    <meta property="og:description" content=""/>
    <meta name="twitter:title" content="" />
    <meta name="twitter:image" content="" />
    <meta name="twitter:url" content="" />
    <meta name="twitter:card" content="" />

    <!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
    <link rel="shortcut icon" href="favicon.ico">

    <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,700,300' rel='stylesheet' type='text/css'>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/include/login/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/include/login/css/animate.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/include/login/css/style.css">


    <!-- Modernizr JS -->
    <script src="${pageContext.request.contextPath}/include/login/js/modernizr-2.6.2.min.js"></script>
    <!-- FOR IE9 below -->
    <!--[if lt IE 9]>
    <script src="${pageContext.request.contextPath}/include/login/js/respond.min.js"></script>
    <![endif]-->
    <%--<style type="text/css">--%>
        <%--.style-2{--%>
            <%--background-color: #ffffff;--%>
            <%--background-size: cover;--%>
            <%--background-position: -30% center;--%>
            <%--background-repeat: no-repeat;--%>
            <%--background-image: url(${pageContext.request.contextPath}/include/login/images/bg_2.jpg);--%>
            <%--height: 100%;--%>
        <%--}--%>
    <%--</style>--%>
</head>
<body class="style-2">
<div class="container">
    <div class="row">
        <div class="col-md-12 text-center">
            <ul class="menu">
                <li>优秀是一种习惯</li>
            </ul>
        </div>
    </div>
    <div class="row">
        <div class="col-md-4">
            <!-- Start Sign In Form -->
            <form action="${pageContext.request.contextPath}/checkLogin" class="fh5co-form animate-box" data-animate-effect="fadeInLeft">
                <h2>Sign In</h2>
                <div class="form-group">
                    <label for="username" class="sr-only">Username</label>
                    <input type="text" name="loginName" class="form-control" id="username" placeholder="Username" autocomplete="off">
                </div>
                <div class="form-group">
                    <label for="password" class="sr-only">Password</label>
                    <input type="password" name="password" class="form-control" id="password" placeholder="Password" autocomplete="off">
                </div>
                <div class="form-group">
                    <label for="remember"><input type="checkbox" id="remember"> Remember Me</label>
                </div>
                <div class="form-group">
                    <p>Not registered? <a href="sign-up2.html">Sign Up</a> | <a href="forgot2.html">Forgot Password?</a></p>
                </div>
                <div class="form-group">
                    <input type="submit" value="Sign In" class="btn btn-primary">
                </div>
            </form>
            <!-- END Sign In Form -->

        </div>
    </div>
    <div class="row" style="padding-top: 60px; clear: both;">
        <div class="col-md-12 text-center"><p><small>&copy; All Rights Reserved. More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></small></p></div>
    </div>
</div>

<!-- jQuery -->
<script src="${pageContext.request.contextPath}/include/Scripts/jquery-1.9.1.min.js"></script>
<!-- Bootstrap -->
<script src="${pageContext.request.contextPath}/include/login/js/bootstrap.min.js"></script>
<!-- Placeholder -->
<script src="${pageContext.request.contextPath}/include/login/js/jquery.placeholder.min.js"></script>
<!-- Waypoints -->
<script src="${pageContext.request.contextPath}/include/login/js/jquery.waypoints.min.js"></script>
<!-- Main JS -->
<script src="${pageContext.request.contextPath}/include/login/js/main.js"></script>
<script src="${pageContext.request.contextPath}/include/Scripts/layui/layui.js" type="text/javascript"/>
<script type="text/javascript">
</script>
</body>
</html>

