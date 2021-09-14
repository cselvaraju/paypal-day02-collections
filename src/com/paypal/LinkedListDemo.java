package com.paypal;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(10);
		list.add(20);
		
		System.out.println(list);
		System.out.println(list.get(1));
		
		list.add(30);
		System.out.println(list);
		
		list.add(1, 15);
		System.out.println(list);
		
		list.removeFirst();
		System.out.println(list);
	}
}
