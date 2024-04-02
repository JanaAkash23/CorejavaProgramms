package com.abstractInterface;

public class BankA extends Bank{
	int balance, depo;
    BankA(int depo){
		balance = 500;
		this.depo = depo;
	}
    
    public void getBalance() {
    	System.out.println("Bank A \nYour balance : "+ balance);
    	balance = this.balance + depo;
    	System.out.println("After deposite your balance : " + balance);
    }
}
