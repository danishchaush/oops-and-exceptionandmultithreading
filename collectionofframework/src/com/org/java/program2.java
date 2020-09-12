package com.org.java;

import java.util.ArrayList;
import java.util.Collections;

public class program2 {

	public static void main(String[] args) {
		/* array list program */
		ArrayList<String> a1  = new  ArrayList<String>();
		
		
		a1.add("jhon");
		a1.add("Rohan");
		a1.add("paul");
		a1.add("g");
		System.out.println(a1.size());
		System.out.println(a1);
		a1.remove("Rohan");
		System.out.println(a1);
		System.out.println(a1.get(2));
		a1.set(2,"danish");
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println(a1);
		Collections.reverse(a1);
		System.out.println(a1);
		
	}
}
