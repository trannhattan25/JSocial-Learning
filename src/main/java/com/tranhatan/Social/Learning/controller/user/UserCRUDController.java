package com.tranhatan.Social.Learning.controller.user;

import com.tranhatan.Social.Learning.entity.User;
import com.tranhatan.Social.Learning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserCRUDController {
    @Autowired
    UserService userService;

    @PostMapping("/add")
    public User addUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
    @PostMapping("/search")
    public User searchUser(@RequestParam String username, @RequestParam String email) {
        return userService.findByUsernameAndEmail(username, email);
    }
}
