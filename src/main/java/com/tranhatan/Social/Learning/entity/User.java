package com.tranhatan.Social.Learning.entity;

import jakarta.persistence.*;
import lombok.Data;
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
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(columnDefinition = "varchar(255) comment 'user name'",nullable = false)
    private String username;
    @Column(columnDefinition = "varchar(255) comment 'user email'",nullable = false, unique = true)
    private String email;
    private String password;
    private String avatarUrl;
    private String bio;
    private String role;
    private String status;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // ===== リレーション =====

    @OneToMany(mappedBy = "user")
    private List<Post> posts = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<Comment> comments = new ArrayList<>();

    @OneToMany(mappedBy = "follower")
    private List<Follow> following = new ArrayList<>();

    @OneToMany(mappedBy = "following")
    private List<Follow> followers = new ArrayList<>();
}