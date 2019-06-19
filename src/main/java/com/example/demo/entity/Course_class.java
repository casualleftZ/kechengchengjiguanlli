package com.example.demo.entity;

import lombok.Data;

@Data
public class Course_class {
    private int id;
    private int semester_id;
    private int course_id;
    private int max_class_size;
    private int teacher_id;

    public Course_class(int id, int semester_id, int course_id, int max_class_size, int teacher_id) {
        this.id = id;
        this.semester_id = semester_id;
        this.course_id = course_id;
        this.max_class_size = max_class_size;
        this.teacher_id = teacher_id;
    }
    public Course_class(){

    }
}
