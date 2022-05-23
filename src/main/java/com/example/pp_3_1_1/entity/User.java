package com.example.pp_3_1_1.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;

}
