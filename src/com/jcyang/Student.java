package com.jcyang;

import java.util.ArrayList;

public class Student extends Person {

    private ArrayList<Course>courseList;



    public Student(){
        courseList=new ArrayList<Course>();
    }

    public ArrayList<Course>getCourseList(){
        return courseList;

    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }

    public void addCourse(Course aCourse)
    {
        courseList.add(aCourse);
    }
}

