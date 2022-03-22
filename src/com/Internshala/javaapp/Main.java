package com.Internshala.javaapp;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println(" TAX CALCULATION APP ");
        System.out.println(" ------welcome------ ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of people: ");
        int n = scanner.nextInt();            // scans  the value and assigns to create the size of the arrays

        String[] name= new String[n]; // takes name
        long[] income = new long[n];  // takes income


        for (int i=0;i< name.length; i++ )    //rely on assignment solution to know what was wrong
        {
            System.out.println("Enter the names " + (i+1)+ " :");
            name[i]= scanner.next();
            System.out.println(" Enter the " + name[i] + "'s Income: ");
            income[i]= scanner.nextLong();

        }
        scanner.close();

        System.out.println("Tax to be payed:");
        System.out.println("----------------");



        for (int i=0; i< n ; i++)
        {
            calculateTax(name[i], income[i]); // method declared below
        }

    }
    public static void calculateTax(String name, long income)
    {
        long tax;  // since income is in long

        if (income>=300000)  // if income is more than 1lakhs
        {
            tax = income*20 / 100;
        } else if (income>= 100000 && income<= 300000)  //if income is more than 1 lakhs and less than 3 lakhs
        {
            tax= income * 10/100;
        } else  // if income is less than 1 lakhs
        {
            tax = 0;
        }

        System.out.println(" " + name + "'s tax is : " + '\u20B9' + " " + tax); // print the income to be payed by the individual


    }

}





