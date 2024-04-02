package com.CorejavaProgram;
import java.util.*;

public class Additionfiveno {
	int a[]=new int[5];
	int add = 0;
	void disp()
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<=4; i++)
		{
			System.out.println("Enter " + (i+1) + " number = ");
			a[i] = sc.nextInt();
			add+= a[i];
			}
		System.out.println("Addition = " + add);
	}
}
