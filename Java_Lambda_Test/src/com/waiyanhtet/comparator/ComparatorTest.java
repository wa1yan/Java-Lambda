package com.waiyanhtet.comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.waiyanhtet.Person;

public class ComparatorTest {
	
	static void print(List<Person> list) {
		for (Person p : list) {
			p.printName();
		}
	}

	public static void main(String[] args) {
		List<Person> personList = Person.createPersonList();
		System.out.println("Before sorting : ");
		print(personList);
	
		Collections.sort(personList, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				return p1.getName().compareTo(p2.getName());
			}
		});
		System.out.println("After sorting : ");
		print(personList);
		
		Collections.sort(personList, (Person p1, Person p2) -> {
			return p2.getName().compareTo(p1.getName());
		});
		System.out.println("After sorting : ");
		print(personList);
	}
}
