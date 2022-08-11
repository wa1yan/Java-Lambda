package com.waiyanhtet.collection;

import java.util.List;

import com.waiyanhtet.Person;
import com.waiyanhtet.SearchCriteria;

public class PlayerAgeAverageTest {

	public static void main(String[] args) {
		List<Person> playerList = Person.createPersonList();
		SearchCriteria search = SearchCriteria.getInstance();

		int totalAge = 0;
		int count = 0;
		for (Person player : playerList) {
			if (isAttacker(player)) {
				totalAge += player.getAge();
				++count;
			}
		}		
		System.out.println("Total age of player : " + totalAge);
		System.out.println("Average age of player : " + totalAge / count);

		System.out.println("\nStream : ");
		int totalAgeOfPlayer = playerList.stream().filter(search.getCriteria("allAttacker"))
				.mapToInt(player -> player.getAge()).sum();
		
		Long countOfPlayer = playerList.stream().filter(search.getCriteria("allAttacker"))
				.mapToInt(player -> player.getAge()).count();

		Double averageAgeOfPlayer = playerList.stream().filter(search.getCriteria("allAttacker"))
				.mapToDouble(player -> player.getAge()).average().orElse(0.0);

		System.out.println("Total age of player : " + totalAgeOfPlayer);
		System.out.println("Count of player : " + countOfPlayer.intValue());
		System.out.println("Average age of player : " + averageAgeOfPlayer);

	}

	public static boolean isAttacker(Person player) {
		if (player.getPosition() == "ST") {
			return true;
		}
		return false;
	}

	public static boolean isMidfielder(Person player) {
		if (player.getPosition() == "DM") {
			return true;
		}
		return false;
	}

	public static boolean isBack(Person player) {
		if (player.getPosition() == "CB") {
			return true;
		}
		return false;
	}
}
