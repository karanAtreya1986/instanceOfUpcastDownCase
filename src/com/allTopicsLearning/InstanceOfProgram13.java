package com.allTopicsLearning;

import javax.swing.BorderFactory;

class ABC14 {

}

interface PQR14 {

}

class InstanceOfKeyword14 extends ABC14 implements PQR14 {

	public static void main(String[] args) {

		InstanceOfKeyword14 object1 = new InstanceOfKeyword14();
		boolean b1 = object1 instanceof InstanceOfKeyword14;
		System.out.println(b1); // true

		boolean b2 = object1 instanceof ABC14;
		System.out.println(b2); // true

		// because of relation between interface and class, so instanceof is true.
		boolean b3 = object1 instanceof PQR14;
		System.out.println(b3); // true

	}
}
