<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<div id="container" style="background-color: #EAEAEA; margin: 0 auto; padding: 0 0;">
		<div id="top" style="background-color: cyan; width: 100%; height: 100px;">
		</div>
		<div id="left" style="background-color: orange; width: 200px; float: left;">
		11
		</div>
		<div id="content" style="background-color: red; width: 300px; height: 200px">
		22
		</div>
	</div>


	<!--  
	<a id="include" href="#">123</a>	
	
	<div id="includeArea" style="width: 400px; height: 300px; background-color: orange;"></div>
	-->
	
	<script type="text/javascript" src="${ctx}/js/jquery/jquery-1.10.2.js"></script>
	<script type="text/javascript">
		$(function(){
			//var w=document.documentElement.clientWidth ;
			var h=document.documentElement.clientHeight;
			var ss=document.getElementById('container');
			alert(h);
			ss.style.height=(h-50) +"px";
			var lefth = h - 200;
			alert(lefth);
			document.getElementById('left').style.height=lefth +"px";
			
			$.get("${ctx}/systemmanage/msg.do", function(data, textStatus){
				$.each(eval(data), function(index, item){
					$("#top").html("<a href='#' onclick='showSubmenu()'>" + item.menuname + "</a>");
				});
			});			
		});
		
		function showSubmenu(){
			$.get("${ctx}/systemmanage/msg.do", function(data, textStatus){
				$.each(eval(data), function(index, item){
					$.each(eval(item.submenu), function(index, item){
						$("#left").html("<a href='#' onclick='load()'>" + item.menuname + "</a>");
					});
				});
			});
		}
		
		function load(){
			
		}
	</script>
	
</body>
</html>