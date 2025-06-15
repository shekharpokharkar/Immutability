package com.seleniumExpress;

import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		/*
		 * When ever your hashcode key is mutable then this issue will arise like you
		 * didnt get correct value
		 */
		/*
		 * This is case why Immuatble object should final
		 */
		FakeStudent fakeStudent = new FakeStudent("Akshay");

		Student shekhar = fakeStudent;

		HashMap<Student, String> map = new HashMap<>();
		map.put(shekhar, "Pune");

		System.out.println(map.get(shekhar));

		fakeStudent.setFakeStudentName("shekhar");

		System.out.println(map.get(shekhar));

	}

}
