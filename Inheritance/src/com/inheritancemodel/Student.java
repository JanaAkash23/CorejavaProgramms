package com.inheritancemodel;

public class Student extends College{
	int id;
	String name;
	void disp() {
		name = "Akash Jana";
		id = 67578680;
		System.out.println("Student name : " + name + " Student Id : " + id);
		}

}
