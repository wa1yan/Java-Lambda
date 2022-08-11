package com.waiyanhtet.refactor;

import java.util.List;

import com.waiyanhtet.Person;

public class PositionUtilsAferRefactor {

	void attacker(List<Person> playerList) {
		for (Person player : playerList) {
			if (isAttacker(player)) {
				attackerJob(player);
			}
		}
	}

	void midfielder(List<Person> playerList) {
		for (Person player : playerList) {
			if (isMidfielder(player)) {
				midfielderJob(player);
			}
		}
	}

	void backPlayer(List<Person> playerList) {
		for (Person player : playerList) {
			if (isBack(player)) {
				backerJob(player);
			}
		}
	}

	public boolean isAttacker(Person player) {
		if (player.getPosition() == "ST") {
			return true;
		}
		return false;
	}

	public boolean isMidfielder(Person player) {
		if (player.getPosition() == "DM") {
			return true;
		}
		return false;
	}

	public boolean isBack(Person player) {
		if (player.getPosition() == "CB") {
			return true;
		}
		return false;
	}

	private void attackerJob(Person player) {
		System.out.println("I am a quite fast player and can shot to get goal.");
	}

	private void backerJob(Person player) {
		System.out.println("I am strong and fast so I can play at back.");
	}

	private void midfielderJob(Person player) {
		System.out.println("I am strong, fast and support to get a goal so I can play at middle.");
	}
}
