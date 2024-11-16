package com.allTopicsLearning;

public class ObjectEquality2 {

	public static void main(String[] args) {

		String s1 = new String("abc");
		String s2 = new String("abc");

		// == does not work at object level.
		// string class used at literal level and used as variable will work with ==
		if (s1 == s2) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
	}

}
