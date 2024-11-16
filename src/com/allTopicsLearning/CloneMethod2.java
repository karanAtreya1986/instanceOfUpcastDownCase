package com.allTopicsLearning;

public class CloneMethod2 implements Cloneable {

	// use cloneable interface and clone objects.

	// Create clone involves two steps -
	// 1. Implement cloneable interface.
	// 2. cloneable interface is part of java.lang package.

	int i1;
	String s1;

	public CloneMethod2(int i1, String s1) {
		super();
		this.i1 = i1;
		this.s1 = s1;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		CloneMethod2 cm1 = new CloneMethod2(1, "tata");
		CloneMethod2 cm2 = (CloneMethod2) cm1.clone();

		int i2 = cm1.i1;
		System.out.println("cm1 integer value is " + i2);
		String s2 = cm1.s1;
		System.out.println("cm1 string value is " + s2);

		int i3 = cm2.i1;
		System.out.println("cm2 integer value is " + i3);
		String s3 = cm2.s1;
		System.out.println("cm2 string value is " + s3);

	}

}
