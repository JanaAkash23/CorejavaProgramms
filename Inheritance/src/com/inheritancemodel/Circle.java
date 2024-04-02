package com.inheritancemodel;

public class Circle extends Shape{
	double radius;
	Circle(double radius){
		this.radius = radius;
		System.out.println("Circle Radius is : " + radius);
	}
	/*public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
	
	 public double getArea() {
         return Math.PI * radius * radius;
     }*/
	
	void draw() {
		System.out.println("Draw a circle.");
	}
	double calculateArea() {
		return Math.PI * radius * radius;
	}

}
