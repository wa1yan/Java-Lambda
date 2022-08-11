package com.waiyanhtet;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Person {

	private String name;
	private int age;
	private String position;

	public Person(String name, int age, String position) {
		this.name = name;
		this.age = age;
		this.position = position;
	}

	public String getPosition() {
		return position;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void printName() {
		System.out.println(name);
	}
	
	public String customPrint(Function<Person, String> f) {
		return f.apply(this);
	}
	
	public static List<Person> createPersonList() {
		var personList = new ArrayList<Person>();
		personList.add(new Person("White",23,"CB"));
		personList.add(new Person("Jesus",25,"ST"));
		personList.add(new Person("Saka",20,"ST"));
		personList.add(new Person("Saliba",20,"CB"));
		personList.add(new Person("Martenalli",20,"ST"));
		personList.add(new Person("Xhakha",25,"DM"));
		personList.add(new Person("Partey",25,"DM"));
		
		return personList;
	}
}
