package com.Internshala.javaapp;

import java.util.ArrayList;
import java.util.List;

public class Main
{
	public static void main(String[] args)
	{
		Cake Brownie= new Cake();           //Object Brownie
		Brownie.setName("Chocolate Brownie");
		Brownie.setPrice(250.0f);

		Cake Maple= new Cake();             //Object Maple
		Maple.setName("Chocolate Maple");
		Maple.setPrice(300.0f);

		List <Cake> Cakelist= new ArrayList<>();
		Cakelist.add(Brownie);          // you need to first add object Brownie to add it to Arraylist
		Cakelist.add(Maple);            // you need to first add object Maple to add it to Arraylist

		Pastry Black= new Pastry();         //Object Black
		Black.setName("Black Forest");
		Black.setPrice(35.0f);

		Pastry Choco=new Pastry();          //Object Choco
		Choco.setName("Choco Truffle");
		Choco.setPrice(40.0f);

		List <Pastry> Pastrylist= new ArrayList<>();
		Pastrylist.add(Black);           // you need to first add object Black to add it to Arraylist
		Pastrylist.add(Choco);            // you need to first add object Choco to add it to Arraylist

		System.out.println("        Today's Special Menu        ");
		System.out.println("------------------------------------");

		System.out.println("   ");
		System.out.println("Special Cake");
		System.out.println("------------------------");

		for (Cake cake:Cakelist)        // for each loop
		      {
			cake.Display();      //display method from the class Cake
		}

		System.out.println("   ");     // for each loop
		System.out.println("Special Pastry");
		System.out.println("------------------------");

		for (Pastry pastry:Pastrylist)
		{
			pastry.Display();	// display method from the class Pastry
		}
	}
}

