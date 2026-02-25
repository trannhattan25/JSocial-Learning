package com.tranhatan.Social.Learning.service;

import com.tranhatan.Social.Learning.entity.mail.Email;

public interface EmailService {
    String sendTextEmail(Email email);
    String sendHTMLEmail(Email email);
    String sendMailAttachmentEmail(Email email);
}
