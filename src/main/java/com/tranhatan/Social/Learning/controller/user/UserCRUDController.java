package com.tranhatan.Social.Learning.controller.user;

import com.tranhatan.Social.Learning.entity.User;
import com.tranhatan.Social.Learning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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

//    Phân trang
    @GetMapping("/getAll")
    public Page<User> getAll(
            @RequestParam  int page,
            @RequestParam int size,
            @RequestParam(defaultValue = "id") String sort,
            @RequestParam(defaultValue = "desc") String direction
    ){
        Sort.Direction sortDirection = direction.equalsIgnoreCase("asc") ?
                Sort.Direction.ASC : Sort.Direction.DESC;

        Sort sortBy = Sort.by(sortDirection,sort);
        Pageable pageable = PageRequest.of(page,size,sortBy);

        return userService.findAllUsers(pageable);
    }
    @GetMapping("/searchPage")
    public Page<User> searchPageUsername(
            @RequestParam String username,
            @RequestParam  int page,
            @RequestParam int size,
            @RequestParam(defaultValue = "id") String sort,
            @RequestParam(defaultValue = "desc") String direction
    ){
        Sort.Direction sortDirection = direction.equalsIgnoreCase("asc") ?
                Sort.Direction.ASC : Sort.Direction.DESC;

        Sort sortBy = Sort.by(sortDirection,sort);
        Pageable pageable = PageRequest.of(page,size,sortBy);

        return userService.findAllUsername(username,pageable);
    }

}
