package com.Corjavaprograms;
import java.util.*;
public class Car {
	String make;
	String model;
	short year;
	int price;
	Car(String ma, String mod, short ye, int pr){
		make = ma;
        model = mod;
        year = ye;
        price = pr;
	}
	void displayCarInfo() {
		  System.out.println("Make: " + make);
	      System.out.println("Model: " + model);
	      System.out.println("Year: " + year);
	      System.out.println("Price: $" + price);
	}

}
