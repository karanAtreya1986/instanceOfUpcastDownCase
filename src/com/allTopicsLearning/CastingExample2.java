package com.allTopicsLearning;

class MachineNovember14 {
	public void start() {
		System.out.println("Machine class start method");
	}
}

class CameraNovember14 extends MachineNovember14 {

	// override annotation is not mandatory for overridden child class methods.
	public void start() {
		System.out.println("Camera class start method");
	}

	public void snap() {
		System.out.println("Camera class snap method");
	}
}

public class CastingExample2 {

	public static void main(String[] args) {

		MachineNovember14 m1 = new MachineNovember14();
		m1.start(); // machine class start method.

		CameraNovember14 c1 = new CameraNovember14();
		c1.snap(); // camera class snap method.
		c1.start(); // camera class start method.
	}

}
