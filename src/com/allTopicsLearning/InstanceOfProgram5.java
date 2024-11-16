package com.allTopicsLearning;

import javax.swing.BorderFactory;

class MachineClass {

	public void startMethod() {
		System.out.println("I am machine class");
	}
}

class CameraClass extends MachineClass {

	public void startMethod() {
		System.out.println("I am Camera class");
	}

	void snap() {
		System.out.println("I click photographs ----- camera class");
	}
}

public class InstanceOfProgram5 {

	public static void main(String[] args) {

		MachineClass m1 = new MachineClass();
		CameraClass c1 = new CameraClass();

		m1.startMethod();
		c1.startMethod();
		c1.snap();

		System.out.println("------------>");
		// upcasting
		// We will give same memory address to parent and child class.

		boolean b5 = m1 instanceof MachineClass;
		System.out.println(b5); // true because instance of machine class created.

		boolean b6 = m1 instanceof CameraClass;
		System.out.println(b6); // false because c1 and m1 point to different memory address.

		boolean b7 = c1 instanceof MachineClass;
		System.out.println(b7); // true because now c1 is child of machine class.

		boolean b8 = c1 instanceof CameraClass;
		System.out.println(b8); // this is naturally true

		System.out.println("------------->");

		m1 = c1;
		m1.startMethod(); // m1.start() calls start() of camera not machine.

		// Upcasting happens automatically. If methods are overridden in child, then no
		// matter what, child class methods are called.
		// Upcasting – happens automatically in Java. We don’t need to do anything.

		boolean b1 = m1 instanceof MachineClass;
		System.out.println(b1); // true because instance of machine class created.

		boolean b2 = m1 instanceof CameraClass;
		System.out.println(b2); // true because we have c1 to m1

		boolean b3 = c1 instanceof MachineClass;
		System.out.println(b3); // true because now c1 and m1 point to same thing.

		boolean b4 = c1 instanceof CameraClass;
		System.out.println(b4); // this is naturally true

		System.out.println("----------->");

		c1.startMethod(); // prints camera class only.
	}

}
