package ncs_javaTest3.retest;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Test2 {

	public static void main(String[] args) {
		Test2 retest = new Test2();
		retest.output();
	}
	public void output() {
		BufferedWriter bw = null;
		try {
			// true로 이어쓰기로 변환한다
			bw = new BufferedWriter(new FileWriter("test.txt", true)); 
			bw.write("안녕하세요");
			bw.write("반갑습니다");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				// bw.close()로 닫아줘야 한다.
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
