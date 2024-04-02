package com.CorejavaProgram;
import java.util.*;

public class Largesmall {
	int a[]=new int[10];
	int large, small;
	void largSmall()
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<=9; i++)
		{
			System.out.println("Enter " +(i+1)+ " number");
			a[i] = sc.nextInt();
		}
		large= a[0];
			small = a[0];
			for(int i=0; i<=9; i++)
			{
			if(a[i]>large)
				large= a[i];
			if(a[i] < small)
				small = a[i];
			}
			
		
		System.out.println("Large = " + large);
		System.out.println("Small = " + small);
		
		
	}

}