package com.BankProgram;
import java.util.Scanner;
public class BankAccount {
	
	//member variables
	String accountHolderName;
	int accountNumber;
	int balance;
	private static final int MIN_BALANCE= 5000;
	
	//constructor
	public BankAccount(String accName, int accNo, int bls){
		if(bls < 0) {
			throw new IllegalArgumentException("Initial balance cannot be negative.");
		}
		this.accountHolderName = accName;
		this.accountNumber = accNo;
		this.balance = bls;
	}
	
	// Getters and setters
	public String getAccountHolderName() {
        return accountHolderName;
    }
	
	public void setAccountHolderName(String accName) {
		this.accountHolderName = accName;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public int getBalance() {
		return balance;
	}
	
	 // Deposit method
	public void diposit(int amount) {
		if(amount <= 0) {
			throw new IllegalArgumentException("Deposit amount must be positive.");
		}
		balance += amount;
		System.out.println("Deposit successful! New balance: " + balance);
	}
	
	// Withdraw method
	public void withdraw(int amount) {
		if(amount <= 0) {
			throw new IllegalArgumentException("Withdrawal amount must be positive.");
		}
		if(amount > balance) {
			throw new InsufficientFundsException("Insufficient funds for withdrawal.");
		}
		balance -= amount;
        System.out.println("Withdrawal successful! New balance: " + balance);
	}
	
	// Check minimum balance status
	public String checkMinimumBalanceStatus() {
		String status = (balance >= MIN_BALANCE) ? "Minimum Balance Maintained" : "Minimum Balance not Maintained";
		return status;
	}
	
	// Exception for insufficient funds
			class InsufficientFundsException extends RuntimeException {
			    public InsufficientFundsException(String message) {
			        super(message);
			    }
			}

}
