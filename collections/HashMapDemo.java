package io.github.sindahera.collections;

import java.util.HashMap;
import java.util.Map;
 
public class HashMapDemo {

	public static void main(String[] args) {
		 
		 Map<String,Integer> map = new HashMap<>();
		
		map.put("a", 10);
		map.put("b", 20);
		map.put("c", 30);
		
		System.out.println("size of a map is:- " + map.size());
		System.out.println(map);
		
		if (map.containsKey("a")) {
			Integer a = map.get("a");
			System.out.println("value for key" + "\"a\" is ;- " + a);
		}

	}

}
