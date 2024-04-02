package com.inheritancemodel;

public class Teacher extends College{
	int id;
	String name;
	void disp() {
		name = "Mridul Ghose";
		id = 24679;
		System.out.println("Teacher name : " + name + " teacher Id : " + id);
		}

}
