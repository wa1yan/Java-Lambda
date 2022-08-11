package com.waiyanhtet.refactor;

import java.util.List;

import com.waiyanhtet.Player;

public class PositionUtilsAferRefactor {

	void attacker(List<Player> playerList) {
		for (Player player : playerList) {
			if (isAttacker(player)) {
				attackerJob(player);
			}
		}
	}

	void midfielder(List<Player> playerList) {
		for (Player player : playerList) {
			if (isMidfielder(player)) {
				midfielderJob(player);
			}
		}
	}

	void backPlayer(List<Player> playerList) {
		for (Player player : playerList) {
			if (isBack(player)) {
				backerJob(player);
			}
		}
	}

	public boolean isAttacker(Player player) {
		if (player.getPosition() == "ST") {
			return true;
		}
		return false;
	}

	public boolean isMidfielder(Player player) {
		if (player.getPosition() == "DM") {
			return true;
		}
		return false;
	}

	public boolean isBack(Player player) {
		if (player.getPosition() == "CB") {
			return true;
		}
		return false;
	}

	private void attackerJob(Player player) {
		System.out.println("I am a quite fast player and can shot to get goal.");
	}

	private void backerJob(Player player) {
		System.out.println("I am strong and fast so I can play at back.");
	}

	private void midfielderJob(Player player) {
		System.out.println("I am strong, fast and support to get a goal so I can play at middle.");
	}
}
