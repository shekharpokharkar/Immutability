package com.seleniumexpress;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
	
		List<String> hobbiesList = new ArrayList<>();
		hobbiesList.add("Reading");
		hobbiesList.add("Swimming");

		Address add = new Address("s corner", "Pimpalgaon Road", "Manchar", "Maharashtra");
		Student shekhar = new Student(101, "shekhar", add, false, hobbiesList);

		System.out.println(shekhar);
		
		Address address = shekhar.getAddress();
		address.setLane1("Sargam colocny");

		System.out.println(shekhar);
		
		List<String> hobbies = shekhar.getHobbies();
		hobbies.add("Movie Watching");
		System.out.println(shekhar);
		
		
		hobbiesList.add("Car Driving");
		System.out.println(shekhar);
	}

}
