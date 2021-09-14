package com.paypal;

import java.util.HashSet;

public interface SetOperations {
	HashSet<Integer> union(HashSet<Integer> other);
	HashSet<Integer> intersection(HashSet<Integer> other);
}
