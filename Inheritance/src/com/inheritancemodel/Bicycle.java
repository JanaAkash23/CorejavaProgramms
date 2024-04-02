package com.inheritancemodel;

public class Bicycle {
	int gear;
	int speed;
	
	Bicycle(int gear, int speed){
		this.gear = gear;
		this.speed = speed;
	}
	
	void applyBrake() {
		speed -= 10;
		System.out.println("After apply brake the Mountain bike is stop. speed = " + speed);
	}
	
	void speedUp() {
		speed += 10;
		System.out.println("After apply speed up. speed = " + speed);
	}

}
