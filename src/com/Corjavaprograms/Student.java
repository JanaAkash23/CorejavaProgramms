package com.Corjavaprograms;
import java.util.*;

public class Student {
	private String studentName, collegeName;
	private int studentID;
	Student(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Name : ");
		studentName = sc.nextLine();
		System.out.println("Enter College Name : ");
		collegeName = sc.nextLine();
		System.out.println("Enter Student ID : ");
		studentID = sc.nextInt();
		
	}
	void printt() {
		System.out.println("Student Name is : " + studentName);
		System.out.println("College Name is : " + collegeName);
		System.out.println("Student ID is : " + studentID);
		System.out.println("Successfull");
	}

}
