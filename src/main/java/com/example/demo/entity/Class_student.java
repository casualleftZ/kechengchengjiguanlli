package com.example.demo.entity;

import lombok.Data;

@Data
public class Class_student {
    private int id;
    private int course_class_id;
    private int student_id;
    private float gpa_score;      //平时表现成绩
    private float paper_score;    //理论成绩
    private float practice_score; //实践成绩
    private float  score;    //总成绩

    public Class_student(int id, int course_class_id, int student_id, float gpa_score, float paper_score, float practice_score, float score) {
        this.id = id;
        this.course_class_id = course_class_id;
        this.student_id = student_id;
        this.gpa_score = gpa_score;
        this.paper_score = paper_score;
        this.practice_score = practice_score;
        this.score = score;
    }
    public Class_student(){}
}
