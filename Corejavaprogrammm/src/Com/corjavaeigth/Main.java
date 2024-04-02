package Com.corjavaeigth;

import java.util.*;

interface ManipulateStr{
	String Change(String str);
}

public class Main {
 public static void main(String[] args) {
	 ManipulateStr uppercase = (String s) -> s.toUpperCase();
	 ManipulateStr lowercase = (String s) -> s.toLowerCase();
	 ManipulateStr reverse = (String s) -> new StringBuilder(s).reverse().toString();
	 
	 String string = "Hello world!";
	 System.out.println("Uppercase of String : "+uppercase.Change(string));
	 System.out.println("Lowercase of String : "+lowercase.Change(string));
	 System.out.println("Reverse order of String : "+reverse.Change(string));
 }
}

