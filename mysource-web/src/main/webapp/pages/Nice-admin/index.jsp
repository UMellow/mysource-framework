<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<% 
	String path = request.getContextPath(); 
%>

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description"
		content="Creative - Bootstrap 3 Responsive Admin Template">
	<meta name="author" content="GeeksLabs">
	<meta name="keyword"
		content="Creative, Dashboard, Admin, Template, Theme, Bootstrap, Responsive, Retina, Minimal">
	<link rel="shortcut icon" href="<%=path%>/js/Nice-admin/img/favicon.png">
	
	<title>Basic Table | Creative - Bootstrap 3 Responsive Admin Template</title>
	
	<!-- Bootstrap CSS -->
	<link href="<%=path%>/js/bootstrap/bootstrap-3.3.4-dist/css/bootstrap.min.css" rel="stylesheet">
	<!-- bootstrap theme -->
	<link href="<%=path%>/js/bootstrap/bootstrap-3.3.4-dist/css/bootstrap-theme.css" rel="stylesheet">
	<!--external css-->
	<!-- font icon -->
	<link href="<%=path%>/js/Nice-admin/css/elegant-icons-style.css" rel="stylesheet" />
	<link href="<%=path%>/js/Nice-admin/css/font-awesome.min.css" rel="stylesheet" />
	<!-- Custom styles -->
	<link href="<%=path%>/js/Nice-admin/css/style.css" rel="stylesheet">
	<link href="<%=path%>/js/Nice-admin/css/style-responsive.css" rel="stylesheet" />
</head>

<body>
<div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
			<header class="header dark-bg">
				<div class="toggle-nav">
					<div class="icon-reorder tooltips" data-original-title="Toggle Navigation" data-placement="bottom"></div>
				</div>

				<!--logo start-->
				<a href="index.html" class="logo"><span class="lite">DWS</span></a>
				<!--logo end-->

				<div class="nav search-row" id="top_menu"></div>

				<div class="top-nav notification-row">
					<ul class="nav pull-right top-menu">
						<li class="dropdown">
							<a data-toggle="dropdown" class="dropdown-toggle" href="#"> 
								<span class="profile-ava"><img alt="" src="<%=path%>/js/Nice-admin/img/avatar1_small.jpg"></span> 
								<span class="username">赵 翊</span>
								<b class="caret"></b>
							</a>
							<ul class="dropdown-menu extended logout">
								<li class="eborder-top"><a href="#"><i class="icon_profile"></i>个人信息</a></li>
								<li><a href="#"><i class="icon_mail_alt"></i>修改密码</a></li>
								<li><a href="#"><i class="icon_clock_alt"></i>我的账单</a></li>
								<li><a href="#"><i class="icon_chat_alt"></i>优惠券</a></li>
								<li><a href="#"><i class="icon_key_alt"></i>退出登录</a></li>
							</ul>
						</li>
					</ul>
				</div>
			</header>
		</div>
	</div>

	<div class="row">
		<div class="col-md-2">
			<div id="sidebar" class="nav-collapse">
				<ul class="sidebar-menu">
					<li class="">
						<a class="" href="index.html"> <i class="icon_house_alt"></i> <span>首页</span> </a>
					</li>
					<li class="sub-menu">
						<a href="javascript:;" class=""> 
							<i class="icon_document_alt"></i> <span>Forms</span> <span class="menu-arrow arrow_carrot-right"></span> 
						</a>
						<ul class="sub">
							<li><a class="" href="form_component.html">Form Elements</a></li>
							<li><a class="" href="form_validation.html">Form Validation</a></li>
						</ul>
					</li>
					<li class="sub-menu">
						<a href="javascript:;" class=""> 
							<i class="icon_desktop"></i> <span>UI Fitures</span> <span class="menu-arrow arrow_carrot-right"></span>
						</a>
						<ul class="sub">
							<li><a class="" href="general.html">Components</a></li>
							<li><a class="" href="buttons.html">Buttons</a></li>
							<li><a class="" href="grids.html">Grids</a></li>
						</ul>
					</li>
					<li>
						<a class="" href="widgets.html"> <i class="icon_genius"></i> <span>Widgets</span> </a>
					</li>
					<li>
						<a class="" href="chart-chartjs.html"> <i class="icon_piechart"></i> <span>Charts</span> </a>
					</li>

					<li class="sub-menu"><a href="javascript:;" class=""> <i
							 class="icon_table"></i> <span>Tables</span> <span
							class="menu-arrow arrow_carrot-right"></span>
					</a>
						<ul class="sub">
							<li><a class="active" href="basic_table.jsp" target="myiframe">Basic
									Table</a></li>
						</ul></li>

					<li class="sub-menu"><a href="javascript:;" class=""> <i
							class="icon_documents_alt"></i> <span>Pages</span> <span
							class="menu-arrow arrow_carrot-right"></span>
					</a>
						<ul class="sub">
							<li><a class="" href="profile.html">Profile</a></li>
							<li><a class="" href="login.html"><span>Login
										Page</span></a></li>
							<li><a class="" href="blank.html">Blank Page</a></li>
							<li><a class="" href="404.html">404 Error</a></li>
						</ul></li>

				</ul>
			</div>
		</div>

		<div class="col-md-10">
			<iframe id="myiframe" name="myiframe"  width="100%" scrolling="no" frameborder="0" style="position: relative; top: 80px;" onload="changeFrameHeight();">
				<p>Your browser does not support iframes.</p>
			</iframe>
		</div>
	</div>
</div>

<!--main content start-->


<!-- container section end -->
<!-- javascripts -->
<script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
<script
	src="<%=path%>/js/bootstrap/bootstrap-3.3.4-dist/js/bootstrap.min.js"></script>
<!-- nicescroll -->
<script src="<%=path%>/js/Nice-admin/js/jquery.scrollTo.min.js"></script>
<script src="<%=path%>/js/Nice-admin/js/jquery.nicescroll.js"
	type="text/javascript"></script>
<!--custome script for all page-->
<script src="<%=path%>/js/Nice-admin/js/scripts.js"></script>

<script type="text/javascript">
	function changeFrameHeight(){
	    var ifm= document.getElementById("myiframe"); 
	    ifm.height=document.documentElement.clientHeight - 85;
	}
	window.onresize=function(){  
	     changeFrameHeight();  
	} 
</script>

</body>
</html>
