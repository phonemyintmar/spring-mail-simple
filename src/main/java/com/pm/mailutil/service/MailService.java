package com.pm.mailutil.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail() {
        try {

            // Creating a simple mail message object
            SimpleMailMessage emailMessage = new SimpleMailMessage();

            // Setting up necessary details of mail
            emailMessage.setFrom("phonemyintmarr@gmail.com");
            emailMessage.setTo("forplaystore75@gmail.com");
            emailMessage.setSubject("Test Subject");
            emailMessage.setText("Hello World");

            // Sending the email
            mailSender.send(emailMessage);
            log.info("Email Sent");
        }

        // Catch block to handle the exceptions
        catch (Exception e) {
            log.info("error tat {}", e.getMessage());
        }
    }


}
