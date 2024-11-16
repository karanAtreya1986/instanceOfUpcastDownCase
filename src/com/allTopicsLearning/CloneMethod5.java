package com.allTopicsLearning;

public class CloneMethod5 implements Cloneable {

	int i1;
	String s1;

	public CloneMethod5(int i1, String s1) {
		super();
		this.i1 = i1;
		this.s1 = s1;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		CloneMethod5 cm1 = new CloneMethod5(1, "tata");

		CloneMethod5 cm2 = (CloneMethod5) cm1.clone();

		int i2 = cm1.i1;
		System.out.println("cm1 integer value is " + i2);
		String s2 = cm1.s1;
		System.out.println("cm1 string value is " + s2);

		int i3 = cm2.i1;
		System.out.println("cm2 integer value is " + i3);
		String s3 = cm2.s1;
		System.out.println("cm2 string value is " + s3);

		// this is called releasing memory and clearing it out.
		// object used and now can be removed out.
		cm1 = null;
		cm2 = null;

	}

}
