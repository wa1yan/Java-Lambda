package com.waiyanhtet.refactor.predicate;

import java.util.List;
import java.util.function.Predicate;

import com.waiyanhtet.Person;

public class PositionUtilsWithPredicate {
	void attacker(List<Person> playerList, Predicate<Person> predicate) {
		for (Person player : playerList) {
			if (predicate.test(player)) {
				attackerJob(player);
			}
		}
	}

	void midfielder(List<Person> playerList, Predicate<Person> predicate) {
		for (Person player : playerList) {
			if (predicate.test(player)) {
				midfielderJob(player);
			}
		}
	}

	void backPlayer(List<Person> playerList, Predicate<Person> predicate) {
		for (Person player : playerList) {
			if (predicate.test(player)) {
				backerJob(player);
			}
		}
	}

	private void attackerJob(Person player) {
		System.out.println(player.getName() + "! I am a quite fast player and can shot to get goal.");
	}

	private void backerJob(Person player) {
		System.out.println(player.getName() + "! I am strong and fast so I can play at back.");
	}

	private void midfielderJob(Person player) {
		System.out.println(player.getName() + "! I am strong, fast and support to get a goal so I can play at middle.");
	}
}
