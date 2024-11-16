package com.allTopicsLearning;

public class CloneMethod3 {

//another way to clone is use clone method
	// but we have not implemented cloneable interface
	// we will get run time error -clone not supported exception

	int i1;
	String s1;

	public CloneMethod3(int i1, String s1) {
		super();
		this.i1 = i1;
		this.s1 = s1;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		CloneMethod3 cm1 = new CloneMethod3(1, "tata");

		CloneMethod3 cm2 = (CloneMethod3) cm1.clone();

		int i2 = cm1.i1;
		System.out.println("cm1 integer value is " + i2);
		String s2 = cm1.s1;
		System.out.println("cm1 string value is " + s2);

		int i3 = cm2.i1;
		System.out.println("cm2 integer value is " + i3);
		String s3 = cm2.s1;
		System.out.println("cm2 string value is " + s3);

	}

}
