package com.anudip.learning;


public class Person {
	String name;
	int age, salary;
	Person(){
		name = "Tamojit Chakrabarty";
		age = 23;
		salary = 650000;
	}
	void display() {
		System.out.println("Person's name is : " + name);
		System.out.println("Person's age is : " + age);
		System.out.println("Person's salary is : " + salary);
		System.out.println("Test Successful");
	}
}
