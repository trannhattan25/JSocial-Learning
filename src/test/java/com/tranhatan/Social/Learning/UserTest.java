package com.tranhatan.Social.Learning;

import com.tranhatan.Social.Learning.entity.Post;
import com.tranhatan.Social.Learning.entity.User;
import com.tranhatan.Social.Learning.repository.PostRepository;
import com.tranhatan.Social.Learning.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;

@SpringBootTest
public class UserTest {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    @Test
    @Transactional
    @Rollback(value = false)
    void oneToManyTest() {
//        1.New user
        User user = new User();
        Post post = new Post();

        user.setUsername("Nhat tan");
        user.setEmail("nhattan@gmail.com");

        post.setContent("HẾ LÔ");
        user.setPostList(List.of(post));
        post.setUser(user);

        userRepository.save(user);
        postRepository.save(post);
    }

    @Test
    @Transactional
    @Rollback(value = false)
    void oneToManyTestTwo() {
//        1.New user
        User user = new User();
        Post post = new Post();

        user.setUsername("Nhat Go");
        user.setEmail("nhattanGo@gmail.com");

        post.setContent("HẾ LÔ 2");
        user.setPostList(List.of(post));
        post.setUser(user);

        userRepository.save(user);
//        postRepository.save(post);
    }

    @Test
    @Transactional
    void selectOneToManyTest(){
        User user = userRepository.findById(2L).orElseThrow();
        System.out.println(user);
        System.out.println(user.getPostList());
    }
}

