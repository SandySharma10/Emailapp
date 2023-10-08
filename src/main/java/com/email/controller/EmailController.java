package com.email.controller;

import com.email.service.EmailServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin(origins ="http://localhost:4200")
public class EmailController {

    
    @RequestMapping("/mail")
    public class EmailSendController {
        @Autowired
        private EmailServiceInter emailService;

        public EmailSendController(EmailServiceInter emailService) {
            this.emailService = emailService;
        }
// its for attechments file and cc
//        @PostMapping("/send")
//        public String sendMail(@RequestParam(value = "file", required = false) MultipartFile[] file, String to, String[] cc, String subject, String body) {
//            return emailService.sendMail(file, to, cc, subject, body);
//        }
@PostMapping("/send")
public String sendMail( String to,  String subject, String message) {
    return emailService.sendMail( to,  subject, message);
}

    }

}
