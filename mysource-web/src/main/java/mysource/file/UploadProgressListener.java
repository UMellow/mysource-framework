package mysource.file;

import java.text.NumberFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.ProgressListener;

public class UploadProgressListener implements ProgressListener {

    private HttpSession session;
    private long kiloBytes=-1;

    public UploadProgressListener(HttpServletRequest request){
        this.session = request.getSession();
    }

    public void update(long pBytesRead, long pContentLength, int pItems) {
        Long KBytes=pBytesRead/1024;
        if(kiloBytes==KBytes){
            return;
        }
        kiloBytes=KBytes;
        System.out.println("正在读取项目"+KBytes);
        if(pContentLength==-1){
            System.out.println("目前已经读取了"+pBytesRead+"字节数据");
        }else{
            System.out.println("目前已经读取了"+pContentLength+"中的"+pBytesRead);
        }
        //获取上传进度的百分比
        double read = (double)(KBytes)/(pContentLength/1024);
        NumberFormat nf = NumberFormat.getPercentInstance();
        session.setAttribute("key", nf.format(read));
        System.out.println("进度时间："+nf.format(read));
    }

}
