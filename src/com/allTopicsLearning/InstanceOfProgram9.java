package com.allTopicsLearning;

import javax.swing.BorderFactory;

class MachineClassFive {

	public void startMethod() {
		System.out.println("I am machine class");
	}
}

class CameraClassFive extends MachineClassFive {

	public void startMethod() {
		System.out.println("I am Camera class");
	}

	void snap() {
		System.out.println("I click photographs ----- camera class");
	}
}

public class InstanceOfProgram9 {

	public static void main(String[] args) {

		MachineClassFive m1 = new MachineClassFive();
		// this will throw compile error - Type mismatch: cannot convert from
		// MachineClassFive to CameraClassFive
//		CameraClassFive c1 = new MachineClassFive();

		// this will throw class cast exception in run time.
		CameraClassFive c1 = (CameraClassFive) new MachineClassFive();
		m1.startMethod();
		// m1 will not have child methods as its parent.
		c1.startMethod();
		c1.snap();

	}

}
