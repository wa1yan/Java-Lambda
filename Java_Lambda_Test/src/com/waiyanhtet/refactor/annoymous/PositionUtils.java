package com.waiyanhtet.refactor.annoymous;

import java.util.List;

import com.waiyanhtet.Person;

public class PositionUtils {

	void attacker(List<Person> playerList, PositionChoose position) {
		for (Person player : playerList) {
			if (position.choose(player)) {
				attackerJob(player);
			}
		}
	}

	void midfielder(List<Person> playerList, PositionChoose position) {
		for (Person player : playerList) {
			if (position.choose(player)) {
				midfielderJob(player);
			}
		}
	}

	void backPlayer(List<Person> playerList, PositionChoose position) {
		for (Person player : playerList) {
			if (position.choose(player)) {
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
