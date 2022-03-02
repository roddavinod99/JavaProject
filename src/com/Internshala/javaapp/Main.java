package com.Internshala.javaapp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       // incrememnt operator
        String color,green,red,yellow;
        Scanner scanner=new Scanner(System.in);

        System.out.print(" Enter the color of the traffic light:- ");
        color=scanner.nextLine();

        if(color.equals("green"))
        {
            System.out.print ("You are allowed to move.") ;
        }
        else
        {
            System.out.print (" You are not allowed to move. ");
        }
        scanner.close();
    }
}