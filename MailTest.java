package com.neolife.test;

import java.util.Properties;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

public class MailTest {
	public static void main(String[] args) {
		simpleMailSend("1120057371@qq.com","主题。。。","msg:neirong!");
	}
	
	public static void simpleMailSend(String email,String subject,String msg) {  
	     //创建邮件发送服务器  
	        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();    
	        mailSender.setHost("smtp.qq.com");  
	    //	      mailSender.setPort(465);  
	        mailSender.setUsername("2410339780@qq.com");  
	        mailSender.setPassword("uedjnjibbgfpebfg");  
	        //加认证机制  
	        Properties javaMailProperties = new Properties();  
	        javaMailProperties.put("mail.smtp.auth", true);   
	        javaMailProperties.put("mail.smtp.starttls.enable", true);   
	        javaMailProperties.put("mail.smtp.timeout", 5000);   
	        mailSender.setJavaMailProperties(javaMailProperties);  
	        //创建邮件内容  
	        SimpleMailMessage message=new SimpleMailMessage();  
	        message.setFrom("2410339780@qq.com");  
	        message.setTo(email);  
	        message.setSubject(subject);  
	        message.setText(msg);  
	        //发送邮件  
	        mailSender.send(message);  
	    }  
}
