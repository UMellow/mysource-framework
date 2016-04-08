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

<!-- <link rel="icon" href="../../favicon.ico"> -->

<title>Starter Template for Bootstrap</title>

<!-- Bootstrap core CSS -->
<link href="<%=path%>/js/bootstrap/bootstrap-3.3.4-dist/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<link href="<%=path%>/js/bootstrap/bootstrap-table-master/dist/bootstrap-table.css" rel="stylesheet" type="text/css">
	
<style type="text/css"></style>
</head>
<body>
	<div class="container">
	    <div id="toolbar">
	        <button id="remove" class="btn btn-danger" disabled>
	            <i class="glyphicon glyphicon-remove"></i> Delete
	        </button>
	    </div>
	    <table id="table"
	           data-toolbar="#toolbar"
	           data-search="true"
	           data-show-refresh="true"
	           data-show-toggle="true"
	           data-show-columns="true"
	           data-show-export="true"
	           data-detail-view="true"
	           data-detail-formatter="detailFormatter"
	           data-minimum-count-columns="2"
	           data-show-pagination-switch="true"
	           data-pagination="true"
	           data-id-field="id"
	           data-page-list="[10, 25, 50, 100, ALL]"
	           data-show-footer="false"
	           data-side-pagination="server"
	           data-url="<%=path%>authentication/search"
	           data-response-handler="responseHandler">
	    </table>
	</div>

	<script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
	<script src="<%=path%>/js/bootstrap/bootstrap-3.3.4-dist/js/bootstrap.min.js"></script>
	<script src="<%=path%>/js/bootstrap/bootstrap-table-master/dist/bootstrap-table.js"></script>
	
	<script type="text/javascript">
	
		var $table = $('#table'),
		    $remove = $('#remove'),
		    selections = [];
	
		function detailFormatter(index, row) {
	        var html = [];
	        $.each(row, function (key, value) {
	            html.push('<p><b>' + key + ':</b> ' + value + '</p>');
	        });
	        return html.join('');
	    }
		
		function responseHandler(res) {
	        $.each(res.rows, function (i, row) {
	            row.state = $.inArray(row.id, selections) !== -1;
	        });
	        return res;
	    }
		
		function getHeight() {
	        return $(window).height();
	    }
		
		function initTable() {
	        $table.bootstrapTable({
	            height: getHeight(),
	            columns: [
	                [
	                    {
	                        field: 'state',
	                        checkbox: true,
	                        rowspan: 2,
	                        align: 'center',
	                        valign: 'middle'
	                    }, {
	                        title: 'IID',
	                        field: 'IID',
	                        rowspan: 2,
	                        align: 'center',
	                        valign: 'middle',
	                        sortable: true,
	                        footerFormatter: totalTextFormatter
	                    }, {
	                        title: 'Item Detail',
	                        colspan: 3,
	                        align: 'center'
	                    }
	                ],
	                [
	                    {
	                        field: 'name',
	                        title: 'Item Name',
	                        sortable: true,
	                        editable: true,
	                        footerFormatter: totalNameFormatter,
	                        align: 'center'
	                    }, {
	                        field: 'price',
	                        title: 'Item Price',
	                        sortable: true,
	                        align: 'center',
	                        editable: {
	                            type: 'text',
	                            title: 'Item Price',
	                            validate: function (value) {
	                                value = $.trim(value);
	                                if (!value) {
	                                    return 'This field is required';
	                                }
	                                if (!/^$/.test(value)) {
	                                    return 'This field needs to start width $.'
	                                }
	                                var data = $table.bootstrapTable('getData'),
	                                    index = $(this).parents('tr').data('index');
	                                console.log(data[index]);
	                                return '';
	                            }
	                        },
	                        footerFormatter: totalPriceFormatter
	                    }, {
	                        field: 'operate',
	                        title: 'Item Operate',
	                        align: 'center',
	                        events: operateEvents,
	                        formatter: operateFormatter
	                    }
	                ]
	            ]
	        });
	        // sometimes footer render error.
	        setTimeout(function () {
	            $table.bootstrapTable('resetView');
	        }, 200);
	        $table.on('check.bs.table uncheck.bs.table ' +
	                'check-all.bs.table uncheck-all.bs.table', function () {
	            $remove.prop('disabled', !$table.bootstrapTable('getSelections').length);
	            // save your data, here just save the current page
	            selections = getIdSelections();
	            // push or splice the selections if you want to save all data selections
	        });
	        $table.on('expand-row.bs.table', function (e, index, row, $detail) {
	            if (index % 2 == 1) {
	                $detail.html('Loading from ajax request...');
	                $.get('LICENSE', function (res) {
	                    $detail.html(res.replace(/\n/g, '<br>'));
	                });
	            }
	        });
	        $table.on('all.bs.table', function (e, name, args) {
	            console.log(name, args);
	        });
	        $remove.click(function () {
	            var ids = getIdSelections();
	            $table.bootstrapTable('remove', {
	                field: 'id',
	                values: ids
	            });
	            $remove.prop('disabled', true);
	        });
	        $(window).resize(function () {
	            $table.bootstrapTable('resetView', {
	                height: getHeight()
	            });
	        });
	    }
		
		$(function () {
			initTable();
		});
	
	</script>
</body>
</html>