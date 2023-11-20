package com.sh.api.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class CalcYourDays {

	public static void main(String[] args) {
		
		CalcYourDays test = new CalcYourDays();
		test.test1();

	}
	public void test1() {
		Scanner sc = new Scanner(System.in);
		LocalDate now = LocalDate.now();
		System.out.print("태어난 생일을 입력하세요 (Ex : 19980323) : ");
		String str = sc.next();
		LocalDate dday = LocalDate.parse(str, DateTimeFormatter.BASIC_ISO_DATE);
		
		
		long diff = Math.abs(ChronoUnit.DAYS.between(now, dday));
		System.out.printf("입력하신 날짜는 %s년 %s월 %s일이고, 태어난지 %s일 되었습니다.",
							dday.getYear(),
							dday.getMonthValue(),
							dday.getDayOfMonth(),
							diff);
		
		
	}

}
