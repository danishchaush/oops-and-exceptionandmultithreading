package com.org.java;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class program5 {

	public static void main(String[] args) {
		/* priority queue peak and poll methods */
		
		PriorityQueue<String> q1 = new PriorityQueue<String>();
		
		q1.add("abc");
		q1.add("cat");
		q1.add("baby");
		q1.add("bat");
		while(q1.peek()!=null)
		{
			System.out.println(q1.poll());
			
		}
		
		System.out.println("linked list");
		
		/* normal queue */
		Queue<String> s1 = new LinkedList<String>();
		s1.add("abc");
		s1.add("cat");
		s1.add("baby");
		s1.add("bat");
		 while(s1.peek()!=null)
		 {
			 System.out.println(s1.poll());
		 }
		
	}
}
