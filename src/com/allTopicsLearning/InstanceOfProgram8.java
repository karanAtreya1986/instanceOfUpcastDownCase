package com.allTopicsLearning;

import javax.swing.BorderFactory;

class MachineClassFour {

	public void startMethod() {
		System.out.println("I am machine class");
	}
}

class CameraClassFour extends MachineClassFour {

	public void startMethod() {
		System.out.println("I am Camera class");
	}

	void snap() {
		System.out.println("I click photographs ----- camera class");
	}
}

public class InstanceOfProgram8 {

	public static void main(String[] args) {

		// we cannot have reference of child and object of parent.
		// reverse possible.
		// compile error - Type mismatch: cannot convert from MachineClassFour to
		// CameraClassFour
//		CameraClassFour c1 = new MachineClassFour();
		//we get class cast exception during run time.
		CameraClassFour c1 = (CameraClassFour) new MachineClassFour();
		MachineClassFour m1=new MachineClassFour();
		m1.startMethod();
		c1.startMethod();
		c1.snap();

	}

}
