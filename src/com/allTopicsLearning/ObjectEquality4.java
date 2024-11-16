package com.allTopicsLearning;

class employee {

	private String employeeName;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

}

public class ObjectEquality4 {

	public static void main(String[] args) {

		employee e1 = new employee();
		e1.setEmployeeName("abcd23234");
		employee e2 = new employee();
		e2.setEmployeeName("abcd23234");

		// with custom class, .equals doesnt work directly.
		// we have to generate hashcode and override equals method.
		if (e1.equals(e2)) {
			System.out.println("hello same name");
		} else {
			System.out.println("different name hello");
		}

	}
}
