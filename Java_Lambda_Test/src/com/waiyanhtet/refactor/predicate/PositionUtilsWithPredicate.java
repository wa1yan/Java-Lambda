package com.waiyanhtet.refactor.predicate;

import java.util.List;
import java.util.function.Predicate;

import com.waiyanhtet.Player;

public class PositionUtilsWithPredicate {
	void attacker(List<Player> playerList, Predicate<Player> predicate) {
		for (Player player : playerList) {
			if (predicate.test(player)) {
				attackerJob(player);
			}
		}
	}

	void midfielder(List<Player> playerList, Predicate<Player> predicate) {
		for (Player player : playerList) {
			if (predicate.test(player)) {
				midfielderJob(player);
			}
		}
	}

	void backPlayer(List<Player> playerList, Predicate<Player> predicate) {
		for (Player player : playerList) {
			if (predicate.test(player)) {
				backerJob(player);
			}
		}
	}

	private void attackerJob(Player player) {
		System.out.println(player.getName() + "! I am a quite fast player and can shot to get goal.");
	}

	private void backerJob(Player player) {
		System.out.println(player.getName() + "! I am strong and fast so I can play at back.");
	}

	private void midfielderJob(Player player) {
		System.out.println(player.getName() + "! I am strong, fast and support to get a goal so I can play at middle.");
	}
}
