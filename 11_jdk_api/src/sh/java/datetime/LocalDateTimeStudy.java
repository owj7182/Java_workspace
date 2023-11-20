package sh.java.datetime;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

/**
 * <pre>
 * java.util.Date 국제화
 * java.util.Calendar 
 * 
 * jdk8 - java.time패키지
 * - LocalDate
 * - LocalTime
 * - LocalDateTime
 * - Instant (unix timestamp값을 가진 객체)
 * - ZonedDateTime
 * ...
 * 
 * 
 * 2023-10-05
 *
 */
public class LocalDateTimeStudy {

	public static void main(String[] args) {
		LocalDateTimeStudy study = new LocalDateTimeStudy();
//		study.test1();
//		study.test2();
//		study.test3();
//		study.test4();
//		study.test5();
		study.test6();
	}
	
	

	/**
	 * 사용자로부터 d-day를 입력받고, 몇일 남았는지 출력하세요
	 * - 날짜형식은 "20231225"와 같이 입력받고, 이를 LocalDate로 변환후 처리
	 * - 출력예시 : 입력하신 날짜는 2023년12월25일이고, 오늘은 D-100일 입니다.
	 */
	private void test6() {
		Scanner sc = new Scanner(System.in);
		// 1. 날짜 입력 받기
		System.out.print("D-Day입력 (예: 19990909) : ");
		String str = sc.next();
		// 2. LocalDate로 변환하기
		LocalDate dday = LocalDate.parse(str, DateTimeFormatter.BASIC_ISO_DATE);
//		System.out.println(dday);
		// 3. 오늘 날짜 객체 만들어 비교하기 - ChronoUnit.DAYS.between(start, end)
		LocalDate now = LocalDate.now();
		long diff = ChronoUnit.DAYS.between(now, dday); 
//		System.out.println(diff);
		// 4. 결과 출력
		System.out.printf("입력하신 날짜는 %s년%s월%s일이고, 오늘은 D-%d일 입니다.",
							dday.getYear(),
							dday.getMonthValue(),
							dday.getDayOfMonth(),
							diff);
	}


	/**
	 *  Unix Timestamp (POSIX time, Epoch time)
	 *  - 1970년 1월 1일 00:00 UTC 기준으로 누적된 milli초를 의미
	 *  
	 *  - long -> 날짜/시간객체
	 *  
	 */
	private void test5() {
		System.out.println(System.currentTimeMillis());
		// Unix Timestamp -> java.util.Date
		Date now = new Date(System.currentTimeMillis());
		System.out.println(now);
		// java.util.Date -> Unix Timestamp 
		long millis = now.getTime();
		System.out.println(millis);
		
		// Unix Timestamp -> LocalDateTime
		System.out.println(ZoneId.systemDefault()); // Asia/Seoul
		LocalDateTime now2 = Instant.ofEpochMilli(System.currentTimeMillis())
								.atZone(ZoneId.systemDefault())
								.toLocalDateTime();
		System.out.println(now2);
		
		// LocalDateTime -> Unix Timestamp
		System.out.println(now2.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
		
	}


	/**
	 * 형식변환
	 * 1. 날짜/시간 -> 문자열
	 * 2. 문자열 -> 날짜/시간
	 */
	private void test4() {
		// 1. 날짜/시간 -> 문자열
		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE));
		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy년 M월 d일 HH:mm:ss")));
		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")));
		
		// 2. 문자열 -> 날짜/시간
		String data = "2023/10/05 10:40:07";
		LocalDateTime when = LocalDateTime.parse(data, DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
		System.out.println(when);
	}


	/**
	 * <pre>
	 * 날짜 차이 구하기
	 * 1. ChronoUnit.DAYS.between(start, end):long
	 * 2. LocalDate#until(end):Period
	 */
	private void test3() {
		LocalDate start = LocalDate.now();
		LocalDate dday = LocalDate.of(2024, 2, 26); 
		
		// 1. ChronoUnit
		long diff = ChronoUnit.DAYS.between(start, dday);
		System.out.println(diff);
		
		// 2. Period
		Period period = start.until(dday);
		System.out.println(period);
		System.out.printf("%d년%d개월%d일 남았습니다.\n", 
							period.getYears(),
							period.getMonths(),
							period.getDays());
	}

	/**
	 * 특정날짜/시간
	 */
	private void test2() {
		LocalDate xmas = LocalDate.of(2023, 12, 25);
		LocalTime when = LocalTime.of(12, 50);
		LocalDateTime when2 = LocalDateTime.of(2024, 1, 1, 0, 0);
		
		System.out.println(xmas);
		System.out.println(when);
		System.out.println(when2);
	}

	/**
	 * 지역대정보가 제외된 날짜/시간
	 * - LocalDate
	 * - LocalTime
	 * - LocalDateTime
	 */
	private void test1() {
		// 현재 정보
		LocalDate now = LocalDate.now();
		System.out.println(now); // 2023-10-05
		LocalTime now2 = LocalTime.now();
		System.out.println(now2); // 10:11:12.679764300
		LocalDateTime now3 = LocalDateTime.now();
		System.out.println(now3); // 2023-10-05T10:12:46.758994200
		
		// 각 항목 정보 추출
		int year = now.getYear();
		Month month = now.getMonth(); // enum
		int _month = month.getValue();
		int day = now.getDayOfMonth();
		
		DayOfWeek dayOfWeek = now.getDayOfWeek(); // enum
		int _dayOfWeek = dayOfWeek.getValue(); // 월(1) ~ 일(7)
		char[] daysOfWeek = {'월', '화', '수', '목', '금', '토', '일'};
		System.out.printf("%s-%s-%s(%s)\n", year, _month, day, daysOfWeek[_dayOfWeek - 1]);
		
		int hour = now2.getHour();
		int min = now2.getMinute();
		int sec = now2.getSecond();
		System.out.printf("%s:%s:%s\n", hour, min, sec);
	}

}
