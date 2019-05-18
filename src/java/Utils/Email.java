/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
/**
 *
 * @author vinhd
 */
public class Email {
    private static Email instance = null;
    private static final String SMTP_HOST = "smtp.gmail.com";
    private static final String SMTP_PORT = "587";
    private static final String SMTP_USER = "vinhduy11";
    private static final String SMTP_PASS = "VDuy0110";
    private static Session session;
    
    public static Email getInstance() {
        if (instance == null) {
            instance = new Email();
        }
        return instance;
    }
    
    public static void sendEmail(String to_address, String subject, String content) {
        try {
            Properties prop = new Properties();
            prop.put("mail.smtp.host", SMTP_HOST);
            prop.put("mail.smtp.port", SMTP_PORT);
            prop.put("mail.smtp.auth", "true");
            prop.put("mail.smtp.starttls.enable", "true"); //TLS
            session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(SMTP_USER, SMTP_PASS);
                    }
                });

            Message message = new MimeMessage(session);
            message.setHeader("Content-Type", "text/plain; charset=UTF-8");
            message.setFrom(new InternetAddress("vinhduy11@gmail.com"));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(to_address)
            );
            message.setSubject(subject);
            message.setContent(content, "text/html; charset=UTF-8");

            Transport.send(message);

            System.out.println("Done");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
    
}
