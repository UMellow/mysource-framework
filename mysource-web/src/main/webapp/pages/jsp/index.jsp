<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.io.*, java.util.*" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="ctx" value="<%= request.getContextPath() %>" />

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Index Jsp</title>
	
	<style type="text/css">
		#content {
			margin: 0 auto;
			width: 100%;
			height: 500px;
			/*background-color: orange;*/
		}
		
		.reqTable {
			margin: 0 auto;
			border: solid 1px;
		}
		
		.reqTable th {
			background-color: red;
		}
		
		.reqTable td {
			/*background-color: graytext;
			border: solid 1px;*/
		}
	</style>
</head>
<body>
	<div id="content">
		${ctx}
		<table class="reqTable">
			<tr>
				<th>Request Name</th>
				<th>Request Value(s)</th>
			</tr>
			<tr>
				<td>Content Path</td>
				<td>${ctx}</td>
			</tr>
			<%
				Enumeration<String> headnames = request.getHeaderNames();
				while(headnames.hasMoreElements()){
					String headname = headnames.nextElement();
					out.println("<tr><td>" + headname + "</td>");
					out.println("<td>" + request.getHeader(headname) + "</td></tr>");
				}
			%>
		</table>
	</div>
</body>
</html>