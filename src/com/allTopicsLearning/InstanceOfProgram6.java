package com.allTopicsLearning;

import javax.swing.BorderFactory;

class MachineClassTwo {

	public void startMethod() {
		System.out.println("I am machine class");
	}
}

class CameraClassTwo extends MachineClassTwo {

	public void startMethod() {
		System.out.println("I am Camera class");
	}

	void snap() {
		System.out.println("I click photographs ----- camera class");
	}
}

public class InstanceOfProgram6 {

	public static void main(String[] args) {

		// downcasting not allowed in java.
		// compile error - Type mismatch: cannot convert from MachineClassTwo to
		// CameraClassTwo
		// parent class cannot become child class but vice versa possible.
		MachineClassTwo m1 = new CameraClassTwo();
//		CameraClassTwo c1 = (MachineClassTwo) m1;

		// We are changing machine object to camera object.
		CameraClassTwo c1 = (CameraClassTwo) m1;

		m1.startMethod(); // prints camera class method as casting done above.
		// m1 cannot access snap method because its specific to child but child can
		// access any method of parent.
		c1.startMethod(); // its reference of camera so naturally it calls camera method only.
		c1.snap();

	}

}
