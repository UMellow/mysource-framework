package mysource.core.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class WebUtil {
	
	private static Log log = LogFactory.getLog(WebUtil.class);

	public static void writeToWeb(HttpServletResponse resp, String content) {
		resp.setContentType("text/html;charset=UTF-8");

		PrintWriter pw = null;
		try {
			pw = resp.getWriter();
			content = content.replaceAll("\n", "").replace("\r", "");
			pw.write(content);
			pw.flush();
		} catch (IOException e) {
			log.error("IOException!", e);
		} finally {
			if (pw != null)
				pw.close();
		}
	}
	
	/**
	 * 获取Http请求报文头信息
	 * 
	 * @param request
	 * @return
	 */
	public static Map<String, String> getHttpHeads(HttpServletRequest request) {
		
		Map<String, String> httpHeads = new HashMap<String, String>();
		
		Enumeration<String> enumeration = request.getHeaderNames();
		while(enumeration.hasMoreElements()) {
			String headName = enumeration.nextElement();
			String headValue = request.getHeader(headName);
			httpHeads.put(headName, headValue);
		}
		
		return httpHeads;
	}
	
}
