package com.tranhatan.Social.Learning.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
//
//@Entity
//@Table(name = "posts")
//@Data
//public class Post {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.UUID)
//    private String id;
//
//    private String content;
//    private String visibility;
//
//    private LocalDateTime createdAt;
//    private LocalDateTime updatedAt;
//    private LocalDateTime deletedAt;
//
//    // 所有側
//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private User user;
//
//    @OneToMany(mappedBy = "post")
//    private List<Comment> comments = new ArrayList<>();
//
//    @OneToMany(mappedBy = "post")
//    private List<Like> likes = new ArrayList<>();
//}