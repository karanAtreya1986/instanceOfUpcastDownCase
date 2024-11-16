package com.allTopicsLearning;

public class InstanceOfProgram1 {

	// Instanceof() –
	// It tells us whether the object is actually an instance of a class or
	// interface. See how to check instanceof.

	public static void main(String[] args) {
		InstanceOfProgram1 object1 = new InstanceOfProgram1();
		boolean b1 = object1 instanceof InstanceOfProgram1;
		System.out.println(b1);
	}

}
