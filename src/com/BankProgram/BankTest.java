package com.BankProgram;
import java.util.Scanner;
public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Account Holder Name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter Account Number : ");
		int numb = sc.nextInt();
		
		System.out.println("Enter Initial Balance : ");
		int bls = sc.nextInt();
		
		BankAccount account = new BankAccount(name, numb, bls);
		
		System.out.println("\nAccount Details:");
		System.out.println("Account Holder : " + account.getAccountHolderName());
		System.out.println("Account Number : " + account.getAccountNumber());
		System.out.println("Balance : " + account.getBalance());
		
		boolean continueTransactions = true;
		while(continueTransactions) {
			System.out.println("\nSelect an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Check Minimum Balance Status");
            System.out.println("5. Exit");
            
            int choice = sc.nextInt();
            
            switch(choice) {
            case 1:
            	System.out.println("Enter deposit amount : ");
            	int damount = sc.nextInt();
            	account.diposit(damount);
            	break;
            case 2:
            	System.out.println("Enter withdrawal amount: ");
            	int wamount = sc.nextInt();
            	account.withdraw(wamount);
            	break;
            case 3:
            	System.out.println("Current balance: " + account.getBalance());
                break;
            case 4:
            	String status = account.checkMinimumBalanceStatus();
                System.out.println(status);
                break;
            case 5:
            	System.out.println("Exiting...");
                continueTransactions = false;
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
            }

		}
		
		sc.close();
		

	}

}
