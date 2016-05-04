package ru.spb.iac.cud.uarm.ejb.context.reg;

import java.math.BigInteger;
import java.net.URLEncoder;
import java.util.Date;
import javax.annotation.Resource;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.spb.iac.cud.uarm.ejb.entity.JournAppUserBssT;

/**
 * Session Bean implementation class HomeBean
 */
@Stateless(mappedName = "userRegEJB")
@LocalBean
 public class UserRegEJB {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserRegEJB.class);

	
	@Resource(mappedName="java:jboss/mail/Default")
	private Session mailSession;
	
	@PersistenceContext(unitName = "CUDUserConsolePU")
    private EntityManager entityManager;
	
    public UserRegEJB() {
        // TODO Auto-generated constructor stub
    }

    public void save(JournAppUserBssT user) {

       LOGGER.debug("UserRegEJB:save:01");
       LOGGER.debug("UserRegEJB:save:02:"+user.getNameUser());
       try{
    	  
    	   
    	   user.setStatus(0L);
    	   user.setCreated(new Date());
    	   entityManager.persist(user);
    	   
    	   
       }catch(Exception e){
    	   LOGGER.error("UserRegEJB:save:error:"+e);
       }
     }
    
    public void step1(String email, String context_url) {

        LOGGER.debug("UserRegEJB:step1:01:"+email);
        LOGGER.debug("UserRegEJB:step1:01_2:"+context_url);
        
        try{
        	MimeMessage m = new MimeMessage(mailSession);
        	
        	Address from = new InternetAddress("is2-support@iac.spb.ru");
        	
        	Address[] to = new InternetAddress[] {
        			new InternetAddress(email) 
        			};
        	
        	
        	m.setFrom(from);
        	m.setRecipients(Message.RecipientType.TO, to);
        	m.setSubject("Проверка адреса эл. почты", "utf-8");
        	m.setSentDate(new java.util.Date());
        	
        	String validationKey = (new BigInteger(email.getBytes("utf-8"))).toString(16);
        	
        	 String link = context_url+"/userRegServlet?email=" +
           	 URLEncoder.encode(email, "UTF-8")+"&validationKey=" +
           	 URLEncoder.encode(validationKey, "UTF-8");
        	
        	LOGGER.debug("UserRegEJB:step1:02:"+link);
        	 
        	String content = (new StringBuilder("Добрый день!<br/>"))
             	   .append("Вы интересовались запросом на регистрацию пользователя в ИАЦ ПААА.<br/>") 
            	   .append("Пожалуйста перейдите по ссылке ниже, чтобы подтвердить ") 
            	   .append("Ваш адрес эл. почты: <br/>")
            	   .append("<a href=\"").append(link).append("\">").append(link)
            	   .append("</a> <br/><br/>") 
		      	   .append("---<br/>") 
		      	   .append("С уважением,<br/> ") 
		      	   .append("ИАЦ")       	 
		        	 .toString();
        	
        	m.setContent(content, "text/html; charset=utf-8");
        	
        	Transport.send(m);
        	
        	LOGGER.debug("UserRegEJB:step1:03");
        	
        }catch(Exception e){
     	   LOGGER.error("UserRegEJB:step1:error:"+e);
        }
     }
}
