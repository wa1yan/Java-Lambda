package com.waiyanhtet.refactor.predicate;

import java.util.List;
import java.util.function.Predicate;

import com.waiyanhtet.Person;

public class PositionUtilsWithPredicateTest {

	public static void main(String[] args) {
		List<Person> playerList = Person.createPersonList();
		
		PositionUtilsWithPredicate positionUtils = new PositionUtilsWithPredicate();
		
		Predicate<Person> allAttacker = player -> player.getPosition() == "ST";
		Predicate<Person> allMidfielder = player -> player.getPosition() == "DM";
		Predicate<Person> allbackPlayer = player -> player.getPosition() == "CB";
		
		System.out.println("Attacker : ");
		positionUtils.attacker(playerList, allAttacker);
		
		System.out.println("\nMidfielder : ");
		positionUtils.midfielder(playerList, allMidfielder);
		
		System.out.println("\nBack Player : ");
		positionUtils.backPlayer(playerList, allbackPlayer);
		
	}
}
