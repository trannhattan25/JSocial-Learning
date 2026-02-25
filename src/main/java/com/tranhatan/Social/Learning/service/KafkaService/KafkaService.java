package com.tranhatan.Social.Learning.service.KafkaService;

import com.tranhatan.Social.Learning.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    private EmailService emailService;
}
