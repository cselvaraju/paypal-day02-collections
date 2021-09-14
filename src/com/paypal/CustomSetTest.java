package com.paypal;

public class CustomSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomSet a = new CustomSet();
		a.add(10);
		a.add(20);
		a.add(30);
		
		CustomSet b = new CustomSet();
		b.add(20);
		b.add(50);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.union(b));
		System.out.println(a.intersection(b));
	}

}
