package com.paypal;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s = new HashSet<Integer>();
		
		s.add(5);
		s.add(2);
		s.add(9);
		
		System.out.println(s);
		
		s.add(22);
		s.add(5);
		
		System.out.println(s);
		
		Iterator<Integer> it = s.iterator();
		while (it.hasNext()) {
			System.out.println("Value: " + it.next());
		}
		
		Set<Integer> s2 = new LinkedHashSet<Integer>();
		s2.add(5);
		s2.add(2);
		s2.add(9);
		
		System.out.println(s2);
		
		s2.add(22);
		s2.add(5);
		
		System.out.println(s2);
		
		Iterator<Integer> it2 = s2.iterator();
		while (it2.hasNext()) {
			System.out.println("Value: " + it2.next());
		}
		
		Object[] arr = s.toArray();
		System.out.println(arr);
		
		for(Object item: arr) {
			System.out.println(item);
		}
		
	}

}
