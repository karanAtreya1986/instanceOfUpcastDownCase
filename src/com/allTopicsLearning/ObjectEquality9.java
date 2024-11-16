package com.allTopicsLearning;

class EmployeeFour {

	private String employeeName;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

}

public class ObjectEquality9 {

	public static void main(String[] args) {

		// hashcode and equals method has to be implemented for every custom class.
		// if not equals method will keep giving wrong output.

		// For already existing objects, equals and hashcode need not be defined
		// explicitly. They are present in-built. Only for custom class, we need to
		// define these methods.

		EmployeeFour e1 = new EmployeeFour();
		e1.setEmployeeName("abcd23234");
		EmployeeFour e2 = new EmployeeFour();
		e2.setEmployeeName("abcd23234");

		if (e1.equals(e2)) {
			System.out.println("matching");
		} else {
			System.out.println("not matching");
		}

	}
}
