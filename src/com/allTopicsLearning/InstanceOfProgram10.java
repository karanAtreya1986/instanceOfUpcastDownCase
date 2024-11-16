package com.allTopicsLearning;

import javax.swing.BorderFactory;

class ABC {

}

class InstanceOfKeyword11 {

	public static void main(String[] args) {

		InstanceOfKeyword11 object1 = new InstanceOfKeyword11();
		boolean b1 = object1 instanceof InstanceOfKeyword11;
		System.out.println(b1); // true

		// We cannot create instance of between classes not related , else we get this
		// error.
		// compile error - Incompatible conditional operand types InstanceOfKeyword11
		// and ABC
//		boolean b2 = object1 instanceof ABC;

	}
}
