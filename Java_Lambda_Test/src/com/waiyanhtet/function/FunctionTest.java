package com.waiyanhtet.function;

import java.util.function.Function;

import com.waiyanhtet.Player;

public class FunctionTest {

	public static void main(String[] args) {
		var playerlist = Player.createPlayerList();
		
		Function<Player, String> printdata = p -> {
			return "Name : %s \nAge :  %d \nPosition :  %s\n".formatted(p.getName(),p.getAge(),p.getPosition());
		};
		
		for (Player player : playerlist) {
			System.out.println(player.customPrint(printdata));
		}

	}
}
