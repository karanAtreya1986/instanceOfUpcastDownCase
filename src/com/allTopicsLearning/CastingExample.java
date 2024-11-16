package com.allTopicsLearning;

class Machine {
	public void start() {
		System.out.println("Machine class start method");
	}
}

class Camera extends MachineNovember14 {

	@Override
	public void start() {
		System.out.println("Camera class start method");
	}

	public void snap() {
		System.out.println("Camera class snap method");
	}
}

public class CastingExample {

	// Downcast happens in inheritance when we override methods of parent class and
	// we need the methods from child class.
	// Upcast – happens automatically in java.
	// Downcast – happens only manually.

	public static void main(String[] args) {

		MachineNovember14 m1 = new MachineNovember14();
		m1.start(); // machine class start method.

		Camera c1 = new Camera();
		c1.snap(); // camera class snap method.
		c1.start(); // camera class start method.
	}

}
