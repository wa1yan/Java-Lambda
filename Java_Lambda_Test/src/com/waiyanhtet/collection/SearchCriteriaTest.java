package com.waiyanhtet.collection;

import java.util.List;

import com.waiyanhtet.Person;

public class SearchCriteriaTest {

	public static void main(String[] args) {
		List<Person> playerList = Person.createPersonList();
		
		//forEach
		System.out.println("ForEach : ");
		playerList.forEach(player -> player.printName());
		System.out.println("");
		playerList.forEach(Person::printName);
		System.out.println("");
		playerList.forEach(player -> {
			System.out.println(player.customPrint(p -> "I am " + p.getName()));
			});
		
		
		
		
	}
}
