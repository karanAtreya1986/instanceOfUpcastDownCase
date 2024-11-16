package com.allTopicsLearning;

public class InstanceOfProgram2 {

	// make the object null and try to check for instanceof()

	public static void main(String[] args) {
		InstanceOfProgram2 object1 = new InstanceOfProgram2();
		boolean b1 = object1 instanceof InstanceOfProgram2;
		System.out.println(b1); // true
		object1 = null;
		boolean b2 = object1 instanceof InstanceOfProgram2;
		System.out.println(b2); // false, since now pointing to null

	}

}
