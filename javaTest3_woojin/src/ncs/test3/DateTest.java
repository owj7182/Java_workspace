package ncs.test3;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class DateTest {

	public static void main(String[] args) {
		// 현재
		LocalDate now = LocalDate.now();
		// 년도
		int year = 1987;
		Month month = Month.MAY;
		int day = 27;
		
		LocalDate birthday = LocalDate.of(year, month, day);
		
		// 계산
		Period ageP = Period.between(birthday, now);
		int age = ageP.getYears();
		
		// DateTimeFormatter 사용
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 M월 d일 EEEE", Locale.KOREAN);
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy년 M월 d일", Locale.KOREAN);
		
		System.out.println("생일 : " + birthday.format(dtf));
		System.out.println("현재 : " + now.format(dtf1));
		System.out.println("나이 : " + age + "세");

	}

}
