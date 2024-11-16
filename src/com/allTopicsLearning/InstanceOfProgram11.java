package com.allTopicsLearning;

import javax.swing.BorderFactory;

class ABC12 {

}

class InstanceOfKeyword12 extends ABC12 {

	public static void main(String[] args) {

		InstanceOfKeyword12 object1 = new InstanceOfKeyword12();
		boolean b1 = object1 instanceof InstanceOfKeyword12;
		System.out.println(b1); // true

		// extend class and since relation there, so instanceof works now.
		boolean b2 = object1 instanceof ABC12;
		System.out.println(b2); // true

	}
}
