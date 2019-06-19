package com.example.demo.entity;

public class Plan_study_course {
    private int id;
    private int course_id;
    private int semester_id;
    private int student_id;

    public Plan_study_course(int id, int course_id, int semester_id, int student_id) {
        this.id = id;
        this.course_id = course_id;
        this.semester_id = semester_id;
        this.student_id = student_id;
    }
    public Plan_study_course(){}
}
