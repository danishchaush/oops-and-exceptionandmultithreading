package com.org.java;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class program6 {

	public static void main(String[] args) {
		
		/* set interface */
		
		/* normal hasset */
		HashSet<String> s1  = new HashSet<String>();
		
		s1.add("java");
		s1.add("sql");
		s1.add("123");
		s1.add("sql");
		s1.add("apptitude");
		System.out.println(s1);
		
		/* linked hasset */
		
		LinkedHashSet<String> s2 = new LinkedHashSet<String>();
		
		s2.add("java");
		s2.add("sql");
		s2.add("123");
		s2.add("sql");
		System.out.println(s2);
		
		/* tree set */
		
		TreeSet<String> s3  = new TreeSet<String>();
		
		s3.add("java");
		s3.add("sql");
		s3.add("123");
		s3.add("sql");
		System.out.println(s3);
		
	}
}
