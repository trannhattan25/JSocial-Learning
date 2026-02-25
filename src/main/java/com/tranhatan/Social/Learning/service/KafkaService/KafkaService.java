package com.tranhatan.Social.Learning.service.KafkaService;

import com.tranhatan.Social.Learning.entity.mail.Email;
import com.tranhatan.Social.Learning.service.EmailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ObjectMapper;

@Slf4j
@Service
public class KafkaService {

    @Autowired
    private EmailService emailService;

    private final ObjectMapper objectMapper = new ObjectMapper();

    @KafkaListener(topics = "otp-auth-topic", groupId = "opt-group-id")
    public void listenOTP(String message) {
        try {
            JsonNode jsonNode = objectMapper.readTree(message);
            /*
             * jsonNode
             * email
             * opt
             * */
            String email = jsonNode.get("email").asText();
            String otp = jsonNode.get("otp").asText();

            log.info("otp is {},email is {}", otp, email);
            Email emailEntity = new Email();
            emailEntity.setToEmail(email);
            emailEntity.setSubject("Send OTP KAFKA GO");
            emailEntity.setMessageBody("OTP is " + otp);

            String result = emailService.sendTextEmail(emailEntity);

            log.info("result is {}", result);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
