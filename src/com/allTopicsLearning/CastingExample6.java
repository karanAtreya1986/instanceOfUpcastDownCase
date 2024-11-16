package com.allTopicsLearning;

class MachineNovember20 {
	public void start() {
		System.out.println("Machine class start method");
	}
}

class CameraNovember20 extends MachineNovember20 {

	public void start() {
		System.out.println("Camera class start method");
	}

	public void snap() {
		System.out.println("Camera class snap method");
	}
}

public class CastingExample6 {

	public static void main(String[] args) {

		// checking instanceof along with downcasting.

		MachineNovember20 m1 = new CameraNovember20();
		m1.start(); // calls camera start method as object is created of camera
		// no snap method for parent
		CameraNovember20 c1 = (CameraNovember20) m1;
		c1.snap();
		c1.start();

		System.out.println("--------- check instance --------");

		// now both machine reference and camera reference point to same memory so
		// instanceof is true.

		// all are true because c1 and m1 now point to machine and camera's memory
		// address.
		boolean b1 = c1 instanceof MachineNovember20;
		System.out.println(b1);

		boolean b2 = m1 instanceof MachineNovember20;
		System.out.println(b2);

		boolean b3 = c1 instanceof CameraNovember20;
		System.out.println(b3);

		boolean b4 = m1 instanceof CameraNovember20;
		System.out.println(b4);

	}

}
