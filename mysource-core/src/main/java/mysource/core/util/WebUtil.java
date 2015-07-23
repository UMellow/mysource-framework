package mysource.core.util;

import java.io.IOException;
import java.io.PrintWriter;
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
}
