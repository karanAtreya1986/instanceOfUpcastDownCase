package com.allTopicsLearning;

class ParentClassOne14 {

	public void parentMessageMethod() {
		System.out.println("I am parent class");
	}
}

class ChildOne14 extends ParentClassOne14 {

	public void childOneMessageMethod() {
		System.out.println("I am ChildOne class");
	}
}

class ChildTwo14 extends ParentClassOne14 {

	public void childTwoMessageMethod() {
		System.out.println("I am ChildTwo class");
	}
}

public class InstanceOfProgram14 {

	public static void main(String[] args) {

		ParentClassOne14 p1 = new ParentClassOne14();
		ParentClassOne14 c1 = new ChildOne14();
		ParentClassOne14 c2 = new ChildTwo14();

		boolean b1 = p1 instanceof ParentClassOne14;
		System.out.println(b1);

		p1 = c1; // copy c1 reference memory address to p1.
		// c1 and p1 point to same thing.
		boolean b2 = p1 instanceof ChildOne14;
		System.out.println(b2);

		// this will be false, because childtwo14 instance not same as parent class
		// instance.
		boolean b3 = p1 instanceof ChildTwo14;
		System.out.println(b3);

	}

}
