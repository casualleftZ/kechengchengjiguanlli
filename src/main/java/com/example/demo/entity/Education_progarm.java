package com.example.demo.entity;

import lombok.Data;

@Data

public class Education_progarm {
    private int id;
    private String name;
    private String objective;
    private String specification;    //规格要求
    private int duration;            //标准学制
    private String degree;           //授予学位u（工学学士)
    private int min_credit;         //毕业学分要求
    private int publish_year;       //制定年分
    private int major_id;

    public Education_progarm(int id, String name, String objective, String specification, int duration, String degree, int min_credit, int publish_year, int major_id) {
        this.id = id;
        this.name = name;
        this.objective = objective;
        this.specification = specification;
        this.duration = duration;
        this.degree = degree;
        this.min_credit = min_credit;
        this.publish_year = publish_year;
        this.major_id = major_id;
    }
    public Education_progarm(){

    }
}
