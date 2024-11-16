package com.allTopicsLearning;

class MachineNovember18 {
	public void start() {
		System.out.println("Machine class start method");
	}
}

class CameraNovember18 extends MachineNovember18 {

	public void start() {
		System.out.println("Camera class start method");
	}

	public void snap() {
		System.out.println("Camera class snap method");
	}
}

public class CastingExample4 {

	public static void main(String[] args) {

		// downcasting
		MachineNovember18 m1 = new MachineNovember18();
		m1.start(); // machine start method called.
		// no snap for parent.
		// converting parent to child -- machine to camera
		// run time error - class cast exception.
		CameraNovember18 c1 = (CameraNovember18) m1;
		c1.snap();
		c1.start();

	}

}
