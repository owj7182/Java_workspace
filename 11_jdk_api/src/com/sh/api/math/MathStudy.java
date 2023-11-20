package com.sh.api.math;

/**
 * 올림 Math.ceiling(double):double
 * 반올림 Math.round(double):long
 * 버림(내림) Math.floor(double):double
 * 
 * 
 */
public class MathStudy {
	
	public static void main(String[] args) {
//		1. 3456.5324     => 올림해서 소수점첫째자리까지 표현
//		2. 577.26784     => 반올림해서 소수점둘째자리까지 표현
//		3. 552.2987      => 올림해서 소수점셋째자리까지 표현
//		4. -845.215      => 내림해서 소수점첫째자리까지 표현
//		5. 324456.24497  => 올림해서 소수점둘째자리까지 표현
		
		System.out.println(Math.ceil(3456.5324 * 10) / 10);
		System.out.println(Math.round(577.26784 * 100) / 100.0);
		System.out.println(Math.ceil(552.2987 * 1000) / 1000);
		System.out.println(Math.floor(-845.215 * 10) / 10); // -845.3
		System.out.println(Math.ceil(324456.24497 * 100) / 100);
		
	}

}
