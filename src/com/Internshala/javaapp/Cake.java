package com.Internshala.javaapp;

public class Cake {
	String name;         // name of the Cake instance variable
	float price;         // price of the Cake instance variable

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;   //use "this" keyword to  make compiler understand that we refer instance variable "name".
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price; //use "this" keyword to make compiler undersatnd that we refer instance variable "price".
	}

	public void Display(){
		System.out.println("  " + name + " : " + '\u20B9' + " " + price + " per pound" );
	}
}
