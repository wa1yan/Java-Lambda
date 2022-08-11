package com.waiyanhtet.function;

import java.util.function.Function;

import com.waiyanhtet.Person;

public class FunctionTest {

	public static void main(String[] args) {
		var playerlist = Person.createPersonList();
		
		Function<Person, String> printdata = p -> {
			return "Name : %s \nAge :  %d \nPosition :  %s\n".formatted(p.getName(),p.getAge(),p.getPosition());
		};
		
		for (Person player : playerlist) {
			System.out.println(player.customPrint(printdata));
		}

	}
}
