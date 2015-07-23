<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

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

<!-- <link rel="icon" href="../../favicon.ico"> -->

<title>Starter Template for Bootstrap</title>

<!-- Bootstrap core CSS -->
<link
	href="<%=path%>/js/bootstrap/bootstrap-3.3.4-dist/css/bootstrap.min.css"
	rel="stylesheet" type="text/css">
<link rel="stylesheet"
	href="<%=path%>/js/bootstrap/bootstrap-table-master/dist/bootstrap-table.css">
	
<style type="text/css">
	.container {
		width: 100%;
		padding: 0 20px
	}
</style>
</head>

<body>

	<div class="container">

		<div class="row">
			<div class="col-lg-2" style="padding: 50px 0">
				<div class="panel-group" id="accordion">
					<div class="panel panel-default">
			    		<div class="panel-heading">
			      			<h4 class="panel-title">
			        			<a data-toggle="collapse" data-parent="#accordion" href="#collapseOne">
			          				系统管理
			        			</a>
			      			</h4>
			    		</div>
			    		<div id="collapseOne" class="panel-collapse collapse in">
			      			<div class="panel-body">
			      				<ul class="nav nav-pills nav-stacked">
									<li id="test1" role="presentation"><a id="btnShow1" href="#">Home</a></li>
								  	<li role="presentation"><a href="#">Profile</a></li>
								  	<li role="presentation"><a href="#">Messages</a></li>
								</ul>
						    </div>
			    		</div>
			  		</div>
			  		<div class="panel panel-default">
			    		<div class="panel-heading">
			      			<h4 class="panel-title">
				        		<a data-toggle="collapse" data-parent="#accordion" href="#collapseTwo">
				          			财务报表
				        		</a>
			      			</h4>
			    		</div>
			    		<div id="collapseTwo" class="panel-collapse collapse">
			      			<div class="panel-body">
			      				财务报表菜单区域
			      			</div>
			    		</div>
			  		</div>
				</div>
			</div>

			<div class="col-lg-10">
				<table id="table-javascript"></table>
			</div>
			
		</div>

	</div>

	<script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
	<script
		src="<%=path%>/js/bootstrap/bootstrap-3.3.4-dist/js/bootstrap.min.js"></script>
	<script
		src="<%=path%>/js/bootstrap/bootstrap-table-master/dist/bootstrap-table.js"></script>

	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug 
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>-->

	<script>
	
	    function operateFormatter(value, row, index) {
	        return [
	            '<a class="like" href="javascript:void(0)" title="Like">',
	                '<i class="glyphicon glyphicon-heart"></i>',
	            '</a>',
	            '<a class="edit ml10" href="javascript:void(0)" title="Edit">',
	                '<i class="glyphicon glyphicon-edit"></i>',
	            '</a>',
	            '<a class="remove ml10" href="javascript:void(0)" title="Remove">',
	                '<i class="glyphicon glyphicon-remove"></i>',
	            '</a>'
	        ].join('&nbsp;');
	    }

    
    	$(function(){
    		
    		$(".nav a").bind("click", function(){
    			
	    		var path = '<%=path %>';

	    		$(this).parent().prevAll().removeClass("active");
	    		$(this).parent().nextAll().removeClass("active");
	    		$(this).parent().addClass("active");
	    		
	    		$('#table-javascript').bootstrapTable({
	    			url: path + '/getData1.do',
	    			striped: true,
	    			search: true,
	    			showColumns: true,
	    			showRefresh: true,
	    			minimumCountColumns: 2,
	                height: 400,  
	                dataType: "json",
	    	        columns: [{
	    	            field: 'state',
	    	            checkbox: true,
	    	            title: '选择'
	    	        },{
	    	            field: 'name',
	    	            title: 'Name',  
	    	            align: 'center',
	    	            valign: 'bottom',
	    	            sortable: true
	    	        },{
	    	            field: 'sex',
	    	            title: 'Sex',
	    	            align: 'center',
	    	            valign: 'bottom'
	    	        },{
	    	            field: 'age',
	    	            title: 'Age',
	    	            align: 'center',
	    	            valign: 'bottom'
	    	        }, {
	                    field: 'operate',
	                    title: 'Item Operate',
	                    align: 'center',
	                    valign: 'middle',
	                    formatter: operateFormatter
	                }]
	        	});
	    	});
    	});
	</script>
</body>
</html>