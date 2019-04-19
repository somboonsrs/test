package com.em.springbootsendmail;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;
import java.io.IOException;

@RestController
public class EmailController {


    @Autowired
    private EmailMailService emailMailService;

    @RequestMapping(value = "/sendemail")
    public boolean sendEmail() throws IOException, MessagingException {
        if (emailMailService.sendmail()) {
            System.out.println("Email sent successfully...");
        }else {
            System.out.println("Error , email can not sent...");
        }
        return emailMailService.sendmail();
    }

}
