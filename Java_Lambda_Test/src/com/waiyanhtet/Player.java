package com.waiyanhtet;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Player {

	private String name;
	private int age;
	private String position;

	public Player(String name, int age, String position) {
		this.name = name;
		this.age = age;
		this.position = position;
	}

	public String getPosition() {
		return position;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void printName() {
		System.out.println(name);
	}
	
	public String customPrint(Function<Player, String> f) {
		return f.apply(this);
	}
	
	public static List<Player> createPlayerList() {
		var personList = new ArrayList<Player>();
		personList.add(new Player("White",23,"CB"));
		personList.add(new Player("Jesus",25,"ST"));
		personList.add(new Player("Saka",20,"ST"));
		personList.add(new Player("Saliba",20,"CB"));
		personList.add(new Player("Martenalli",20,"ST"));
		personList.add(new Player("Xhakha",25,"DM"));
		personList.add(new Player("Partey",25,"DM"));
		
		return personList;
	}
}
