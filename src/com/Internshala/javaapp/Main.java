package com.Internshala.javaapp;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        calculateSimpleInterset(1000,3.7f, 4);

        calculateSimpleInterset(130000,10.7f,8);

        calculateSimpleInterset(4000,12.7f,7);

    }
    public static void calculateSimpleInterset(int principle, float rateOfInterest, int timePeriod) {
        double si= principle*rateOfInterest*timePeriod/100;
        System.out.println(si);;
    }

}





