package com.allTopicsLearning;

//see how to check instances and outputs.

class ParentClass {
}

class Child1 extends ParentClass {
}

class Child2 extends ParentClass {
}

public class InstanceOfProgram3 {

	public static void main(String[] args) {

		ParentClass p1 = new ParentClass();
		ParentClass c1 = new Child1();
		ParentClass c2 = new Child2();

		boolean b1 = p1 instanceof ParentClass;
		System.out.println(b1); // true

		boolean b2 = p1 instanceof Child1;
		System.out.println(b2); // false

		boolean b3 = p1 instanceof Child2;
		System.out.println(b3); // false

		boolean b4 = c1 instanceof ParentClass;
		System.out.println(b4); // true

		boolean b5 = c1 instanceof Child1;
		System.out.println(b5); // true

		boolean b6 = c1 instanceof Child2;
		System.out.println(b6); // false

		boolean b7 = c2 instanceof ParentClass;
		System.out.println(b7); // true

		boolean b8 = c2 instanceof Child1;
		System.out.println(b8); // false

		boolean b9 = c2 instanceof Child2;
		System.out.println(b9); // true

	}

}
