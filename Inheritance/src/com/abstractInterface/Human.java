package com.abstractInterface;

public class Human extends Monkey implements BasicAnimal{
	void speak(){

        System.out.println("Hello sir!");

    }

 

    @Override

    public void eat() {

        System.out.println("Eating");

    }

 

    @Override

    public void sleep() {

        System.out.println("Sleeping");

    }

}
