package com.waiyanhtet.refactor.annoymous;

import java.util.List;

import com.waiyanhtet.Player;

public class PositionUtils {

	void attacker(List<Player> playerList, PositionChoose position) {
		for (Player player : playerList) {
			if (position.choose(player)) {
				attackerJob(player);
			}
		}
	}

	void midfielder(List<Player> playerList, PositionChoose position) {
		for (Player player : playerList) {
			if (position.choose(player)) {
				midfielderJob(player);
			}
		}
	}

	void backPlayer(List<Player> playerList, PositionChoose position) {
		for (Player player : playerList) {
			if (position.choose(player)) {
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
