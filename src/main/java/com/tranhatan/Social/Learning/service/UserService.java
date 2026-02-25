package com.tranhatan.Social.Learning.service;


import com.tranhatan.Social.Learning.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User createUser(User user);

    List<User> getAllUsers();

    User findByUsernameAndEmail(String username, String email);

//    Phân trang: get all by limit offset\

    Page<User> findAllUsers(  Pageable pageable);

    //    get search bt limit offset
    Page<User> findAllUsername(String username, Pageable pageable);

}
