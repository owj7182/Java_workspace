package com.sh.collections.set.cart;

import java.util.Comparator;

public class CartComparator implements Comparator<Cart>{

	@Override
	public int compare(Cart o1, Cart o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
