package org.com.excepthread;

import java.io.NotActiveException;

public class excepthreadsoops  extends RuntimeException{

	//Exception handling program 1
	//Arithmetic exception only arithematic values
	
	public static void main(String[] args)/* throws InterruptedException*/
	{
		/*
		int a=10,b=0,c;
		System.out.println("Before Exception occured");
		try {
		
			c=a/b;
			System.out.println("After Exception occured");
		}
		catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}
		System.out.println("post exception");
		*/
		
		///multiple catch block
		/*
		int a=10,b=0,c;
		int d[] = new int[2];
		
		System.out.println("Before Exception occured");
		try {
		
			c=a/b;
			d[2] = 25;
			System.out.println("After Exception occured");
		}
		catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		System.out.println("post exception");
		*/
		///all exception  progrom
		/*
		int a=10,b=0,c;
		int d[] = new int[2];
		
		System.out.println("Before Exception occured");
		try {
		
			c=a/b;
			d[2] = 25;
			System.out.println("After Exception occured");
		}
		catch (Exception e) {
			System.out.println("Arithmetic Exception");
		}
		System.out.println("post exception");
		*/
		///using throws keyword
		/*
		System.out.println("main starts");
		Thread.sleep(1000);
		System.out.println("main ends");
		*/
		///throw keyword also used for writing comment
		
		//throw new ArithmeticException("commet here");
		//program for throw keyword
		/*
		int age=15;
		if(age<18)
		{
			throw new ArithmeticException("not eligible to vote");
		}
		else
		{
			System.out.println("eligible to vote");
		}
		*/
		
	
		
	}
		
}


