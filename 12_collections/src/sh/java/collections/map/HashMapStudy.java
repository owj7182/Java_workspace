package sh.java.collections.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import sh.java.collections.student.vo.Student;

/**
 * <pre>
 * Map
 * - key, value를 한쌍으로 요소를 관리하는 자료구조
 * - key를 통해 value를 조회하는 구조 (속도가 빠르다)
 * - key는 중복을 허용하지 않는다.
 * - 동일한 key로 새 value를 저장하면, 기존 value가 덮어써진다.
 * 
 * 구현클래스
 * - HashMap
 * - LinkedHashMap 저장된 순서를 유지.
 * - TreeMap key기준으로 기본정렬을 지원.
 * 
 * 
 * 2023-10-06
 *
 */
public class HashMapStudy {

	public static void main(String[] args) {
		HashMapStudy study = new HashMapStudy();
//		study.test1();
//		study.test2();
//		study.test3();
		study.test4();
	}

	/**
	 * 커스텀클래스를 이용해서 데이터를 관리하는 경우
	 * - key 커스텀객체의 식별 필드값
	 * - value 커스텀객체 자체
	 */
	private void test4() {
		Map<Integer,Student> studentMap = new HashMap<>();
		studentMap.put(1, new Student(1, "홍길동"));
		studentMap.put(22, new Student(22, "신사임당"));
		studentMap.put(300, new Student(300, "이순신"));
		
		// 1. keySet
		Set<Integer> keySet = studentMap.keySet();
		for(Integer key : keySet) {
			System.out.println(studentMap.get(key));
		}
		
		// 2. entrySet
		Set<Entry<Integer, Student>> entrySet = studentMap.entrySet();
		for(Entry<Integer, Student> entry : entrySet) {
			System.out.println(entry.getValue());
		}
		
	}

	/**
	 * 맵 순회하기
	 * - 맵은 순차적으로 접근이 불가능하다.
	 * 
	 * 우회적으로 순회하기
	 * 1. HashMap#keySet():Set<K> 키값을 Set으로 반환
	 * 2. HashMap#entrySet():Set<Entry<K,V>> Entry(k=v) 
	 * 
	 */
	private void test3() {
		Map<String, Integer> map = new HashMap<>();
		map.put("honggd", 1000);
		map.put("sinsa", 999);
		map.put("leess", 333);
		map.put("yoogs", 200);
		
		// 1. keySet
//		Set<String> keySet = map.keySet();
//		for(String key : keySet) {
//			Integer value = map.get(key);
//			System.out.println(key + "=" + value);
//		}
		
		// 2. entrySet
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for(Entry<String, Integer> entry : entrySet) {
//			System.out.println(entry);
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + "=" + value);
		}
		
	}

	/**
	 * Map API
	 */
	private void test2() {
		Map<String, Integer> map = new HashMap<>();
		
		// 요소추가 및 수정
		map.put("honggd", 1000);
		map.put("sinsa", 999);
		map.put("leess", 333);
		map.put("yoogs", 200);
		System.out.println(map.put("sinsa", 5000)); // 새 value로 덮어쓴다. 이전 value는 반환처리
		
		// 요소 가져오기
		Integer value = map.get("honggd");
		System.out.println(value);
		
		// 저장된 요소개수
		System.out.println(map.size());
		
		// 요소 삭제
		System.out.println("요소 삭제 : " + map.remove("honggd"));
	
		// key값 포함 여부
		System.out.println(map.containsKey("sinsa")); // true
		System.out.println(map.containsKey("kanggch")); // false
		
		// value값 포함 여부
		System.out.println(map.containsValue(333)); // true
		System.out.println(map.containsValue(8)); // false
		
		// toString
		System.out.println(map);
	}

	/**
	 * HashMap
	 */
	private void test1() {
		// <K,V> 
		HashMap<Integer, String> map1 = new HashMap<>();
		Map<String, int[]> map2 = new HashMap<>();
		
		// 요소추가
		map1.put(100, "신사임당");
		map1.put(1, "홍길동");
//		map1.put(123.456, true);
		map2.put("홍길동", new int[] {100, 90, 70});
		map2.put("신사임당", new int[] {88, 75, 65});
		
		System.out.println(map1);
		
		// 요소조회
		System.out.println(map1.get(1));
		System.out.println(map1.get(100));
		System.out.println(map1.get(999)); // null (요소가 존재하지 않을수도, key에 해당하는 value가 null일수도 있다.)
		
		System.out.println(Arrays.toString(map2.get("홍길동")));
		System.out.println(Arrays.toString(map2.get("신사임당")));
	}

}
