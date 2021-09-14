package com.paypal;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> myMap = new HashMap<Integer, String>();
		
		myMap.put(1, "One");
		myMap.put(4, "Four");
		myMap.put(2, "Two");
		myMap.put(3, "Three");
		
		System.out.println(myMap);
		
		myMap.put(0, "Zero");
		
		System.out.println(myMap);
		
		Set<Integer> keys = myMap.keySet();
		
		System.out.println(keys);
		
		Collection<String> values = myMap.values();
		
		System.out.println(values);
		
		System.out.println(myMap.getOrDefault(100, "Not Found"));
		
		for(Entry<Integer, String> item : myMap.entrySet()) {
			System.out.println("Key: " + item.getKey() + " Value: " + item.getValue());
		}
		
		Map<String, String> map2 = new LinkedHashMap<String, String>();
		map2.put("one", "first");
		map2.put("two", "second");
		map2.put("three", "third");
		map2.put("four", "Fourth");
		
		System.out.println("Linked Hashmap map2");
		System.out.println(map2);
		
		Map<String, String> map3 = new HashMap<String, String>();
		map3.put("one", "first");
		map3.put("two", "second");
		map3.put("three", "third");
		map3.put("four", "Fourth");
		
		System.out.println("Linked Hashmap map3");
		System.out.println(map3);
		

	}

}
