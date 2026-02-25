package com.tranhatan.Social.Learning.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@Table(name = "orders")
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int userId;

    @ManyToMany(
            mappedBy = "orderList"
    )
    @ToString.Exclude
    private List<Product> productList;
}
