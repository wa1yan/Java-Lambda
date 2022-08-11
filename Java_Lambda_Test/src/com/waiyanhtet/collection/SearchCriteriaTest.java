package com.waiyanhtet.collection;

import java.util.List;

import com.waiyanhtet.Player;

public class SearchCriteriaTest {

	public static void main(String[] args) {
		List<Player> playerList = Player.createPlayerList();
		
		//forEach
		System.out.println("ForEach : ");
		playerList.forEach(player -> player.printName());
		System.out.println("");
		playerList.forEach(Player::printName);
		System.out.println("");
		playerList.forEach(player -> {
			System.out.println(player.customPrint(p -> "I am " + p.getName()));
			});
		
		
		
		
	}
}
