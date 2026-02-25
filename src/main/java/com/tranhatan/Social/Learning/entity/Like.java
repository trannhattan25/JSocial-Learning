package com.tranhatan.Social.Learning.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

//@Entity
//@Table(name = "likes")
//@Data
//public class Like {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.UUID)
//    private String id;
//
//    private LocalDateTime createdAt;
//
//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private User user;
//
//    @ManyToOne
//    @JoinColumn(name = "post_id")
//    private Post post;
//}