package com.abstractInterface;

public class B extends Marks{
	double firstSub, secSub, thirdSub, fourSub;
	B(double firstSub, double secSub, double thirdSub, double fourSub){
		this.firstSub = firstSub;
		this.secSub =secSub;
		this.thirdSub =thirdSub;
		this.fourSub =fourSub;
	}
	public double getPercentage() {
		System.out.println("student B  marks : \nFirst subject : " + firstSub 
				+ "\nSecond subject : " + secSub + "\nThird subject : " + thirdSub+ "\nFourth subject : " +fourSub);
		return (firstSub+secSub+thirdSub+fourSub)/4;
	}

}
