package com.abstractInterface;

public class A extends Marks{
	double firstSub, secSub, thirdSub;
	A(double firstSub, double secSub, double thirdSub){
		this.firstSub = firstSub;
		this.secSub =secSub;
		this.thirdSub =thirdSub;
	}
	public double getPercentage() {
		System.out.println("student A  marks : \nFirst subject : " + firstSub 
		+ "\nSecond subject : " + secSub + "\nThird subject : " + thirdSub);
		return (firstSub+secSub+thirdSub)/3;
	}

}
