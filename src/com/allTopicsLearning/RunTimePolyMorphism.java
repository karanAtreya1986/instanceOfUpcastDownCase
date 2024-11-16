package com.allTopicsLearning;

class MachineNovember15 {
	public void start() {
		System.out.println("Machine class start method");
	}
}

class CameraNovember15 extends MachineNovember15 {

	public void start() {
		System.out.println("Camera class start method");
	}

	public void snap() {
		System.out.println("Camera class snap method");
	}
}

public class RunTimePolyMorphism {

	public static void main(String[] args) {

		// When we write, we feel that start of machine class will be called, but during
		// run it changes.
		// camera class method called, run time polymorphism.
		MachineNovember15 m1 = new CameraNovember15();
		m1.start();
		// no snap method as reference of parent not child.
	}

}
