package mysource.file;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/file2")
public class FileUploadController2 {

	@RequestMapping("/upload2")  
	public void uploadFile(HttpServletRequest request, HttpServletResponse response) throws IllegalStateException, IOException {    
	    try{
	        String path = "D:/upload/temp";
	        int flag = 1;

	        DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();
	        //设置内存缓冲区。超过后写入临时文件
	        diskFileItemFactory.setSizeThreshold(10240000);
	        //设置临时文件存储位置;
	        //diskFileItemFactory .setRepository设置这个是上传大文件的时候，不是把上传的所有数据一直存在内存中，而是当达到diskFileItemFactory.setSizeThreshold所设置的值后就存入临时文件,利用这个特性，可以使上传大文件的时候不会占用大量内存，可以提供用户的并发使用量
//	        diskFileItemFactory.setRepository(new File(request.getSession().getServletContext().getRealPath(path)));
	        diskFileItemFactory.setRepository(new File(path));

	        ServletFileUpload servletFileUpload = new ServletFileUpload(diskFileItemFactory);
	        servletFileUpload.setHeaderEncoding("utf-8");//设置文件上传的编码格式
	        servletFileUpload.setFileSizeMax(5*102400000);//单个文件最大上传值
	        servletFileUpload.setSizeMax(10*102400000);//整个request最大值
	        //servletFileUpload.setProgressListener(); 这是设置的一个监听器，就是通过它来获取已经上传的文件的大小
	        servletFileUpload.setProgressListener(new UploadProgressListener(request));//进度条

	        SimpleDateFormat simple = new SimpleDateFormat("yyyy/MM");  //获取日期格式
	        String dirPath = simple.format(new Date()); 
	        //保存的文件路径
	        String savePath = request.getSession().getServletContext().getRealPath("/"+dirPath); 
	        File saveDir = new File(savePath);
	        if(!saveDir.exists()){
	            saveDir.mkdirs();
	        }

	        try {
	            List<FileItem> itemList = new ArrayList<FileItem>();
	            itemList = servletFileUpload.parseRequest(request);
	            if(itemList.size() != 0){
	                for(int i=0; i<itemList.size(); i++){
	                    FileItem fileItem = (FileItem)itemList.get(i);
	                    if(!fileItem.isFormField() && fileItem.getName().length()>0){
	                        Long size = fileItem.getSize();  //文件大小
//	                        String fileName = takeOutFileName(fileItem.getName());
	                        String fileName = fileItem.getName();
	                        String newFileName = UUID.randomUUID().toString().replaceAll("-","")+fileName.substring(fileName.lastIndexOf(".")); 
	                        File uploadedFile = new File(savePath, newFileName);

	                        try {
	                            fileItem.write(uploadedFile);
	                            System.out.println("文件名："+newFileName+"文件大小为："+size);
	                        } catch (Exception e) {
	                            e.printStackTrace();
	                        }
	                        flag++;
	                    }
	                }
	            }
	        } catch (FileUploadException e) {
	            e.printStackTrace();
	        }
//	        request.getRequestDispatcher("/success.jsp").forward(request, response);                          
	    }catch(Exception e){
	        e.printStackTrace();
	    }
	} 



	//获取上传进度
	@RequestMapping("/status")  
	public void uploadStatus(HttpServletRequest request, HttpServletResponse response) throws IOException{
	    response.setContentType("text/html;charset=utf-8");
	    HttpSession session = request.getSession();
	    Object status = session.getAttribute("key");  //获取上传进度
	    if(status == null) return;
	    PrintWriter out = response.getWriter();
	    out.write(status.toString());
	    out.flush();
	    out.close();
	}   
}

