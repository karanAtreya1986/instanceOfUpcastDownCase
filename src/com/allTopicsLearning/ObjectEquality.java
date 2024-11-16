package com.allTopicsLearning;

public class ObjectEquality {

	// Object class-
	// Top most class.
	// Also known as root class.
	// Every api in java is child of object class.
	// Many methods of objects class are present. All methods become available when
	// you create
	// object of a class. You can then use these objects and access these methods.

	// No need to extend objects.
	// Every api extends this objects class by default.
	// Object is present in java.lang package.
	// Object is parent of all classes in java by default.
	// Methods of objects class-
	// Equals
	// Hashcode
	// Clone
	// Wait
	// Notify
	// Notifyall

	// Equals, hashcode and clone mainly used for object equality checks.

	public static void main(String[] args) {

		String s1 = "abc";
		String s2 = "abc";

		// == for primitive data types, variables, literals and constants, classes.
		// not for non primitive types and objects.
		if (s1 == s2) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
	}

}
