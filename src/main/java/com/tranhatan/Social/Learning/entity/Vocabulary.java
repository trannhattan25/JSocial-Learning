package com.tranhatan.Social.Learning.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

//@Entity
//@Table(name = "vocabularies")
//@Data
//public class Vocabulary {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.UUID)
//    private String id;
//
//    private String word;
//    private String reading;
//    private String jlptLevel;
//
//    private LocalDateTime createdAt;
//
////    @OneToMany(mappedBy = "vocabulary")
////    private List<VocabularyDefinition> definitions = new ArrayList<>();
//}