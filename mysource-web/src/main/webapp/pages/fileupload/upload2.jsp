<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<script type="text/javascript" src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.js"></script>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Add New File Upload</title>
	
	<script type="text/javascript">  
	    j = 1;  
	    $(document).ready(function(){         
	        $("#addNewFile").click(function(){  
	            document.getElementById("newUpload").innerHTML+='<div id="div_'+j+'"><input  name="file_'+j+'" type="file"  /><input type="button" value="删除"  onclick="addNewFile('+j+')"/></div>';
	            j = j + 1;  
	        });  
	    });   
	
	    function addNewFile(o){  
	        document.getElementById("newUpload").removeChild(document.getElementById("div_"+o));  
	    } 
	</script>
</head>
<body> 
    <form id="uploadForm" name="uploadForm" action="${pageContext.request.contextPath}/file2/upload2" enctype="multipart/form-data" method="post">  
        <div id="newUpload">
            <input type="file" name="file">  
        </div>

        <input type="button" id="addNewFile" value="增加一行" >  
        <input type="button" onclick="uploadFile();" name="uploadButton" id="uploadButton" value="上传">              
    </form>   
    
    <div style="width:273px;">
        <div id="show" style="background:#0ff;height:26px;width:0%;"></div>
    </div>
    
    <span id="msg"></span>
</body>

<script type="text/javascript">
    var progress;
    var uploadProcessTimer = null;

    function uploadFile(){
        //每隔100ms执行callback
        uploadProcessTimer = window.setInterval("getFileUploadProcess()", 100);
        document.forms[0].submit();
    }

    function getFileUploadProcess(){
        $.ajax({
            type:"GET",
            url:"${pageContext.request.contextPath}/file2/status",
            dataType:"text",
            cache:false,
            success:function(data){
                if(data=="100%"){
                    window.clearInterval(uploadProcessTimer);
                }else{
                    progress=data;
                    $("#show").width(data);
                    $("#msg").text(data);
                }
            }
        });
    };
</script>
</html>