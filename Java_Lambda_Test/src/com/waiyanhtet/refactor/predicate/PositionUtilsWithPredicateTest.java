package com.waiyanhtet.refactor.predicate;

import java.util.List;
import java.util.function.Predicate;

import com.waiyanhtet.Player;

public class PositionUtilsWithPredicateTest {

	public static void main(String[] args) {
		List<Player> playerList = Player.createPlayerList();
		
		PositionUtilsWithPredicate positionUtils = new PositionUtilsWithPredicate();
		
		Predicate<Player> allAttacker = player -> player.getPosition() == "ST";
		Predicate<Player> allMidfielder = player -> player.getPosition() == "DM";
		Predicate<Player> allbackPlayer = player -> player.getPosition() == "CB";
		
		System.out.println("Attacker : ");
		positionUtils.attacker(playerList, allAttacker);
		
		System.out.println("\nMidfielder : ");
		positionUtils.midfielder(playerList, allMidfielder);
		
		System.out.println("\nBack Player : ");
		positionUtils.backPlayer(playerList, allbackPlayer);
		
	}
}
