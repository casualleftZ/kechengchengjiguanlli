package com.example.demo.entity;

import lombok.Data;

@Data
public class Curriculum {
    private int id;
    private int program_id;
    private int course_id;
    private int category_id;
    private int semester;       //开学学期
    private int isdegree;      //是否是学位课

    public Curriculum(int id, int program_id, int course_id, int category_id, int semester, int isdegree) {
        this.id = id;
        this.program_id = program_id;
        this.course_id = course_id;
        this.category_id = category_id;
        this.semester = semester;
        this.isdegree = isdegree;
    }
    public Curriculum(){

    }
}
