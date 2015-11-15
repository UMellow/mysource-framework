<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<% 
	String path = request.getContextPath(); 
%>

<!DOCTYPE html>
<html lang="zh-CN">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
	<meta name="description" content="">
	<meta name="author" content="">
	
	<title>Starter Template for Bootstrap</title>
	
	<link rel="stylesheet" href="<%=path %>/js/jquery-easyui-1.4.3/themes/default/easyui.css">
	<link rel="stylesheet" href="<%=path %>/js/jquery-easyui-1.4.3/themes/icon.css">
</head>

<body>

	<div class="easyui-dialog" style="width:400px;height:200px"
	    data-options="title:'My Dialog',collapsible:true,iconCls:'icon-ok',onOpen:function(){}">
	        dialog content.
	</div>
	
	<input id="cc" style="width:200px" />
	
	<table id="tableGrid"></table>
	

	<script src="<%=path %>/js/jquery/jquery-1.10.2.js"></script>
	<script src="<%=path %>/js/jquery-easyui-1.4.3/jquery.easyui.min.js"></script>
	<script src="<%=path %>/js/jquery-easyui-1.4.3/locale/easyui-lang-zh_CN.js"></script>

	<script>
		var path = '<%=path %>';
	
		$('#tableGrid').datagrid({
			title : '角色信息列表',
			iconCls : 'icon-save',
			height : 420,
			width:1040,
			nowrap : false,
			autoRowHeight : false,
			striped : true,
			loadMsg : '正在加载中...',
			singleSelect : true,
			url : path + '/getData1.do',
			sortName : 'id',
			sortOrder : 'desc',
			remoteSort : false,
			idField : 'id',
			fitColumns : true,
			pagination : true,
			rownumbers : true,
			pageSize : 15,
			pageList : [ 10, 15, 20, 25, 30 ],
			columns : [ [ {
				field : 'sex',
				title : '角色名称',
				width : 150,
				align : 'center'
			}, {
				field : 'age',
				title : '角色描述',
				width : 150,
				align : 'center'
			} ] ]
		});
	
		
	</script>
</body>
</html>