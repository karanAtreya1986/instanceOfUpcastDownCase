package com.allTopicsLearning;

class EmployeeTwo {

	private String employeeName;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

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
		EmployeeTwo other = (EmployeeTwo) obj;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		return true;
	}

}

public class ObjectEquality6 {

	public static void main(String[] args) {

		EmployeeTwo e1 = new EmployeeTwo();
		e1.setEmployeeName("abcd23234");
		EmployeeTwo e2 = new EmployeeTwo();
		e2.setEmployeeName("abcd23234");

		// to get the hash code we have direct method on the object reference name.
		// Hash code is secondary level check to confirm if objects are equal.
		// Objects – how to remember what are objects. They are associated with new
		// keyword.

		// hash code method - Used for getting bucket number, also known as memory
		// allocation.

		int i1 = e1.hashCode();
		System.out.println("hash code of e1 is " + i1);

		int i2 = e2.hashCode();
		System.out.println("hash code of e2 is " + i2);

	}
}
