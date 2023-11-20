package sh.java.collections.list;

import java.util.LinkedList;
import java.util.List;

/**
 * <pre>
 * LinkedList
 * - 내부의 배열을 관리하지 않고, 요소와 요소를 연결해서 관리
 * - 중간에 요소추가/삭제가 빈번한 데이터에 사용하면 좋다.
 * - 조회/검색이 빈번하다면 ArrayList가 더 효율적이다.
 * 
 * 
 * 2023-10-06
 *
 */
public class LinkedListStudy {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("홍길동");
		list.add("신사임당");
		list.add("이순신");
	}

}
