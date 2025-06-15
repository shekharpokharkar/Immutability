package com.seleniumexpress;

import java.util.ArrayList;
import java.util.List;

public final class Student {

	private final Integer studentId;
	private final String studentName;
	private final Address address;
	private final Boolean isMarried;
	private final List<String> hobbies;

	public Student(Integer studentId, String studentName, Address address, Boolean isMarried, List<String> hobbies) {

		this.studentId = studentId;
		this.studentName = studentName;
		this.address = address;
		this.isMarried = isMarried;

		List<String> newlist = new ArrayList<>();
		newlist.addAll(hobbies);
		this.hobbies = newlist;

	}

	public Integer getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public Address getAddress() {
		// return new Address(address.getLane1(), address.getLane2(), address.getCity(),
		// address.getState());

		// return new Address(address);

		return Address.getInstance(address);

	}

	public Boolean getIsMarried() {
		return isMarried;
	}

	public List<String> getHobbies() {
		return new ArrayList<>(hobbies);

	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", address=" + address
				+ ", isMarried=" + isMarried + ", hobbies=" + hobbies + "]";
	}

}
