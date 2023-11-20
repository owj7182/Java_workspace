package sh.java.io._byte;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import sh.java.io.user.User;

/**
 * <pre>
 * 객체 단위로 읽고, 쓰기를 지원하는 스트림
 * - ObjectInputStream
 * - ObjectOutPutStream
 * 
 * - 읽기/쓰기 작업할 클래스는 반드시 Serializable인터페이스를 구현해야한다.
 * - Serializable은 추상메소드가 없는 마커인터페이스다.
 * 
 * @author sisna
 *
 */

public class ObjectIOStudy {

	public static void main(String[] args) {
		ObjectIOStudy study = new ObjectIOStudy();
//		study.test1();
//		study.test2();
		study.test3();
	}
	/**
	 * ObjectInputStream - BufferedInputStream - FileInputStream
	 */
	private void test3() {
		try(
			ObjectInputStream ois =
				new ObjectInputStream(
						new BufferedInputStream(
								new FileInputStream("users.ser")));
			
		){
			List<User> users = (List<User>) ois.readObject();
			System.out.println(users);
		} catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
		
		}
	}
	
	/**
	 * - 객체 List에 담아 입출력하기
	 */
	private void test2() {
		List<User> users = new ArrayList<>();
		users.add(new User("honggd", "1234", LocalDateTime.of(2023, 10, 10, 10, 10)));
		users.add(new User("sinsa", "1234", LocalDateTime.of(2023, 10, 9, 9, 9)));
		users.add(new User("leess", "1234", LocalDateTime.of(2023, 10, 8, 8, 8)));
		
		// ObjectOutPutStream - BufferedOutputStream - FileOutputStream
		try(
			ObjectOutputStream oos = 
				new ObjectOutputStream(
						new BufferedOutputStream(
								new FileOutputStream("users.ser")));
				
		){
			oos.writeObject(users);
			System.out.println("저장완료!");
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * - 객체 하나 쓰기 읽기
	 */
	private void test1() {
		try(
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.ser"));
		){
			oos.writeObject(new User("honggd", "1234", LocalDateTime.now()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.ser"))){
			User user = (User) ois.readObject();
			System.out.println(user);
		} catch (IOException | ClassNotFoundException e) {
			// 멀티 catch절 - 부모 자식 클래스간에는 사용할 수 없다.
			e.printStackTrace();
		
		}
	}
}
