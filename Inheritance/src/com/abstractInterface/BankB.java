package com.abstractInterface;

public class BankB extends Bank{
	int balance, depo;
    BankB(int depo){
		balance = 1000;
		this.depo = depo;
	}
    
    public void getBalance() {
    	System.out.println("Bank b \nYour balance : "+ balance);
    	balance = this.balance + depo;
    	System.out.println("After deposite your balance : " + balance);
    }
}
