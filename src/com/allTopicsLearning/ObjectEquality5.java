package com.allTopicsLearning;

class EmployeeOne {

	private String employeeName;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	// Equals does not work with custom class. Works only for wrapper and primitive
	// types.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeOne other = (EmployeeOne) obj;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		return true;
	}

}

public class ObjectEquality5 {

	public static void main(String[] args) {

		EmployeeOne e1 = new EmployeeOne();
		e1.setEmployeeName("abcd23234");
		EmployeeOne e2 = new EmployeeOne();
		e2.setEmployeeName("abcd23234");

		if (e1.equals(e2)) {
			System.out.println("hello same name");
		} else {
			System.out.println("different name hello");
		}

	}
}
