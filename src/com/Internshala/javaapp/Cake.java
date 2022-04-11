package com.Internshala.javaapp;

public class Cake {
	String name;         // name of the Cake
	float price;         // price of the Cake

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void Display(){
		System.out.println("  " + name + " : " + '\u20B9' + " " + price + " per pound" );
	}
}
