package com.paypal;

import java.util.ArrayList;
import java.util.Iterator;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Collections
		// 1. ArrayList (workhorse of MOST applications)
		// 2. LinkedList
		// 3. Map
		// 4. Vector
		// 5. Set
		
		// java.util package contains the implementation of 
		// collection classes
		// Generics
		
//		ArrayList aList = new ArrayList();
//		aList.add(123);
//		aList.add("Hello World");
//		aList.add(false);
//		
//		System.out.println(aList);
//		System.out.println("List size: " + aList.size());

		ArrayList<Integer> iList = new ArrayList<Integer>(5);
		iList.add(10);
		iList.add(15);
		iList.add(30);
		iList.add(45);
		iList.add(50);
		iList.add(65);
		
//		iList.add("hello");
		
		
		System.out.println(iList);
		System.out.println(iList.size());
		
		// Iterate through the arraylist
		
		// Traditional for loop
		
		System.out.println("--- Using for loop ---");
		int i;
		for(i = 0; i < iList.size(); ++i) {
			System.out.println("Index: " + i + " Value: " + iList.get(i));
		}
		
		// Using the Iterator interface
		
		System.out.println("--- Using Iterator ---");
		Iterator<Integer> it = iList.iterator();
		while (it.hasNext()) {
			System.out.println("Value: " + it.next());
		}
		
		// Using foreach loop
		
		System.out.println("--- Using foreach loop ---");
//		int item;
		for(int item : iList) {
			System.out.println("Value: " + item);
		}
		
		ArrayList<Object> objList = new ArrayList<Object>();
		objList.add(123);
		objList.add("Welcome");
		objList.add(true);
		
		System.out.println(objList);
		
	}

}
