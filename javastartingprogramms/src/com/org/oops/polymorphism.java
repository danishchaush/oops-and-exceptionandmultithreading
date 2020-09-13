package com.org.oops;

public class polymorphism {

	
	public static void main(String[] args) {
		
		///complie time polymorphism use the method overloading 
		///its is also called static polymorphism
		/*polyone polyone = new polyone();
		
		polyone.add(3, 5);
		polyone.add(2.5, 3.5);
		polyone.add("danish", "chaush");
		*/
		///runtime time polymorphism use the method overridding
		///its is also called dynamic polymorphoism
		polythree polythree = new polythree();
		polythree.sub();
	}
}

