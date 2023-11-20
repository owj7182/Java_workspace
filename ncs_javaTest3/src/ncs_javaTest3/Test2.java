package ncs_javaTest3;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Test2 {

	public static void main(String[] args) {
		Test2 test = new Test2();
		test.output();
	}
	
	public void output() {
		FileWriter fw = null;
		try {
			
			// default값은 false이고 false는 덮어 쓰기 true는 이어쓰기이다.
			fw = new FileWriter("test1.txt", true); 
			
			fw.write(97);
			fw.write(65);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		// fw.close()로 닫아줘야 한다.
		finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	}

}

