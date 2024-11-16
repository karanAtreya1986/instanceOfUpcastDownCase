package com.allTopicsLearning;

public class CloneMethod {

	int i1;
	String s1;

	public CloneMethod(int i1, String s1) {
		super();
		this.i1 = i1;
		this.s1 = s1;
	}

	public static void main(String[] args) {
		CloneMethod cm1 = new CloneMethod(1, "tata");
		int i2 = cm1.i1;
		System.out.println("integer value is " + i2);
		String s2 = cm1.s1;
		System.out.println("string value is " + s2);
	}

	// Serializable and clonable are two marker interface in java. Marker means no
	// methods or fields inside these interfaces.
	// Cloneable used to create clone of an object.
	// Serializable is used to send object data over network in secured way.

	// When to use cloning- Critical functionality present in one object and you
	// don’t want to spoit it.

}
