package com.common.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Setter
@Getter
@Entity
@Table(name = "tasks")
public class TasksEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String userId;
    private String title;
    private long status;
    private long emphasisFlg;
//    private long genre;
    private Timestamp createTime;
    private Timestamp updateTime;
}
