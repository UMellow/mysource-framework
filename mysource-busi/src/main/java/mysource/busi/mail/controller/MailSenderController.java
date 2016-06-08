package mysource.busi.mail.controller;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.exception.VelocityException;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.velocity.VelocityEngineFactoryBean;
import org.springframework.ui.velocity.VelocityEngineUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({"/mail"})
public class MailSenderController {

	@Autowired
	private JavaMailSenderImpl sender;
	
	@RequestMapping({"/webPath"})
	@ResponseBody
	public String getWebPath(HttpServletRequest request) {
		
		ServletContext servletContext = request.getSession().getServletContext();
		String realPath = servletContext.getRealPath("/");
		
		return realPath;
	}
	
	@SuppressWarnings("deprecation")
	@RequestMapping({"/sendMail"})
	@ResponseBody
	public String sendMail(HttpServletRequest request) throws MessagingException, VelocityException, IOException {
		
		/* 简单邮件发送 - start */
		/*SimpleMailMessage msg = new SimpleMailMessage();
		
		msg.setFrom(sender.getUsername());
		msg.setTo("zhaoyi119@qq.com");
		msg.setSubject("test spring mail");
		msg.setText("this is a mail from apache spring mail.");
		
		sender.send(msg);*/
		/* 简单邮件发送 - end */
		
		
		/* 发送富文本(html)内容邮件 - start */
		/*MimeMessage message = sender.createMimeMessage();
		MimeMessageHelper messageHelper = new MimeMessageHelper(message, true);
		
		messageHelper.setFrom(sender.getUsername());
		messageHelper.setTo("zhaoyi119@qq.com");
		messageHelper.setSubject("test spring mail");
		messageHelper.setText("<html><head></head><body><h1>this is a mail from apache spring mail.</h1></body></html>", true);		
		
		messageHelper.addAttachment("demo-附件.jpg", new File("D:/test/dabatui_001.jpg"));
		
		sender.send(message);*/
		/* 发送富文本(html)内容邮件 - end */
		
		
		/* 发送富文本(velocity模板)内容邮件 - start */
		MimeMessage message = sender.createMimeMessage();
		MimeMessageHelper messageHelper = new MimeMessageHelper(message, true);
		
		messageHelper.setFrom(sender.getUsername());
		messageHelper.setTo("zhaoyi119@qq.com");
		messageHelper.setSubject("test spring mail");
		
		Properties properties = System.getProperties();
		properties.put(Velocity.FILE_RESOURCE_LOADER_PATH, request.getSession().getServletContext().getRealPath("/"));
		
		VelocityEngine velocityEngine=new VelocityEngine(properties);  
         
//        VelocityContext context=new VelocityContext();  
//        context.put("user", "ooo");  
//        context.put("content", "nihao");  
//        StringWriter writer=new StringWriter(); 
		
		Map<String, Object> model = new HashMap<String, Object>();  
		model.put("user", "zhaoyi");  
		model.put("content", "hello vm.");
		
		String text = VelocityEngineUtils.mergeTemplateIntoString(velocityEngine, "vm/hello.vm", model);
		
		messageHelper.setText(text, true);		
		
		sender.send(message);
		/* 发送富文本(velocity模板)内容邮件 - end */
		
		return "success";
	}
}
