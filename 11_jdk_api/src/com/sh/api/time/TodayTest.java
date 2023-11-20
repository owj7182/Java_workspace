package com.sh.api.time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class TodayTest {
	
	public static void main(String[] args) {
		TodayTest test = new TodayTest();
		test.test1();
	}
	
	public void test1() {
		LocalDate date = LocalDate.of(2019, 8, 5);
		
		int year = date.getYear();
		Month month = date.getMonth();
		int _month = month.getValue();
		int day = date.getDayOfMonth();
		
		DayOfWeek dayOfWeek = date.getDayOfWeek();
		int _dayOfWeek = dayOfWeek.getValue();
		char[] daysOfWeek = {'월', '화', '수', '목', '금', '토', '일'};
		System.out.printf("오늘은 %d년 %d월 %d일 %s요일입니다", year, _month, day, daysOfWeek[_dayOfWeek + 2]);
		
		
		
	}

}
