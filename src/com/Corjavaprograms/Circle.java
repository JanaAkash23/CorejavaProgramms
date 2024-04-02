package com.Corjavaprograms;

public class Circle {
	private double radius;
    private final double PI = 3.14159;

    // No-arg constructor sets default radius to 1
    public Circle() {
        radius = 1;
    }

    // Constructor to set radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Method to calculate and return the area
    public double getArea() {
        return PI * radius * radius;
    }


}
