package com.sh.io.test1;

import java.util.*;
import java.io.*;

public class Test1 {
	
	public static void main(String[] args) {
		Test1 test = new Test1();
		test.fileSave();
		test.fileRead();
	}
	
	/**
	 * 메모 읽기
	 */
	private void fileRead() {
		
	}
	
	/**
	 * 메모 저장
	 */
	public void fileSave() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileWriter fw = null;

        try {
        	System.out.println("파일 이름을 입력하세요.");
            String fileName = br.readLine();
            fw = new FileWriter(fileName);

             for(;;) {
            	System.out.println("파일에 저장할 내용을 입력하세요.");
                String input = br.readLine();

                if (input.equals("exit")) {
                    System.out.println("파일에 성공적으로 저장되었습니다.");
                    break;
                }
                fw.write(input + "\n");

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
            	fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            
        }
    }

   
}
		

