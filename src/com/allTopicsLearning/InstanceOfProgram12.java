package com.allTopicsLearning;

import javax.swing.BorderFactory;

class ABC13 {

}

interface PQR13 {

}

class InstanceOfKeyword13 extends ABC13 {

	public static void main(String[] args) {

		InstanceOfKeyword13 object1 = new InstanceOfKeyword13();
		boolean b1 = object1 instanceof InstanceOfKeyword13;
		System.out.println(b1); // true

		boolean b2 = object1 instanceof ABC13;
		System.out.println(b2); // true

		// because no relation between interface and class, so instanceof is false.
		boolean b3 = object1 instanceof PQR13;
		System.out.println(b3); // false

	}
}
