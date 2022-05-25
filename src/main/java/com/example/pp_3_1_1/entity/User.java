package com.example.pp_3_1_1.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "lastname")
    @NotEmpty
    @NotBlank
    private String lastname;

    @Column(name = "name")
    @NotEmpty
    @NotBlank
    private String name;

    @Column(name = "age")
    @Max(value = 150)
    @Min(value = 1)
    private int age;

}
