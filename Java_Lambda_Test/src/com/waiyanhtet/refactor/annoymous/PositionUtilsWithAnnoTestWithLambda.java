package com.waiyanhtet.refactor.annoymous;

import java.util.List;

import com.waiyanhtet.Player;

public class PositionUtilsWithAnnoTestWithLambda {

	public static void main(String[] args) {
		List<Player> playerList = Player.createPlayerList();
		
		PositionUtils positionUtils = new PositionUtils();
		
		System.out.println("Attacker : ");
		positionUtils.attacker(playerList, player -> {return player.getPosition() == "ST";});
		
		System.out.println("\nMidfielder : ");
		positionUtils.midfielder(playerList, player -> {return player.getPosition() == "DM";});
		
		System.out.println("\nBack Player : ");
		positionUtils.backPlayer(playerList, player -> {return player.getPosition() == "CB";});
	}
}
