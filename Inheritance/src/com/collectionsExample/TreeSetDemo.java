package com.collectionsExample;
import java.util.*;
public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> t1= new TreeSet<Integer>();
		TreeSet<Integer> t2= new TreeSet<Integer>();
		t1.add(2);
		t1.add(4);
		t1.add(23);
		t1.add(45);
		t1.add(66);
		t1.add(32);
		
		Iterator i1 = t1.iterator();
		System.out.println("The Tree Set elements : ");
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		//to add all the elements of a specified tree set to another tree set.
		t2.addAll(t1);
		t2.add(43);
		Iterator i2 = t2.iterator();
		System.out.println("Afetr adding all elements from first Tree Set to second Tree Set elements  are: ");
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
		
		//to create a reverse order view of the elements contained in a given tree set.
		Iterator i3 = t1.descendingIterator();
		System.out.println("The Tree Set elements in Reverse Order: ");
		while(i3.hasNext()) {
			System.out.println(i3.next());
		}
		
		//5.Write a Java program to get the first and last elements in a tree set.
		System.out.println("The first element of the tree set is : " +t1.first());
		System.out.println("The last element of the tree set is : " +t1.last());
		
		//.Write a Java program to clone a tree set list to another tree set.
		TreeSet<Integer> t3 = (TreeSet<Integer>)t1.clone();
		System.out.println("\nTreeSet 3 is: " + t3);
		
		//Write a Java program to compare two tree sets.
		System.out.println("Comparison Between set t1 and t2 : "+ t1.equals(t3));
		
		//Java program to find numbers less than 7 in a tree set.
		System.out.println("Elements less thsn 7 : "+t1.headSet(7));
	}

}
