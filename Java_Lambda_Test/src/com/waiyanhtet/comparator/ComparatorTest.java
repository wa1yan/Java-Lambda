package com.waiyanhtet.comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.waiyanhtet.Player;

public class ComparatorTest {
	
	static void print(List<Player> list) {
		for (Player p : list) {
			p.printName();
		}
	}

	public static void main(String[] args) {
		List<Player> personList = Player.createPlayerList();
		System.out.println("Before sorting : ");
		print(personList);
	
		Collections.sort(personList, new Comparator<Player>() {

			@Override
			public int compare(Player p1, Player p2) {
				return p1.getName().compareTo(p2.getName());
			}
		});
		System.out.println("After sorting : ");
		print(personList);
		
		Collections.sort(personList, (Player p1, Player p2) -> {
			return p2.getName().compareTo(p1.getName());
		});
		System.out.println("After sorting : ");
		print(personList);
	}
}
