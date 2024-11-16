package com.allTopicsLearning;

public class ObjectEquality3 {

	public static void main(String[] args) {

		String s1 = new String("abc");
		String s2 = new String("abc");

		// to compare objects use .equals method
		// equals require another object.
		// returns true or false.
		if (s1.equals(s2)) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
	}

}
