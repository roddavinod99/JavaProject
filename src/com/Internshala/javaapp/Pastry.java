package com.Internshala.javaapp;

public class Pastry extends Cake
{
	@Override
	public void Display()
	{
			System.out.println("  " + name + " : " + '\u20B9' + " " + price + " per piece");
	}
}
