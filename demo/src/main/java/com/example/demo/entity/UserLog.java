package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "t_user_log")
@Entity
public class UserLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//主键生成策略
    @Column(name = "id")
    private int id;
    @Column(name = "logs")
    private String logs;
}
