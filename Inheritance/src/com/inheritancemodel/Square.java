package com.inheritancemodel;

public class Square extends Shape{
	int length;
	Square(int length){
		this.length = length;
		System.out.println("Square side length : "+ length);
	}
	void draw() {
		System.out.println("Draw a square.");
	}
	double calculateArea() {
		return length*length;
	}
	

}
