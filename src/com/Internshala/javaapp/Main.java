package com.Internshala.javaapp;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        float[] mySecondArray = new float[3];
        mySecondArray[0] = 34.4f;
        mySecondArray[1] =4.6f;
        mySecondArray[2] = 78.11f;
        float sumOfNumbers = 0;
        for(float num: mySecondArray)
        {
            sumOfNumbers+= num;
            System.out.println(num);
        }
        System.out.println("Sum of the Second Array: " + sumOfNumbers);
      }
}







