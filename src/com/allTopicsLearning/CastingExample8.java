package com.allTopicsLearning;

class MachineNovember22 {
	public void start() {
		System.out.println("Machine class start method");
	}
}

class CameraNovember22 extends MachineNovember22 {

	public void start() {
		System.out.println("Camera class start method");
	}

	public void snap() {
		System.out.println("Camera class snap method");
	}
}

public class CastingExample8 {

	public static void main(String[] args) {

		// upcasting
		// make object null and check casting.
		CameraNovember21 c1 = new CameraNovember21();
		MachineNovember21 m1 = c1;
		m1.start();
		// no snap method for parent
		c1.snap();
		c1.start();

		m1 = null;

		System.out.println("  ---------- instance of check --------------");

		boolean b1 = c1 instanceof MachineNovember21;
		System.out.println(b1); // true

		boolean b2 = c1 instanceof CameraNovember21;
		System.out.println(b2); // true

		boolean b3 = m1 instanceof CameraNovember21;
		System.out.println(b3); // m1's will be false as we nullified the object.

		boolean b4 = m1 instanceof MachineNovember21;
		System.out.println(b4); // m1's will be false as we nullified the object.

	}

}
