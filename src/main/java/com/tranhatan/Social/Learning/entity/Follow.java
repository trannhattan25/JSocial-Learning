package com.tranhatan.Social.Learning.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

//@Entity
//@Table(name = "follows")
//@Data
//public class Follow {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.UUID)
//    private String id;
//
//    private LocalDateTime createdAt;
//
//    @ManyToOne
//    @JoinColumn(name = "follower_id")
//    private User follower;
//
//    @ManyToOne
//    @JoinColumn(name = "following_id")
//    private User following;
//}