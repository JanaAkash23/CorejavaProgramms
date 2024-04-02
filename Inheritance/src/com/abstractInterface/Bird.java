package com.abstractInterface;

public abstract class Bird {
	int a;
	Bird(){
		a=2;
		System.out.println("Hello"+a);
	}
	public abstract void fly();
	public abstract void makeSound();
}
