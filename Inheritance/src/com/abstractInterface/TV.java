package com.abstractInterface;

public class TV implements TVremote, SmartTVremote{
	
	public void normalTVremote() {
		System.out.println("This is normal TV remote.");
	}
	
	public void smartTVremote() {
		System.out.println("This is a smart TV remote");
	}

}
