package com.allTopicsLearning;

public class ObjectEquality7 {

	public static void main(String[] args) {

		// these are known as string literals if defined this way.
		String s1 = "abc";
		String s2 = "abc";

		// .equals work for primitive, literals, variables, constants and classes also.
		// it can be used for any comparison in java.

		// When you have literals, you can any of them.
		// If you have objects, then use equals method.

		if (s1.equals(s2)) {
			System.out.println("matches");
		} else {
			System.out.println("not matching");
		}
	}

}
