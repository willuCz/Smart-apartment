<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>公寓信息一体化服务平台</title>
    <link href="css/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="css/index.css" rel="stylesheet">
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body lang="zh-cn">
<header>
    <div id="header-left">
        <div id="header-company">
            <img id="logo" src="image/index/logo.jpg">
            <img id="company" src="image/index/company.png">
        </div>
    </div>
    <div id="header">
        <img id="header-left-img-down" src="image/index/header-left-img-down.png"/>
        <img id="header-right-img-down" src="image/index/header-right-img-down.png"/>
        <img id="header-left-img" src="image/index/header-left-img.png"/>
        <h1>公寓信息一体化服务平台</h1>
        <img id="header-right-img" src="image/index/header-right-img.png"/>
    </div>
    <div id="header-right">
        <div id="header-right-user">
            <a id="header-username">用户名</a>
            <a id="header-exit">退出</a>
        </div>
        <ul id="header-right-time">
            <li id="weekOrder">第3周</li>
            <li class="date">2016年1月1日</li>
            <li class="date">星期一</li>
        </ul>
    </div>
</header>
<div role="contentinfo" id="content">
    <ul>
        <li><a href="#"><img src="image/index/button1.png"></a></li>
        <li><a href="#"><img src="image/index/button2.png"></a></li>
        <li><a href="#"><img src="image/index/button3.png"></a></li>
        <li><a href="#"><img src="image/index/button4.png"></a></li>
        <li><a href="#"><img src="image/index/button5.png"></a></li>
        <li><a href="#"><img src="image/index/button6.png"></a></li>
        <li><a href="#"><img src="image/index/button7.png"></a></li>
        <li><a href="#"><img src="image/index/button8.png"></a></li>
        <li><a href="#"><img src="image/index/button9.png"></a></li>
        <li><a href="#"><img src="image/index/button10.png"></a></li>
    </ul>
</div>
<footer>
    <ul>
        <li><a href="#"><img src="image/index/dorm.png"></a></li>
        <li><a href="#"><img src="image/index/dorm.png"></a></li>
        <li><a href="#"><img src="image/index/dorm.png"></a></li>
        <li><a href="#"><img src="image/index/dorm.png"></a></li>
        <li><a href="#"><img src="image/index/dorm.png"></a></li>
        <li><a href="#"><img src="image/index/dorm.png"></a></li>
        <li><a href="#"><img src="image/index/dorm.png"></a></li>
        <li><a href="#"><img src="image/index/dorm.png"></a></li>
        <li><a href="#"><img src="image/index/dorm.png"></a></li>
        <li><a href="#"><img src="image/index/dorm.png"></a></li>
    </ul>
    <div id="floor"><img src="image/index/floor.jpg"></div>
</footer>
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery/jquery-3.1.1.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="css/bootstrap/js/bootstrap.min.js"></script>
<script src="js/index.js"></script>
</body>
</html>
