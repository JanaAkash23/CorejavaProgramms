package com.CorejavaProgram;
import java.util.*;

public class Student {
	int rollNo, firstSub, secSub, thirdSub, fourSub, fiveSub, total, per;
	String name;
	Student()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Name : ");
		name = sc.nextLine();
		System.out.println("Enter Student Roll No : ");
		rollNo = sc.nextInt();
		System.out.println("Enter First Language Marks : ");
		firstSub = sc.nextInt();
		System.out.println("Enter Second Language Marks : ");
		secSub = sc.nextInt();
		System.out.println("Enter Math Marks : ");
		thirdSub = sc.nextInt();
		System.out.println("Enter Computer Marks : ");
		fourSub = sc.nextInt();
		System.out.println("Enter Hystory Marks : ");
		fiveSub = sc.nextInt();
	}
	void totalNumber()
	{
		total = firstSub + secSub + thirdSub + fourSub + fiveSub;
		System.out.println("Your Total Marks : " + total);
	}
	
	void perNumber()
	{
		per = total/5;
		System.out.println("Your percentage : " + per +"%");
		if(per >= 90)
		{
			System.out.println("Your grade : Distingtion");
		}
		else if(per >=80)
		{
			System.out.println("Your grade : A ");
		}
		else if(per >= 70)
		{
			System.out.println("Your grade : B ");
		}
		else if(per >= 60)
		{
			System.out.println("Your grade : C ");
		}
		else if(per >= 50)
		{
			System.out.println("Your grade : pass ");
		}
		else if(per <= 35)
		{
			System.out.println("Your grade : Fail ");
		}
		else
		{
			System.out.println("Invalid grade.");
		}
	}

}
