package Com.corjavaeigth;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter a number to calculate its factorial: ");
	        int n = sc.nextInt();
	        
	        long factorial = 1;
	        for (int i = 1; i <= n; i++) {
	            factorial *= i;
	        }
	        
	        System.out.println("The factorial of " + n + " is: " + factorial);

	}

}
