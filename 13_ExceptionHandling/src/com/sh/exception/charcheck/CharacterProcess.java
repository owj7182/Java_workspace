package com.sh.exception.charcheck;

import java.util.*;

public class CharacterProcess {
	
	public CharacterProcess() {
		super();
	}

	public int countAlpa(String s) throws CharCheckException {
		
		int count = 0;
		s = s.toLowerCase();
		char[] charList = s.toCharArray();
		
		for(char c : charList) {
			if (c >= 'a' && c <= 'z') 
				count ++;
			
			else if (c == ' ')
				throw new CharCheckException("체크할 문자열 안에 공백이 있습니다.");
		
			
		}
		return count;
	}
}
