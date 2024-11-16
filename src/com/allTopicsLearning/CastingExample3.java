package com.allTopicsLearning;

class MachineNovember17 {
	public void start() {
		System.out.println("Machine class start method");
	}
}

class CameraNovember17 extends MachineNovember17 {

	public void start() {
		System.out.println("Camera class start method");
	}

	public void snap() {
		System.out.println("Camera class snap method");
	}
}

public class CastingExample3 {

	public static void main(String[] args) {

		// upcasting
		// casted from child class camera to parent class machine
		// now prints value of camera class method.
		// All values and references of child object put into machine object.
		CameraNovember17 c1 = new CameraNovember17();
		MachineNovember17 m1 = c1;
		m1.start();
		// no snap method for parent

	}

}
