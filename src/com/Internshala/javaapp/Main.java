package com.Internshala.javaapp;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Dog dog1= new Dog();
        dog1.breed = "Labrador";
        dog1.size = 50 ;
        dog1.colour= "Black";

        dog1.bark();
        dog1.run();

        System.out.println(dog1.breed);
        System.out.println(dog1.size);
        System.out.println(dog1.colour);

        Dog dog2= new Dog();
        dog2.breed= "Dollmation";
        dog2.size= 20;
        dog2.colour= "Black white";

        dog2.bark();
        dog2.run();

        System.out.println(dog2.breed);
        System.out.println(dog2.size);
        System.out.println(dog2.colour);
    }

}





