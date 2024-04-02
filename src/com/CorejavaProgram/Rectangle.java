package com.CorejavaProgram;
import java.util.*;

public class Rectangle {
	double len, bread, ar;
	Rectangle(){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the rectangle length : ");
		len = sc.nextDouble();
		System.out.println("Enter the rectangle breadth : ");
		bread = sc.nextDouble();
		
		}
	void area() {
		ar = len * bread;
		System.out.println("Area of the rectangle is : " + ar);
		System.out.println("Area of the rectangle is : (type custed into int) : " + (int)ar);
	}

}
