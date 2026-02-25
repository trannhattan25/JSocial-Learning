package com.tranhatan.Social.Learning.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "cccd")
public class CCCD {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numberCCCD;

//    Không nên phụ thuộc 1 1
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "user_id")
//    private User user;
}
