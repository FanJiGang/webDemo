package cn.fan.mail;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class MailUtils {
    public static void sendMail(String username ,String message) throws MessagingException {
        Properties prop = new Properties();
        //prop.setProperty("mail.host","smtp.qq.com");
        //prop.setProperty("mail.smtp.auth","true");
        Authenticator auth = new Authenticator(){
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return  new PasswordAuthentication("Admin@store.com","admin");
            }
        };
        Session session = Session.getDefaultInstance(prop, auth);
        Message mess = new MimeMessage(session);
        mess.setFrom(new InternetAddress("Admin@store.com"));
        mess.setRecipient(Message.RecipientType.TO,new InternetAddress(username));
        mess.setSubject("第一封邮件");
        mess.setContent(message,"text/html;charset=utf-8");
        Transport.send(mess);
    }

    public static void main(String[] args) {
        try {
            sendMail("aaa@store.com","注册成功");
        } catch (MessagingException e) {
            e.printStackTrace();
        }

    }
}
