package com.sh.oop.person.run;


import com.sh.oop.person.controller.PersonController;

public class Run {

	public static void main(String[] args) {

		PersonController pc = new PersonController();
		pc.inputInfo();
		pc.printAverage();
		
	}

}
