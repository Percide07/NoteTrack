package com.josh.notetrack;

public class CourseManagement {

    public static void main(String[] args){
        Course c = new Course();
        c.level();
        System.out.println("==============Resume==========");
        c.displayAllStudents();
        c.sortAverage();
        System.out.println("============Ranking==========");
        c.displayAllStudents();
    }
}
