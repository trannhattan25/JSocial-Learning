package com.tranhatan.Social.Learning;

import com.tranhatan.Social.Learning.entity.CCCD;
import com.tranhatan.Social.Learning.entity.User;
import com.tranhatan.Social.Learning.repository.CCCDRepository;
import com.tranhatan.Social.Learning.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

@SpringBootTest
public class UserCCCDTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CCCDRepository cccdRepository;

    @Test
    @Transactional
    @Rollback(value = false)
    void oneToOneTest(){
        User user = new User();
        CCCD cccd = new CCCD();

        user.setUsername("Tran Nhat Tan");
        user.setEmail("nhattantcc@gmail.com");

        cccd.setNumberCCCD("000033333");

        user.setCccd(cccd);

        userRepository.save(user);
    }

}
