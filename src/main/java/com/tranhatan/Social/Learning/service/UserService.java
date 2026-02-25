package com.tranhatan.Social.Learning.service;


import com.tranhatan.Social.Learning.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User createUser(User user);
    List<User> getAllUsers();
    User findByUsernameAndEmail(String username,String email);
}
