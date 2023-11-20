package com.sh.api.time;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class CalcDday {

	public static void main(String[] args) {
		CalcDday test = new CalcDday();
		test.test1();

	}
	public void test1() {
		LocalDate start = LocalDate.now();
		LocalDate dday1 = LocalDate.of(2024, 4, 18);
		LocalDate dday2 = LocalDate.of(2023, 10, 8);
		LocalDate dday3 = LocalDate.of(2023, 9, 18);
		
		long diff1 = ChronoUnit.DAYS.between(start, dday1);
		System.out.printf("%d일 남았습니다.\n",diff1);
		long diff2 = ChronoUnit.DAYS.between(start, dday2);
		System.out.printf("%d일 남았습니다.\n",diff2);
		long diff3 = Math.abs(ChronoUnit.DAYS.between(start, dday3));
		System.out.printf("%d일 지났습니다.\n",diff3);
	}

}
