package Com.corjavaeigth;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArithmeticOperation add = (a, b) -> a+b;
		ArithmeticOperation sub = (a, b) -> a-b;
		ArithmeticOperation mult = (a, b) -> a*b;
		ArithmeticOperation div = (a, b) -> a/b;
		double num1 = 10;
        double num2 = 5;
        System.out.println("Addition of "+ num1+" and " + num2+ " is : "+ add.operate(num1, num2));
        System.out.println("Subtraction of "+ num1+" and " + num2+ " is : "+ sub.operate(num1, num2));
        System.out.println("Multiplication of "+ num1+" and " + num2+ " is : "+ mult.operate(num1, num2));
        System.out.println("Division of "+ num1+" and " + num2+ " is : "+ div.operate(num1, num2));
	}

}
