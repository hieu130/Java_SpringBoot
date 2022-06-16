package com.example.t2009m1_spring.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@ToString
public class Product {
    private int id;
    private String name;
    private String description;
    private String thumnail;
    private String status;
}