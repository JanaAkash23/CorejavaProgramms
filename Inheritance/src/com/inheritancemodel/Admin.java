package com.inheritancemodel;

public class Admin extends College{
	int id;
	String name;
	void disp() {
		name = "Admin First";
		id = 8965;
		System.out.println("Admin name : " + name + " admin Id : " + id);
		}

}
