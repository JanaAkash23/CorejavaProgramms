package com.CorejavaProgram;
import java.util.*;
public class Vaxine {
	String name, gend;
	int age;
	Vaxine()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name : ");
		name = sc.nextLine();
		System.out.println("Enter your gender (M/F) : ");
		gend = sc.nextLine();
		System.out.println("Enter your age : ");
		age = sc.nextInt();
	}
	void takeVaxine() {
		if(age >= 18)
		{
			if(gend.equals("M"))
			{
				System.out.println(name +", you can take CovidShild Vaxine");
			}
			else
			{
				System.out.println(name +", you can take Covaxine");
			}
		}
		else
		{
			System.out.println(name +", you can take Sputnik");
		}
	}
}
