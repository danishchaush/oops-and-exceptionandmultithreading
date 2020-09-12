package com.org.java;

import java.util.ArrayList;
import java.util.ListIterator;

public class program4 {

	public static void main(String[] args) {
		
		/* array list iteration program */
		ArrayList<String> s1 = new ArrayList<String>();
		
		s1.add("java");
		s1.add("Sql");
		s1.add("Aptitude");
		
		ListIterator<String> s2 = s1.listIterator();
		System.out.println("froward travesing elements");
		while(s2.hasNext())
		{
			System.out.println(s2.next());
		}
		System.out.println("now reversing travesing elements are ");
		while(s2.hasPrevious())
		{
			System.out.println(s2.previous());
		}
	}
}
