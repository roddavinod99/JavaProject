package com.Internshala.javaapp;

import com.sun.xml.internal.ws.api.streaming.XMLStreamWriterFactory;

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

        switch (grade)
        {
            case 'A':
                 System.out.println("Excellent marks");
            break;
            case 'B':
                System.out.println(" Very good  marks");
            break;
            case 'C':
                System.out.println("Good marks, Could do better");
            break;
            case 'D':
                System.out.println(" Average score, Work hard");
            break;
            case 'F':
                System.out.println("You have failed");
            break;
            default :
                System.out.println("Invalid Grade");
        }

    }
}