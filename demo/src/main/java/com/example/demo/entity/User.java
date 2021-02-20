package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "t_user")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)//主键生成策略
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;
}
