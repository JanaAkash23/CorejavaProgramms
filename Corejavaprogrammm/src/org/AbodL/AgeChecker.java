package org.AbodL;

public class AgeChecker {
	public static String checkAge(int age1, int age2) {
		if(age1 < 0 || age2 < 0) {
			return "Invalid age entered.";
		}
		
		if(age1 >= 18 && age2 >= 18) {
			return "Both students are Above 18.";
		}
		else if(age1 < 18 && age2 < 18) {
			return "Both are Bellow 18.";
		}
		else
			return "One is above 18 and one is bellow 18.";
	}
}
