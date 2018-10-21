package com.singtel.code.assignment.solutions;

import com.singtel.code.assignment.models.Bird;
import com.singtel.code.assignment.models.IFly;
import com.singtel.code.assignment.models.ISing;
import com.singtel.code.assignment.models.IWalk;
import com.singtel.code.assignment.models.SingtelFly;
import com.singtel.code.assignment.models.SingtelSing;
import com.singtel.code.assignment.models.SingtelWalk;

public class SolutionA1 {
	
	public static void main(String[] args) {
		IWalk walk = new SingtelWalk();
		IFly fly = new SingtelFly();
		ISing sing = new SingtelSing();
		
		Bird bird = new Bird(walk, fly, sing);
		bird.getWalk().walk();
		bird.getFly().fly();
		bird.getSing().sing();
	}

}
