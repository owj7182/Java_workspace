package sh.java.io.file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * <pre>
 * java.io.File
 * - 실제/가상의 파일/디렉토리를 가리키는 자바객체
 * - 파일생성/삭제/메타정보조회
 * - 디렉토리 생성/삭제 자식파일조회
 * @author sisna
 *
 */
public class FileStudy {

	public static void main(String[] args) {
		FileStudy study = new FileStudy();
//		study.test1();
//		study.test2();
		study.test3();
	}
	
	/**
	 * 사용자 이름을 입력받아서 members하위에 사용자명/사용자명.txt을 생성하세요.
	 * - members/홍길동/홍길동.txt
	 * - members, 사용자명 디렉토리를 동적으로 생성하기
	 */
	private void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 : ");
		String name = sc.next();
		
		File dir = new File("member/" + name);
		if(!dir.exists()) {
			dir.mkdirs();
			System.out.println(dir + "디렉토리를 생성했습니다.");
		}
		File newFile = new File(dir, name + ".txt");
		if(!newFile.exists()) {
			try {
				newFile.createNewFile();
				System.out.println(newFile + "를 생성합니다");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(newFile);
	}
	
	/**
	 * 디렉토리
	 */
	private void test2() {
		File dir = new File("C:\\Workspaces\\java_workspace\\14_IO");
		System.out.println(dir.getAbsolutePath()); // C:\Workspaces\java_workspace\14_IO
		System.out.println(dir.isDirectory());
		
		File newDir = new File("x/t/z");
		if(!newDir.exists()) {
//			newDir.mkdir();
			newDir.mkdirs();
			System.out.println(newDir + "디렉토리를 생성했습니다.");
		}
		
		// 자식 파일/디렉토리 조회
//		File[] files = dir.listFiles();
//		for(int i = 0; i <files.length; i++) {
//			File f = files[i];
//			if(f.isDirectory())
//				System.out.println("[디렉토리]" + f.getName());
//			else
//				System.out.println(f.getName());
//		}
	}
 	
	/**
	 * 파일
	 */
	private void test1() {
		File file = new File("abc/abc.txt"); // 상대 경로
		System.out.println(file); // abc\abc.txt
		
		File file2 = new File("C:\\Workspaces\\java_workspace\\14_IO\\abc\\abc.txt");
		System.out.println(file2);
		
		System.out.println(file2.getName()); // abc.txt
		System.out.println(file2.getParent()); // C:\Workspaces\java_workspace\14_IO\abc
		System.out.println(file.getAbsolutePath()); // C:\Workspaces\java_workspace\14_IO\abc\abc.txt
		System.out.println(file2.exists()); // true
		System.out.println(file2.isFile()); // true
		System.out.println(file2.isDirectory()); // false
		
		File file3 = new File("abc/def.txt");
		if(!file3.exists()) {
			System.out.println(file3 + "를 생성합니다");
			try {
				file3.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		// 파일명 변경(이동)
		File dest = new File("def.txt");
		file3.renameTo(dest);
		// 삭제
		file3.delete();
	}

}
