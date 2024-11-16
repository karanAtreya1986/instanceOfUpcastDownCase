package com.allTopicsLearning;

import javax.swing.BorderFactory;

class MachineClassThree {

	public void startMethod() {
		System.out.println("I am machine class");
	}
}

class CameraClassThree extends MachineClassThree {

	public void startMethod() {
		System.out.println("I am Camera class");
	}

	void snap() {
		System.out.println("I click photographs ----- camera class");
	}
}

public class InstanceOfProgram7 {

	public static void main(String[] args) {

		MachineClassThree m1 = new MachineClassThree();
		// will throw run time error class cast exception because
		// It will throw casting error because m1 is of type machine and it does not
		// know what the child wants.
		CameraClassThree c1 = (CameraClassThree) m1;
		m1.startMethod();
		// no snap method of child in parent as reverse not possible from child to
		// parent.
		c1.startMethod();
		c1.snap();

		// Downcasting can be done on classes having some relationship like
		// parent-child.
	}

}
