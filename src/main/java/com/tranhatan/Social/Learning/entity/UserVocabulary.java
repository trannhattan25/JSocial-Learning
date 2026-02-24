package com.tranhatan.Social.Learning.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Data
public class UserVocabulary {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private float easeFactor;
    private int interval;
    private int repetition;
    private LocalDateTime nextReviewDate;
    private int correctCount;
    private int wrongCount;
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "vocabulary_id")
    private Vocabulary vocabulary;
}