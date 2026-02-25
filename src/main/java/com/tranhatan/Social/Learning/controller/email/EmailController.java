package com.tranhatan.Social.Learning.controller.email;

import com.tranhatan.Social.Learning.entity.mail.Email;
import com.tranhatan.Social.Learning.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/email")
public class EmailController {

    @Autowired
    EmailService emailService;

    @PostMapping("/send_text")
    public String sendTextEmail(@RequestBody Email email) {
        return emailService.sendTextEmail(email);
    }

    @PostMapping("/send_html")
    public String sendHTMLEmail(@RequestBody Email email) {
        return emailService.sendHTMLEmail(email);
    }


}
