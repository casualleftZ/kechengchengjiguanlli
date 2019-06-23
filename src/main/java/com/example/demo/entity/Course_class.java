package com.example.demo.entity;

import lombok.Data;

@Data
public class Course_class {
    private int id;
    private int semester_id;
    private int course_id;
    private int max_class_size;
    private int teacher_id;
    private String class_place;
    private String class_time;

    public Course_class(int id, int semester_id, int course_id, int max_class_size, int teacher_id,String class_place,
                        String class_time) {
        this.id = id;
        this.semester_id = semester_id;
        this.course_id = course_id;
        this.max_class_size = max_class_size;
        this.teacher_id = teacher_id;
        this.class_place=class_place;
        this.class_time=class_time;
    }
    public Course_class(){

    }
}
