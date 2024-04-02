package com.inheritancemodel;

public class Triangle extends Shape{
	double base;
    double height;
	Triangle(double base, double height){
		this.base = base;
		this.height= height;
		System.out.println("Triangle base : "+ base + " height : " + height);
	}
	void draw() {
		System.out.println("Draw a Triangle.");
	}
	double calculateArea() {
		return 0.5 * base* height;
	}

}
