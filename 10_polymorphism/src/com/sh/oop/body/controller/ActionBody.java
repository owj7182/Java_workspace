package com.sh.oop.body.controller;

import com.sh.oop.body.model.Arm;
import com.sh.oop.body.model.Body;
import com.sh.oop.body.model.Head;
import com.sh.oop.body.model.Leg;

public class ActionBody {

	public static void main(String[] args) {
		Body[] b = new Body[5];
		b[0] = new Head("초록");
		b[1] = new Arm();
		b[2] = new Arm();
		b[3] = new Leg();
		b[4] = new Leg();
		
		ActionBody ab = new ActionBody();
		for(int i=0; i<b.length; i++){
			ab.action(b[i]);
		}
	}

	public  void action(Body body) {
		if(body instanceof Head)
			((Head)body).headBanging();
		else if(body instanceof Arm)
			((Arm)body).armSwing();
		else if(body instanceof Leg)
			((Leg)body).run();
	}

}