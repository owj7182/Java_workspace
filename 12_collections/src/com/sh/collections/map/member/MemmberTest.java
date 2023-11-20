package com.sh.collections.map.member;

import java.util.*;

public class MemmberTest {
	Map<String,Memmber> memmberMap = new HashMap<>();
	public static void main(String[] args) {
		MemmberTest test = new MemmberTest();
//		test.test1();
//		test.test2();
//		test.test3();
		test.test4();
	}
	
	public void test4() {
		memmberMap.put("honggd", new Memmber("honggd","1234","홍길동",35,"01012341234"));
		memmberMap.put("sinsa", new Memmber("sinsa","1234","신사임당",50,"01012341234"));
		memmberMap.put("leess", new Memmber("leess","1234","이순신",43,"01012341234"));
		memmberMap.put("yooon", new Memmber("yooon","1234","윤봉길",37,"01012341234"));
		memmberMap.put("jangbg", new Memmber("jangbg","1234","장보고",29,"01012341234"));
		
		System.out.println("=====================================");
		System.out.print("아이디\t비밀번호\t이름\t나이\t전화번호\n");
		System.out.println("=====================================");
		System.out.println(memmberMap.get("honggd"));
		System.out.println(memmberMap.get("sinsa"));
		System.out.println(memmberMap.get("leess"));
		System.out.println(memmberMap.get("yooon"));
		System.out.println(memmberMap.get("jangbg"));
		
		memmberMap.put("yooon", new Memmber("yooon", "5678", "윤동주", 27, "01034563456"));
		System.out.println(memmberMap.get("yooon"));
		
		System.out.println("요소삭제 : " + memmberMap.remove("sinsa"));
		System.out.println(memmberMap.get("sinsa"));
		
	}
	public void test3() {
		memmberMap.put("honggd", new Memmber("honggd","1234","홍길동",35,"01012341234"));
		memmberMap.put("sinsa", new Memmber("sinsa","1234","신사임당",50,"01012341234"));
		memmberMap.put("leess", new Memmber("leess","1234","이순신",43,"01012341234"));
		memmberMap.put("yooon", new Memmber("yooon","1234","윤봉길",37,"01012341234"));
		memmberMap.put("jangbg", new Memmber("jangbg","1234","장보고",29,"01012341234"));
		
		System.out.println("=====================================");
		System.out.print("아이디\t비밀번호\t이름\t나이\t전화번호\n");
		System.out.println("=====================================");
//		System.out.println(memmberMap.get("honggd"));
//		System.out.println(memmberMap.get("sinsa"));
//		System.out.println(memmberMap.get("leess"));
		System.out.println(memmberMap.get("yooon"));
//		System.out.println(memmberMap.get("jangbg"));
		
		memmberMap.put("yooon", new Memmber("yooon", "5678", "윤동주", 27, "01034563456"));
		System.out.println(memmberMap.get("yooon"));
	}
	public void test2() {
		
		memmberMap.put("honggd", new Memmber("honggd","1234","홍길동",35,"01012341234"));
		memmberMap.put("sinsa", new Memmber("sinsa","1234","신사임당",50,"01012341234"));
		memmberMap.put("leess", new Memmber("leess","1234","이순신",43,"01012341234"));
		memmberMap.put("yooon", new Memmber("yooon","1234","윤봉길",37,"01012341234"));
		memmberMap.put("jangbg", new Memmber("jangbg","1234","장보고",29,"01012341234"));
		
		System.out.println("=====================================");
		System.out.print("아이디\t비밀번호\t이름\t나이\t전화번호\n");
		System.out.println("=====================================");
		System.out.println(memmberMap.get("honggd"));
		System.out.println(memmberMap.get("sinsa"));
		System.out.println(memmberMap.get("leess"));
		System.out.println(memmberMap.get("yooon"));
		System.out.println(memmberMap.get("jangbg"));
		
		System.out.println(isUserExist("jangbg"));
		System.out.println(isUserExist("sejong"));
		
	}
	
	public void test1() {
		
		memmberMap.put("1", new Memmber("honggd","1234","홍길동",35,"01012341234"));
		memmberMap.put("2", new Memmber("sinsa","1234","신사임당",50,"01012341234"));
		memmberMap.put("3", new Memmber("leess","1234","이순신",43,"01012341234"));
		memmberMap.put("4", new Memmber("yooon","1234","윤봉길",37,"01012341234"));
		memmberMap.put("5", new Memmber("jangbg","1234","장보고",29,"01012341234"));
		
		System.out.println("=====================================");
		System.out.print("아이디\t비밀번호\t이름\t나이\t전화번호\n");
		System.out.println("=====================================");
		System.out.println(memmberMap.get("1"));
		System.out.println(memmberMap.get("2"));
		System.out.println(memmberMap.get("3"));
		System.out.println(memmberMap.get("4"));
		System.out.println(memmberMap.get("5"));
		
		
	}
	
	private boolean isUserExist(String userId) {
		if(memmberMap.containsKey(userId))
			return true;
		else
			return false;
	}
}
