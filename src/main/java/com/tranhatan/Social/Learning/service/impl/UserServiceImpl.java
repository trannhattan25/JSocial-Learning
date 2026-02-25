package com.tranhatan.Social.Learning.service.impl;

import com.tranhatan.Social.Learning.entity.User;
import com.tranhatan.Social.Learning.repository.UserRepository;
import com.tranhatan.Social.Learning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User findByUsernameAndEmail(String username,String email) {
        return userRepository.findByUsernameAndEmail(username, email);
    }


}
