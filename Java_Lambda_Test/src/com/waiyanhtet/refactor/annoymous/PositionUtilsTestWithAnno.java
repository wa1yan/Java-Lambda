package com.waiyanhtet.refactor.annoymous;

import java.util.List;

import com.waiyanhtet.Person;

public class PositionUtilsTestWithAnno {

	public static void main(String[] args) {
		
		List<Person> playerList = Person.createPersonList();
		
		PositionUtils positionUtils = new PositionUtils();
		
		System.out.println("Attacker : ");
		positionUtils.attacker(playerList, new PositionChoose() {
			
			@Override
			public boolean choose(Person player) {
				return player.getPosition() == "ST";
			}
		});
		
		System.out.println("\nMidfielder : ");
		positionUtils.midfielder(playerList, new PositionChoose() {
			
			@Override
			public boolean choose(Person player) {
				return player.getPosition() == "DM";
			}
		});
		
		System.out.println("\nBack Player : ");
		positionUtils.backPlayer(playerList, new PositionChoose() {
			
			@Override
			public boolean choose(Person player) {
				return player.getPosition() == "CB";
			}
		});
	}
}
