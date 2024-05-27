package com.email;

import java.util.Properties;

import jakarta.mail.Authenticator;
import jakarta.mail.Session;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
   String  message="Hello , Dear this message for security check . ";
   String subject="CoderArea : Confirmation";
 String to="vvar674@gmail.com";
 
 String from="antimajswal33@gmail.com";

//	Email host 
	String host="smtp.gmail.com";
//	
	// get system property

Properties pro= new Properties();
//Properties pro=new Properties();
//host set 

//pro.setProperty("mail.transport.protocol", "SMTPS");
//pro.setProperty("mail.smtp.host", "msg.petrochina.com.cn");
pro.put("mail.smtp.auth","true");
pro.put("mail.smtp.starttls.enable","true");
pro.put("mail.smtp.port","587");
pro.put("mail.smtp.host",host);
//pro.put("mail.smtp.ssl.enable","true");

//Step 1 to get session object 


Session session=Session.getInstance(pro,new Authenticator() {

	@Override
	protected PasswordAuthentication getPasswordAuthentication() {
		
		return new PasswordAuthentication("antimjaiswal33","bewuuvxyzgqyujnj");
	}
	
});

//session.setDebug(true);
// Step 2 :compose the message [text,multi media ]
MimeMessage m=new MimeMessage(session);

try {
	
//from email
	m.setFrom(new InternetAddress(from));
	
	// adding recipient to 
	m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
	
	// adding subject to message 
	m.setSubject(subject);
	
	// adding message 
	m.setText(message,"utf-8");
	m.saveChanges();
//	step 3 send message using Transport class
	Transport.send(m);
System.out.println("ok");
}catch (Exception e) {

e.printStackTrace();
}

    }
 
public static void sendEmail(String message,String subject,String to,String from)
 {
	 
//	Email host 
	String host="smtp.gmail.com";
//	
	// get system property
 
Properties pro= new Properties();
//Properties pro=new Properties();
// host set 

//pro.setProperty("mail.transport.protocol", "SMTPS");
//pro.setProperty("mail.smtp.host", "msg.petrochina.com.cn");
pro.put("mail.smtp.auth","true");
pro.put("mail.smtp.ssl.enable","true");
pro.put("mail.smtp.starttls.enable","true");
pro.put("mail.smtp.port","587");
pro.put("mail.smtp.host",host);

//pro.put("mail.smtp.port","465");
//  Step 1 to get session object 


Session session=Session.getInstance(pro,new Authenticator() {

	@Override
	protected PasswordAuthentication getPasswordAuthentication() {
		
		return new PasswordAuthentication("antimjaiswal@33gmail.com","9589990130");
	}
	
});

//session.setDebug(true);
 // Step 2 :compose the message [text,multi media ]
MimeMessage m=new MimeMessage(session);

try {
	
// from email
	m.setFrom(new InternetAddress(from));
	
	// adding recipient to 
	m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
	
	// adding subject to message 
	m.setSubject(subject);
	
	// adding message 
	m.setText(message,"utf-8");
	m.saveChanges();
//	step 3 send message using Transport class
	Transport.send(m);
System.out.println("ok");
}catch (Exception e) {
	
	
}
 }
}
