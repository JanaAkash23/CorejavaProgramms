package com.collectionsExample;

//import com.collectionsExample.ATest.Rose;

public class Rose {
	public void get(int k, int l, int m) {

		assert ( k > l && k > m) : " its ok";

		System.out.println(" Its assertion");

		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rose r = new Rose();

		r.get(10, 20, 5);

	}

}
