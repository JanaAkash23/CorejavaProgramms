package Com.corjavaeigth;
import java.util.*;

public class SumOfArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements in array: ");
		int n = sc.nextInt();
		
		int[] array = new int[n];
		System.out.println("Enter the array Elements : ");
		
		 for (int i = 0; i < n; i++) {
	            System.out.print("Enter element " + (i + 1) + ": ");
	            array[i] = sc.nextInt();
	        }
		 
		 int sum = 0;
	        for (int num : array) {
	            sum += num;
	        }
	        
	        System.out.println("The sum of elements in the array is: " + sum);

	}

}
