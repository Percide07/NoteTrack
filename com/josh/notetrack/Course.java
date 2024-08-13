package com.josh.notetrack;

import java.util.Scanner;

public class Course {

    private Student[] list;

    /**
     * Permet de créer une classe d'étudiant
     */

    public void level() {
        Scanner s_course = new Scanner(System.in);
        System.out.println("Enter the total number of students");
        int totalStudent = s_course.nextInt();

        list = new Student[totalStudent];

        for(int i =0; i< list.length; i++ ){
            list[i] = new Student();
        }
    }

    public void displayAllStudents(){
        for(Student e : list){
            e.displayStudent();
        }
    }

    /**
     * Trier les notes
     */

    public void sortAverage(){
        Student stock;
        int i = 0;
        int m = 0;

        while(i!= list.length){
            m= i + 1;
            while (m!= list.length){
                if ((list[i] != null) && list[m].getAverage()<list[i].getAverage()){
                    stock = list[i];
                    list[i] = list[m];
                    list[m] = stock;
                }
                m = m + 1;
            }

            i++;
        }
    }
}
