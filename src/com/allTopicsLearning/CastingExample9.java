package com.allTopicsLearning;

class MachineNovember23 {
	public void start() {
		System.out.println("Machine class start method");
	}
}

class CameraNovember23 extends MachineNovember23 {

	public void start() {
		System.out.println("Camera class start method");
	}

	public void snap() {
		System.out.println("Camera class snap method");
	}
}

public class CastingExample9 {

	public static void main(String[] args) {

		// checking instanceof along with downcasting.

		MachineNovember23 m1 = new CameraNovember23();
		m1.start(); // calls camera start method as object is created of camera
		// no snap method for parent
		CameraNovember23 c1 = (CameraNovember23) m1;
		c1.snap();
		c1.start();

		c1 = null;

		System.out.println("--------- check instance --------");

		boolean b1 = c1 instanceof MachineNovember23;
		System.out.println(b1); // as c1 is nullified so false.

		boolean b2 = m1 instanceof MachineNovember23;
		System.out.println(b2); // true

		boolean b3 = c1 instanceof CameraNovember23;
		System.out.println(b3); // as c1 is nullified so false.

		boolean b4 = m1 instanceof CameraNovember23;
		System.out.println(b4); // true

	}

}
