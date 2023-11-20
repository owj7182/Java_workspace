package com.sh.thread.sleep;

import java.util.*;

public class SleepTest {

	public static void main(String[] args) {
		new SleepTest().sendAphorism();
		
		System.out.println("프로그램 종료!!");
	}

	public void sendAphorism() {
		
		
		String data[] = {"범 도 제 말하면 온다.",
					 "다 된 죽에 코 빠뜨린다.",
					 "아닌 밤중에 홍두깨.",
					 "개구리 올챙이 적 생각 못 한다.",
					 "첫술에 배부를까.",
					 "빈대 잡으려고 초가삼간 태운다.",
					 "가던 날이 장날.",
					 "우물 안 개구리.",
					 "쇠뿔은 단김에 빼라.",
					 "닭 소 보듯 소 닭 보듯."
		};
		List<String> temp = Arrays.asList(data);
		List<String> list = new ArrayList<>(temp);
		int len = list.size();
		
		for(int i = 0; i < len; i++) {
			System.out.println(list.remove((int)(Math.random() * list.size())));
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}
}
					
					
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

