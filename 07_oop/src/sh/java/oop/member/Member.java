package sh.java.oop.member;

import java.time.LocalDate;

/**
 * <pre>
 * 추상화
 * - 사물의 공통된, 보편화된 특징을 추출, 불필요한 내용을 제외하는 행위
 * - 필요한 정보를 담을수 있게 클래스의 상태를 작성
 * 
 * 2023-09-21
 *
 */
public class Member {
	String name;
	char gender;
	String ssn; // 0009091234567
	String address;
	String phone; // 01012341234
//	Date birthday;
	LocalDate birthday;
}
