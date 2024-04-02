package com.CorejavaProgram;
import java.util.*;

public class Number {
	int nu;
	Number(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		nu = sc.nextInt();
	}
	void check() {
		if(nu%2 == 0) {
			if(nu%6 == 0)
			{
				System.out.println(nu + " is even and divisible by 6.");
			}
			else
			{
				System.out.println(nu + " is even and not divisible by 6.");
			}
		}
		else
		{
			if(nu%3 == 0)
			{
				System.out.println(nu + " is odd and divisible by 3.");
			}
			else
			{
				System.out.println(nu + " is odd and not divisible by 3.");
			}
		}
	}

}
