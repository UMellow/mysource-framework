<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Full Layout - jQuery EasyUI Demo</title>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/js/jquery-easyui-1.4.3/themes/bootstrap/easyui.css">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/js/jquery-easyui-1.4.3/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/js/jquery-easyui-1.4.3/demo/demo.css">
	<script type="text/javascript" src="../../jquery.min.js"></script>
	<script type="text/javascript" src="../../jquery.easyui.min.js"></script>
</head>
<body class="easyui-layout">
	<div data-options="region:'north',border:false" style="height:60px;background:#B3DFDA;padding:10px">north region</div>
	<div data-options="region:'west',split:true,title:'West'" style="width:150px;padding:10px;">west content</div>
	<div data-options="region:'east',split:true,collapsed:true,title:'East'" style="width:100px;padding:10px;">east region</div>
	<div data-options="region:'south',border:false" style="height:50px;background:#A9FACD;padding:10px;">south region</div>
	<div data-options="region:'center',title:'Center'"></div>
	
	<script src="<%=request.getContextPath() %>/js/jquery/jquery-1.10.2.js"></script>
	<script src="<%=request.getContextPath() %>/js/jquery-easyui-1.4.3/jquery.easyui.min.js"></script>
</body>
</html>