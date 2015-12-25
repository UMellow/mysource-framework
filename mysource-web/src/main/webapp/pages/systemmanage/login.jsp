<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="ctx" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>User Login</title>
	
	<link rel="stylesheet" type="text/css" href="${ctx}/css/systemmanage/login.css" />
	<link rel="stylesheet" type="text/css" href="${ctx}/js/jBox-master/jBox.css" />
	<!--  
	<script src="${ctx}/js/jquery/jquery-1.10.2.js" type="text/javascript"></script>
	-->
	<script src="//code.jquery.com/jquery-1.11.0.js"></script>
	<script src="${ctx}/js/jBox-master/jBox.min.js" type="text/javascript"></script>
	
	<script src="${ctx}/js/systemmanage/login/login.js" type="text/javascript"></script>
</head>
<body>
	<div id="jBox1"
		class="jBox-wrapper jBox-Modal jBox-Default jBox-closeButton-box"
		style="position: fixed; z-index: 10000; left: 50%; top: 50%; margin-left: -262.5px; margin-top: -100px; display: block; opacity: 1; display: none">
		<div class="jBox-container" style="width: auto; height: auto;">
			<div class="jBox-content"
				style="line-height: 40px; padding: 60px 80px; text-align: center;">
				As with tooltips, you have<br>many options to change appearance
				and behavior
			</div>
			<div class="jBox-closeButton jBox-noDrag"></div>
		</div>
	</div>

	<div class="top_div"></div>
	
	<form id="login_form" action="${ctx}/systemmanage/login.do" method="post">
		<div style="background: rgb(255, 255, 255); margin: -100px auto auto; border: 1px solid rgb(231, 231, 231); border-image: none; width: 400px; height: 200px; text-align: center;">
			<div style="width: 165px; height: 96px; position: absolute;">
				<div class="tou"></div>
				<div class="initial_left_hand" id="left_hand"></div>
				<div class="initial_right_hand" id="right_hand"></div>
			</div>
			<p style="padding: 30px 0px 10px; position: relative;">
				<span class="u_logo"></span> 
				<input class="ipt" type="text" placeholder="请输入用户名或邮箱" value=""> 
	    	</p>
			<p style="position: relative;">
				<span class="p_logo"></span>         
				<input class="ipt" id="password" type="password" placeholder="请输入密码" value="">   
	  		</p>
			<div style="height: 50px; line-height: 50px; margin-top: 30px; border-top-color: rgb(231, 231, 231); border-top-width: 1px; border-top-style: solid;">
				<P style="margin: 0px 35px 20px 45px;">
					<span style="float: left;">
						<a style="color: rgb(204, 204, 204);" href="#">忘记密码?</a>
					</span> 
	           		<span style="float: right;">
	           			<a style="color: rgb(204, 204, 204); margin-right: 10px;" href="#">注册</a>  
	              		<a style="background: rgb(0, 142, 173); padding: 7px 10px; border-radius: 4px; border: 1px solid rgb(26, 117, 152); border-image: none; color: rgb(255, 255, 255); font-weight: bold;" onclick="myModal.open();">登录</a> 
	           		</span>      
	           		<span style="padding: 0 10px 0 0; cursor: pointer;" onclick="doSubmit()">Open jBox!</span>   
	           	</p>
	        </div>
	    </div>
    </form>
    
    <script type="text/javascript">
    	var myModal;
	    $(document).ready(function() {
	    	myModal = new jBox('Modal', {
	    		content: $("#jBox1"),
	    		fade: 180,
	    		animation: slide
	    	});
	    });
	</script>
</body>
</html>