package com.paypal;

import java.util.HashSet;
import java.util.Iterator;

public class CustomSet extends HashSet<Integer> implements SetOperations {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public HashSet<Integer> union(HashSet<Integer> other) {
		// TODO Auto-generated method stub
		HashSet<Integer> temp = new HashSet<Integer>(this);
		Iterator<Integer> it = other.iterator();
		while (it.hasNext()) {
			temp.add(it.next());
		}
		return temp;
	}

	@Override
	public HashSet<Integer> intersection(HashSet<Integer> other) {
		// TODO Auto-generated method stub
		HashSet<Integer> temp = new HashSet<Integer>();
		Iterator<Integer> it;
		Integer n;
		
		it = this.iterator();
		while (it.hasNext()) {
			n = it.next();
			if (other.contains(n)) {
				temp.add(n);
			}
		}
		return temp;
	}

}
