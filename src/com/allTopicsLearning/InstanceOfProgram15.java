package com.allTopicsLearning;

import javax.script.CompiledScript;

class ParentClassTwo {

}

interface PQR15 {

}

class ChildClassOne extends ParentClassTwo implements PQR15 {

}

class ChildClassTwo extends ParentClassTwo {

}

class InstanceOfKeyword15 {

	public static void main(String[] args) {

		ParentClassTwo p1 = new ParentClassTwo();
		// compile error - Type mismatch: cannot convert from ParentClassTwo to PQR15
//		PQR15 pq1=new ParentClassTwo(); 

		// run time error - class cast exception.
		// not allowed in java.
//		PQR15 pq1 = (PQR15) new ParentClassTwo();
		// compile error - Cannot instantiate the type PQR15
//		ParentClassTwo p2 = new PQR15();
		ParentClassTwo p2 = new ChildClassOne();
		ParentClassTwo p3 = new ChildClassTwo();
		// compile error - Cannot instantiate the type PQR15
//		PQR15 pq2=new PQR15(); 
		PQR15 pq2 = new ChildClassOne();
		// compile error - Type mismatch: cannot convert from ChildClassTwo to PQR15
//		PQR15 pq3 = new ChildClassTwo();

		// run time error
		// class cast exception
//		PQR15 pq3 = (PQR15) new ChildClassTwo();
		ChildClassOne c1 = new ChildClassOne();
		// compile error - Type mismatch: cannot convert from ChildClassTwo to
		// ChildClassOne
//		ChildClassOne c2 = new ChildClassTwo();
		// compile error - Type mismatch: cannot convert from ParentClassTwo to
		// ChildClassOne
//		ChildClassOne c2 = new ParentClassTwo();
		// compile error - Cannot instantiate the type PQR15
//		ChildClassOne c2 = new PQR15();
		ChildClassTwo c21 = new ChildClassTwo();
		// compile error - Type mismatch: cannot convert from ChildClassOne to
		// ChildClassTwo
//		ChildClassTwo c22 = new ChildClassOne();
		// compile error - Cannot instantiate the type PQR15
//		ChildClassTwo c22 = new PQR15();
		// compile error - Type mismatch: cannot convert from ParentClassTwo to
		// ChildClassTwo
//		ChildClassTwo c22 = new ParentClassTwo();

		boolean b1 = p1 instanceof ParentClassTwo;
		System.out.println(b1); // true as natural

		boolean b2 = p1 instanceof PQR15;
		System.out.println(b2); // not possible for interface so false

		boolean b3 = p1 instanceof ChildClassOne;
		System.out.println(b3); // false

		boolean b4 = p1 instanceof ChildClassTwo;
		System.out.println(b4); // false

		System.out.println("------------- check p2 now -----------");

		boolean b5 = p2 instanceof ParentClassTwo;
		System.out.println(b5); // true as natural

		boolean b6 = p2 instanceof PQR15;
		System.out.println(b6); // true because p2 reference of childClassOne
		// childClassOne implements interface

		boolean b7 = p2 instanceof ChildClassOne;
		System.out.println(b7); // true because p2 reference of childClassOne

		boolean b8 = p2 instanceof ChildClassTwo;
		System.out.println(b8); // false

		System.out.println("------------- check p3 now -----------");

		boolean b9 = p3 instanceof ParentClassTwo;
		System.out.println(b9); // true as natural

		boolean b10 = p3 instanceof PQR15;
		System.out.println(b10); // false as no relation

		boolean b11 = p3 instanceof ChildClassOne;
		System.out.println(b11); // false because no relation

		boolean b12 = p3 instanceof ChildClassTwo;
		System.out.println(b12); // true as related

		System.out.println("------------- check pq2 now -----------");

		boolean b13 = pq2 instanceof ParentClassTwo;
		System.out.println(b13); // true as related inversely using extends.

		boolean b14 = pq2 instanceof PQR15;
		System.out.println(b14); // true as natural relation.

		boolean b15 = pq2 instanceof ChildClassOne;
		System.out.println(b15); // true as related due to new object

		boolean b16 = pq2 instanceof ChildClassTwo;
		System.out.println(b16); // false as not related

		System.out.println("------------- check c1 now -----------");

		boolean b17 = c1 instanceof ParentClassTwo;
		System.out.println(b17); // true as related inversely using extends.

		boolean b18 = c1 instanceof PQR15;
		System.out.println(b18); // true as implements interface.

		boolean b19 = c1 instanceof ChildClassOne;
		System.out.println(b19); // true as naturally related.

		// compile error - Incompatible conditional operand types ChildClassOne and
		// ChildClassTwo
//		boolean b20 = c1 instanceof ChildClassTwo;
//		System.out.println(b20); // false as not related

		System.out.println("------------- check c21 now -----------");

		boolean b21 = c21 instanceof ParentClassTwo;
		System.out.println(b21); // true as related inversely using extends.

		boolean b22 = c21 instanceof PQR15;
		System.out.println(b22); // false as not implementing interface.

		// compile error - Incompatible conditional operand types ChildClassTwo and
		// ChildClassOne
//		boolean b23 = c21 instanceof ChildClassOne;
//		System.out.println(b23); // true as naturally related.

		boolean b20 = c21 instanceof ChildClassTwo;
		System.out.println(b20); // true by natural relation.
	}
}
