package com.inheritancemodel;
import java.util.*;
public class Manager extends Employees{
	
	String jobTitle;
	
	public Manager(String name, String address, double salary, String jobTitle){
		super(name, address, salary);
		this.name= name;
		this.address = address;
		this.salary = salary;
		this.jobTitle = jobTitle;
	}
	void calculateBonus() {
		double bonus =  salary *8.33/100;
		System.out.println(name+ " your Bonus is : " + bonus);
	}
	
	void performanceReport(String report) {
		System.out.println(name + " Performance report is : " + report);
	}
	
	void managingProject(String project) {
		System.out.println(name + " Your project is : " + project);
	}
}
