package com.allTopicsLearning;

class MachineNovember16 {
	public void start() {
		System.out.println("Machine class start method");
	}
}

class CameraNovember16 extends MachineNovember16 {

	public void start1() {
		System.out.println("Camera class start method");
	}

	public void snap() {
		System.out.println("Camera class snap method");
	}
}

public class RunTimePolyMorphism2 {

	public static void main(String[] args) {

		// If the method name itself is different or not present in child class-Then it
		// calls parent class start() method.
		// as no start method in the child class, so parent class is called now.
		MachineNovember16 m1 = new CameraNovember16();
		m1.start();
		// no snap method as reference of parent not child.
	}

}
