<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<form action="<%=request.getContextPath() %>/mail/webPath" method="post">	
		<textarea rows="10" cols="5" name="ckeditor01"></textarea>	
		
		<script type="text/javascript" src="<%=request.getContextPath() %>/ckeditor/ckeditor.js"></script>
		
		<script type="text/javascript">
			CKEDITOR.replace('ckeditor01');
		</script>
		
		<input type="submit" value="提交" />
	</form>
</body>
</html>