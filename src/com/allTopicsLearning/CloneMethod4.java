package com.allTopicsLearning;

public class CloneMethod4 implements Cloneable {

	// even when you use the clone method, we need to implement the cloneable
	// interface, to avoid exceptions.

	// But now this clone() method creation is not used much. Earlier approach of
	// cloning is more frequently used for cloning.
	int i1;
	String s1;

	public CloneMethod4(int i1, String s1) {
		super();
		this.i1 = i1;
		this.s1 = s1;
	}

	// both ways are correct to write the clone method and gives same output.

//	public Object clone() throws CloneNotSupportedException {
//		return super.clone();
//	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		CloneMethod4 cm1 = new CloneMethod4(1, "tata");

		CloneMethod4 cm2 = (CloneMethod4) cm1.clone();

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
