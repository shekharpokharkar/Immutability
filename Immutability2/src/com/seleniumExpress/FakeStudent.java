package com.seleniumExpress;

import java.util.Objects;

public class FakeStudent extends Student{

	private String fakeStudentName;

	public FakeStudent(String fakeStudentName) {
		super(fakeStudentName);
		this.fakeStudentName = fakeStudentName;
	}

	@Override
	public String getStudentName() {
		return fakeStudentName;
	}


	public void setFakeStudentName(String fakeStudentName) {
		this.fakeStudentName = fakeStudentName;
	}

	@Override
	public String toString() {
		return "FakeStudent [fakeStudentName=" + fakeStudentName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(fakeStudentName);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		FakeStudent other = (FakeStudent) obj;
		return Objects.equals(fakeStudentName, other.fakeStudentName);
	}
	
	
	
	
	
	
}
