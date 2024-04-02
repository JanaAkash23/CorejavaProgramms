package Com.corjavaeigth;

import java.util.Scanner;



public class Palindrome {
	private static boolean isPalindrome(String str) {
	    int left = 0;
	    int right = str.length() - 1;

	    while (left < right) {
	        if (str.charAt(left) != str.charAt(right)) {
	            return false;
	        }
	        left++;
	        right--;
	    }
	    return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        if (isPalindrome(inputString)) {
            System.out.println("The string \"" + inputString + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + inputString + "\" is not a palindrome.");
        }


	}

}
