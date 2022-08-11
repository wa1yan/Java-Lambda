package com.waiyanhtet.refactor;

import java.util.List;

import com.waiyanhtet.Person;

public class PositionUtils {

	void attacker(List<Person> playerList) {
		for (Person player : playerList) {
			if (player.getPosition() == "ST") {
				attackerJob(player);
			}
		}
	}

	void midfielder(List<Person> playerList) {
		for (Person player : playerList) {
			if (player.getPosition() == "DM") {
				backerJob(player);
			}
		}
	}

	void backPlayer(List<Person> playerList) {
		for (Person player : playerList) {
			if (player.getPosition() == "CB") {
				midfielderJob(player);
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
