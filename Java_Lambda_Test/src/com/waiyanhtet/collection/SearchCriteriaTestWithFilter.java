package com.waiyanhtet.collection;

import java.util.List;
import java.util.stream.Collectors;

import com.waiyanhtet.Person;
import com.waiyanhtet.SearchCriteria;

public class SearchCriteriaTestWithFilter {

	public static void main(String[] args) {
		List<Person> playerList = Person.createPersonList();
		// filter
		System.out.println("\nFilter : ");
		SearchCriteria search = SearchCriteria.getInstance();
		playerList.stream().filter(search.getCriteria("allAttacker")).forEach(player -> player.printName());
		System.out.println("");
		playerList.stream().filter(search.getCriteria("allAttacker")).forEach(Person::printName);

		// collect after filter
		System.out.println("\nBack Players : ");
		List<Person> backplayers = playerList.stream().filter(search.getCriteria("allBackPlayer"))
				.collect(Collectors.toList());
		backplayers.forEach(p -> System.out.println(p.getName()));
	}
}
