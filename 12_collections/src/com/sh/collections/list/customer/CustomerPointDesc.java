package com.sh.collections.list.customer;

import java.util.Comparator;

public class CustomerPointDesc implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		double diff = o2.getPoint() - o1.getPoint();
		if(diff > 0)
			return 1;
		else if (diff < 0)
			return -1;
		else
			return 0;
	}

}
