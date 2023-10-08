package com.email.service;
import org.springframework.web.multipart.MultipartFile;
public interface EmailServiceInter {
    //String sendMail(MultipartFile[] file, String to,String[] cc, String subject, String body);
    String sendMail(String to, String subject, String message);
}
