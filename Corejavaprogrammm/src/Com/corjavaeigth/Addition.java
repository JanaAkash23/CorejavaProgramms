package Com.corjavaeigth;
import java.util.*;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number : ");
		double a = sc.nextDouble();
		
		System.out.println("Enter Second Number : ");
		double b = sc.nextDouble();
		
		double sum = a+b;
		
		System.out.println("Addition of " + a + " and "+ b+" = "+sum);

	}

}
