package com.Corjavaprograms;
import java.util.Random;
import java.util.*;
public class Testassinment {

	public static void main(String[] args) {
/*		Student std=new Student();
		std.printt();*/
		/*Scanner sc = new Scanner(System.in);
		    System.out.println("Enter the make of the car: ");
	        String ma = sc.nextLine();

	        System.out.println("Enter the model of the car: ");
	        String mod = sc.nextLine();

	        System.out.println("Enter the year of the car: ");
	        short ye = sc.nextShort();

	        System.out.println("Enter the price of the car: ");
	        int pr = sc.nextInt();

	        // Create a Car object with the user-provided information
	        Car car = new Car(ma, mod, ye, pr);
	        System.out.println("Car Information :");
	        car.displayCarInfo();*/
		    /*Circle circle1 = new Circle(2.0);
	        Circle circle2 = new Circle(12);
	        Circle circle3 = new Circle(24);

	        // Print the radius and area of each circle
	        System.out.println("Circle 1: Radius = " + circle1.getRadius() + ", Area = " + circle1.getArea());
	        System.out.println("Circle 2: Radius = " + circle2.getRadius() + ", Area = " + circle2.getArea());
	        System.out.println("Circle 3: Radius = " + circle3.getRadius() + ", Area = " + circle3.getArea());*/
		
			Random random = new Random();
		
			// Randomly assign values to Rectangle1
			int l1 = random.nextInt(20) + 1;
			int w1 = random.nextInt(20) + 1;
			Rectangle rect1 = new Rectangle(l1, w1);
			
			// Randomly assign values to Rectangle1
			int l2 = random.nextInt(20) + 1;
			int w2 = random.nextInt(20) + 1;
			Rectangle rect2 = new Rectangle(l2, w2);
			
			//Calculate areas
			int area1 = rect1.calculateArea();
			int area2 = rect2.calculateArea();
			
			//print areas
			System.out.println("Rectangle1 length = " + l1 + " Width = " + w1 + " Area = " + area1);
			System.out.println("Rectangle2 length = " + l2 + " Width = " + w2 + " Area = " + area2);
			
			// Determine equality or relation
			
			if(area1 > area2) {
				System.out.println("Rectangle1 > Rectangle2");
			}
			else if(area1 < area2) {
				System.out.println("Rectangle1 < Rectangle2");
			}
			else
			{
				System.out.println("They are equal.");
			}
		
	}

}
