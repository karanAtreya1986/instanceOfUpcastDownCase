package com.allTopicsLearning;

class EmployeeThree {

	private String employeeName;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

}

public class ObjectEquality8 {

	public static void main(String[] args) {

		EmployeeThree e1 = new EmployeeThree();
		e1.setEmployeeName("abcd23234");
		EmployeeThree e2 = new EmployeeThree();
		e2.setEmployeeName("abcd23234");

		// If the equals and hashcode method was not there, hashcode would return
		// different bucket numbers.

		int i1 = e1.hashCode();
		System.out.println("hash code of e1 is " + i1);

		int i2 = e2.hashCode();
		System.out.println("hash code of e2 is " + i2);

	}
}
