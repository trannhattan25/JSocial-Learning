package com.tranhatan.Social.Learning.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "users")
@Data
@DynamicInsert
@DynamicUpdate
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

     private String username;
    @Column(unique = true)
    private String email;
    private String password;
    private String avatarUrl;
    private String bio;
    private String role;
    private String status;
    private boolean is_read;


    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // ===== リレーション =====

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.LAZY)
    @ToString.Exclude
    private List<Post> postList = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cccd_id")
    private CCCD cccd;

//    @OneToMany(mappedBy = "user")
//    private List<Comment> comments = new ArrayList<>();
//
//    @OneToMany(mappedBy = "follower")
//    private List<Follow> following = new ArrayList<>();
//
//    @OneToMany(mappedBy = "following")
//    private List<Follow> followers = new ArrayList<>();
}