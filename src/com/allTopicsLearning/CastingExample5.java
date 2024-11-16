package com.allTopicsLearning;

class MachineNovember19 {
	public void start() {
		System.out.println("Machine class start method");
	}
}

class CameraNovember19 extends MachineNovember19 {

	public void start() {
		System.out.println("Camera class start method");
	}

	public void snap() {
		System.out.println("Camera class snap method");
	}
}

public class CastingExample5 {

	public static void main(String[] args) {

		// downcasting
		// To remove the exception of class cast which we get in downcasting, we change
		// code as below:
		// Reference of parent and object of child. Then cast parent to child.

		MachineNovember19 m1 = new CameraNovember19();
		m1.start(); // calls camera start method as object is created of camera
		// no snap method for parent
		CameraNovember19 c1 = (CameraNovember19) m1;
		c1.snap();
		c1.start();

	}

}
