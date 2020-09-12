package com.org.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

public class program3 {

	public static void main(String[] args) {
		/* hascode program */
		ArrayList<String> s1 = new ArrayList<String>();
		
		s1.add("Java");
		s1.add("Sql");
		s1.add("Aptitude");
		s1.add("Selilum");
		s1.add("Jdbc");
		System.out.println(s1);
		
		Iterator<String> s2 = s1.iterator();
		while(s2.hasNext())
		{
			System.out.println(s2.next());
		}
		
}
}