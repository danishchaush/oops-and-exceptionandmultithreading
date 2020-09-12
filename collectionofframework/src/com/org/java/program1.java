package com.org.java;

import java.util.ArrayList;

public class program1 {

	public static void main(String[] args) {
		/* noramal array list program */
		
		
		ArrayList a1 = new ArrayList();
		a1.add("java");
		a1.add("sql");
		a1.add("a");
		System.out.println(a1);
		for (int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
		}
	}
}
