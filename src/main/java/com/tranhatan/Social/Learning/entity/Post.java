package com.tranhatan.Social.Learning.entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "posts")
@Data
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Lob
     @Column(nullable = false)
    private String content;
    private String visibility;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;

    // 所有側
    @ManyToOne(cascade = CascadeType.ALL,optional = false)
    @JoinColumn(name = "user_id",nullable = false)  //foreign key
    private User user; // tên map by

//    @OneToMany(mappedBy = "post")
//    private List<Comment> comments = new ArrayList<>();
//
//    @OneToMany(mappedBy = "post")
//    private List<Like> likes = new ArrayList<>();
}