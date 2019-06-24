package com.example.demo.entity;

import lombok.Data;

@Data
public class Class_student2 {
    private String cname;
    private float gpa_score;      //平时表现成绩
    private float paper_score;    //理论成绩
    private float practice_score; //实践成绩
    private float  score;    //总成绩
}
