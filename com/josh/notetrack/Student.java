package com.josh.notetrack;

import java.util.Scanner;

public class Student {
    static Scanner s_note = new Scanner(System.in);
    static String lastName, firstName;
    static double[] rating;
    static double average;
    public Student(){
        System.out.println("Enter the student's last name");
        lastName = s_note.next();

        System.out.println("Enter the student's first name");
        firstName = s_note.next();

        System.out.println("How many grades does the student"+" "+ firstName + " "+ lastName+" " +"have?");
        int num = s_note.nextInt();

        rating = new double[num];

        for(int i = 0; i< rating.length; i++){
           System.out.println("Enter the rating number:"+ " "+(i+1));
           rating[i] = s_note.nextDouble();
        }

        average = calculateAverage();

    }

    private double calculateAverage(){
        double sum = 0.0;
        for(double valRating : rating){
            sum = sum + valRating;
        }
        return sum / rating.length;
    }

    public void  displayStudent(){
        for(double valRating : rating){
            System.out.println("That's the rating"+ " "+ valRating);
        }
        System.out.println("The average is "+ average);
    }

    public double getAverage(){
        return  average;
    }
}
