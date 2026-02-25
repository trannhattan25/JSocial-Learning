package com.tranhatan.Social.Learning;

import com.tranhatan.Social.Learning.util.EmailSenderUtil;
  import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.IOException;

@SpringBootTest
public class SendEmailTest {
    @Autowired
    private EmailSenderUtil emailSenderUtil;
    @Test
    void sendTextEmail(){
        String to = "tanwaifu125@gmail.com";
        String subject = "Test OTP Simple";
        String context = "This is a 1234";

        emailSenderUtil.sendTextEmail(to,subject,context);
    }
    @Test
    void sendHTMLEmail() throws IOException {
        String to = "tanwaifu125@gmail.com";
        String subject = "Test OTP HTML";
        String context = "This is a 1234";

        Resource resource = new ClassPathResource("/templates/email/otp-auth.html");
        String htmlContent = new String(resource.getInputStream().readAllBytes());
        emailSenderUtil.sendHtmlEmail(to,subject,context);
    }


}
