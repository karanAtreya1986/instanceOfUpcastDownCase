package com.allTopicsLearning;

class MachineNovember21 {
	public void start() {
		System.out.println("Machine class start method");
	}
}

class CameraNovember21 extends MachineNovember21 {

	public void start() {
		System.out.println("Camera class start method");
	}

	public void snap() {
		System.out.println("Camera class snap method");
	}
}

public class CastingExample7 {

	public static void main(String[] args) {

		// upcasting
		// checking instanceof in upcasting
		CameraNovember21 c1 = new CameraNovember21();
		MachineNovember21 m1 = c1;
		m1.start();
		// no snap method for parent
		c1.snap();
		c1.start();

		System.out.println("  ---------- instance of check --------------");

		// all are true because c1 and m1 now point to machine and camera's memory
		// address.
		boolean b1 = c1 instanceof MachineNovember21;
		System.out.println(b1);

		boolean b2 = c1 instanceof CameraNovember21;
		System.out.println(b2);

		boolean b3 = m1 instanceof CameraNovember21;
		System.out.println(b3);

		boolean b4 = m1 instanceof MachineNovember21;
		System.out.println(b4);

	}

}
