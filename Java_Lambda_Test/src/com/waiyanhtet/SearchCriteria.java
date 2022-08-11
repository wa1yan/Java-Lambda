package com.waiyanhtet;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class SearchCriteria {

	private final Map<String, Predicate<Player>> searchMap = new HashMap<>();
	
	private SearchCriteria() {
		initSeachMap();
	}
	
	private void initSeachMap(){
		searchMap.put("allAttacker", p -> p.getPosition() == "ST");
		searchMap.put("allMidefielder", p -> p.getPosition() == "DM");
		searchMap.put("allBackPlayer", p -> p.getPosition() == "CB");
	}
	
	public Predicate<Player> getCriteria(String predicateName){
		
		Predicate<Player> target = searchMap.get(predicateName);
		if(target == null ) {
			System.out.println("Search creteria not found");
			System.exit(1);
		}
		return target;
	}
	
	public static SearchCriteria getInstance() {
		return new SearchCriteria();
	}
}
