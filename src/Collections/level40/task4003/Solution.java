package Collections.level40.task4003;

//import javax.activation.DataHandler;
//import javax.activation.FileDataSource;
//import javax.mail.*;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeBodyPart;
//import javax.mail.internet.MimeMessage;
//import javax.mail.internet.MimeMultipart;
//import java.util.Properties;
//
/*
Отправка письма с файлом
Исправь реализацию метода setAttachment. Этот метод должен прикреплять файл к письму.
        Подсказки:
        1. Используй библиотеку JavaMail API версии 1.4.7.
        2. Письмо должно содержать только одну часть (MimeBodyPart) с файлом.

        Требования:
        •	Метод setAttachment должен устанавливать новый контент у сообщения message. Тип контента должен быть MimeMultipart.
        •	После вызова метода setAttachment, контент сообщения message должен содержать одну часть MimeBodyPart.
        •	Метод setAttachment должен корректно устанавливать файл в соответствующий MimeBodyPart объект.
        •	Метод setAttachment должен корректно устанавливать имя файла в соответствующий MimeBodyPart объект.
//*/
//
//public class Solution {
//
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        solution.sendMail("name.lastname@gmail.com", "password", "friend@gmail.com");
//    }
//
//    public void sendMail(final String username, final String password, final String recipients) {
//        Properties props = new Properties();
//        props.put("mail.smtp.auth", "true");
//        props.put("mail.smtp.starttls.enable", "true");
//        props.put("mail.smtp.host", "smtp.gmail.com");
//        props.put("mail.smtp.port", "587");
//
//        Session session = Session.getInstance(props,
//                new Authenticator() {
//                    protected PasswordAuthentication getPasswordAuthentication() {
//                        return new PasswordAuthentication(username, password);
//                    }
//                });
//
//        try {
//            Message message = new MimeMessage(session);
//            message.setFrom(new InternetAddress(username));
//            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipients));
//
//            setSubject(message, "Тестовое письмо");
//            setAttachment(message, "c:/text.txt");
//
//            Transport.send(message);
//            System.out.println("Письмо было отправлено.");
//
//        } catch (MessagingException e) {
//            System.out.println("Ошибка при отправке: " + e.toString());
//        }
//    }
//
//    public static void setSubject(Message message, String subject) throws MessagingException {
//        message.setSubject(subject);
//    }
//
//    public static void setAttachment(Message message, String filename) throws MessagingException {
//        message.setText(filename);
//    }
//}
