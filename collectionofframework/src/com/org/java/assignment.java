package com.org.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class assignment {

	public static void main(String[] args) {
		/* create an array list and add any five colors and print it 
		
		ArrayList<String> s = new ArrayList<String>();
		
		s.add("green");
		s.add("orange");
		s.add("blue");
		s.add("white");
		s.add("black");
		System.out.println(s);
		*/
		
		/* create an array list and iterate the elements 1. forward and 2. backword */
		/*
		ArrayList<String> s1 = new ArrayList<String>();
		

		s1.add("green");
		s1.add("orange");
		s1.add("blue");
		s1.add("white");
		s1.add("black");
		
		ListIterator<String> s2 = s1.listIterator();
		while(s2.hasNext())
		{
			System.out.println(s2.next());
		}
		System.out.println("now backword");
		while(s2.hasPrevious())
		{
			System.out.println(s2.previous());
		}
		*/
		/* create a linked list and sort elemts a.acending b.decending */
		/*
		LinkedList<Integer> s3 = new LinkedList<Integer>();
		s3.add(1);
		s3.add(2);
		s3.add(3);
		s3.add(4);
		s3.add(5);
		Collections.sort(s3);
		System.out.println(s3);
		System.out.println("now decending ");
		Collections.reverse(s3);
		System.out.println(s3);
		*/
		
		/*create a list of employe and print alternate elements */
		
		/*
		ArrayList<String> s4 = new ArrayList<String>();
		
		s4.add("danish");
		s4.add("mahesh");
		s4.add("suresh");
		s4.add("nagesh");
		s4.add("hitesh");
		for (int i = 0; i < s4.size(); i++) {
			if(i%2==0)
			{
			System.out.println(s4.get(i));
			}
		}
		*/
		
		/*  create  a vector (list) and add elements like below */
		/*
		Vector<String> s5 = new Vector<String>();
		s5.add("java");
		s5.add("corejava");
		s5.add("java");
		s5.add("java");
		s5.add("sql");
		s5.add("corejava");
		s5.add("null");
		System.out.println(s5);
		*/
		/* create an arraylist and print first and last element */
		/*
		ArrayList<String> s6 = new ArrayList<String>();
		s6.add("orange");
		s6.add("blue");
		s6.add("green");
		s6.add("gray");
		System.out.println(s6);
	
		for (int i = 0; i<=s6.size(); i++) {
			if((i==0) || (i==s6.size()-1))
			System.out.println(s6.get(i));
		}
		*/
		
		/* convert arraylist to array */
		/*
		ArrayList<String> s7 = new ArrayList<String>();
		
		s7.add("orange");
		s7.add("white");
		s7.add("green");
		String a[] = s7.toArray(new String[s7.size()]);
		System.out.println(a.length);
		for (int i = 0; i <=a.length-1; i++) {
			System.out.println(a[i]);
		}
		*/
		
		/* copy one array list to another array list */
		
		ArrayList<String> s8 = new ArrayList<String>();
		s8.add("orange");
		s8.add("black");
		s8.add("blue");
		s8.add("white");
		s8.add("red");
		System.out.println(s8);
		
		ArrayList<String> s9 = new ArrayList<String>(s8);
		System.out.println(s9);
		
	}
}
