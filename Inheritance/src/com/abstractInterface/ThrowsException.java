package com.abstractInterface;
import java.util.*;
public class ThrowsException {
	int number;
	
	/*public void oddCheck(int num)
	{
		if(num % 2 != 0) {
			throw new ArithmeticException(num + " is odd.");
		}
		else
		{
			System.out.println(num + " is even");
		}
	}*/
	//to create a method that takes a string as input and throws an exception if the string does not contain vowels.
	
	 /*public void checkForVowels(String str) {
		 System.out.println("The string is : " +str);
	        boolean containsVowels = false;
	        for (char c : str.toCharArray()) {
	            if ("aeiouAEIOU".indexOf(c) != -1) {
	                containsVowels = true;
	                System.out.println("The string cotains vowels.");
	                break;
	            }
	        }
	        if (!containsVowels) {
	            throw new ArithmeticException("No vowels found in the string.");
	        }
	    }*/
	void takeNumbers() {
	Scanner sc = new Scanner(System.in);
    ArrayList<Integer> numbers = new ArrayList<>();

    System.out.println("Enter integers (enter 0 to stop):");
    do {
        number = sc.nextInt();
        if (number != 0) {
        	if (numbers.contains(number)) {
                throw new ArithmeticException("Duplicate number found: " + number);
            }
            numbers.add(number);
        }
    } while (number != 0);
    
    System.out.println("Entered numbers:");
    for (int num : numbers) {
        System.out.println(num);
        
    }
	}

}
