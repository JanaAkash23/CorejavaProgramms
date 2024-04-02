package com.abstractInterface;

public class BankC extends Bank{
	int balance, depo;
    BankC(int depo){
		balance = 500;
		this.depo = depo;
	}
    
    public void getBalance() {
    	System.out.println("Bank C \nYour balance : "+ balance);
    	balance = this.balance + depo;
    	System.out.println("After deposite your balance : " + balance);
    }
}
