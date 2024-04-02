package com.CorejavaProgram;
import java.util.*;

public class Numcount {
	int a[]=new int[20];
	int posi=0, neg=0, odd=0, even=0, zero =0;
	void countt()
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<=19; i++)
		{
			System.out.println("Enter " +(i+1)+ " number");
			a[i] = sc.nextInt();
			if(a[i]>0)
				posi ++;
			else if(a[i]<0)
				neg ++;
			else
				zero ++;
			
			if(a[i] % 2 != 0)
				odd ++;
			else
				even ++;
			
		}
		System.out.println("Positive = " + posi);
		System.out.println("Negative = " + neg);
		System.out.println("odd = " + odd);
		System.out.println("Even = " + even);
		System.out.println("Zero = " + zero);
	}

}
