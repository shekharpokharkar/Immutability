package com.seleniumExpress;

import java.util.Objects;

public class Student {

	private final String studentName;

	public Student(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentName() {
		return studentName;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(studentName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(studentName, other.studentName);
	}

}
