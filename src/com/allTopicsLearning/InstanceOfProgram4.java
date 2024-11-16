package com.allTopicsLearning;

class ParentClassOne {

	public void parentMessageMethod() {
		System.out.println("I am parent class");
	}
}

class ChildOne extends ParentClassOne {

	public void childOneMessageMethod() {
		System.out.println("I am ChildOne class");
	}
}

//Instanceof solves null pointer exception and class cast exceptions.

class ChildTwo extends ParentClassOne {

	public void childTwoMessageMethod() {
		System.out.println("I am ChildTwo class");
	}
}

public class InstanceOfProgram4 {

	public static void main(String[] args) {

		ParentClassOne p1 = new ParentClassOne();
		ParentClassOne c1 = new ChildOne();
		ParentClassOne c2 = new ChildTwo();

		// call by reference.
		// We are copying memory address of c1 and c2 in p1 variable. Now, all three
		// have same memory address.

		boolean b1 = p1 instanceof ParentClassOne;
		System.out.println(b1);

		p1 = c1; // copy c1 reference memory address to p1.
		// c1 and p1 point to same thing.
		boolean b2 = p1 instanceof ChildOne;
		System.out.println(b2);

		p1 = c2; // copy c2 reference memory address to p1.
		// c2 and p1 point to same thing.
		boolean b3 = p1 instanceof ChildTwo;
		System.out.println(b3);

	}

}
