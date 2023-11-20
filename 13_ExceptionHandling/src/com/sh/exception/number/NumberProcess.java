package com.sh.exception.number;

import java.util.*;

public class NumberProcess {
	
	
	public NumberProcess() {
		super();
	}
	
	public boolean checkDouble(int a, int b) {
		
		boolean check = true;
		
		if (a < 1 || a > 100 || b < 1 || b > 100) 
			throw new NumberRangeException("1부터 100사이의 값이 아닙니다.");
		
		if (a % b == 0)
			check = true;
		else
			check = false;
		
		return check;
		
			
		

		
		
		
		
		
		
	}
}
