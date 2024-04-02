package com.Corjavaprograms;

public class Rectangle {
	int length;
	int width;
     Rectangle(int l, int w) {
		if(l<=0 || w<=0) {
			System.out.println("Length and width must be positive.");
			}
		this.length = l;
		this.width = w;
	}
     public int calculateArea() {
         return length * width;
     }
}
