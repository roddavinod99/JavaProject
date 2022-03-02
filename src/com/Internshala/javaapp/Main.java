package com.Internshala.javaapp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       // IF-ELSE IF  ladder statement
        char grade;
        int marks = 85;

        if (marks >= 90)
        {
            grade='A';
        }
        else if (marks >= 80)
        {
            grade = 'B';
        }
        else if (marks >= 70)
        {
            grade = 'C';
        }
        else if (marks >= 60)
        {
            grade = 'D';
        }
        else
        {
            grade = 'F';
        }
        System.out.println(" Grade :" + grade);

    }
}