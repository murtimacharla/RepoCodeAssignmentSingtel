package com.singtel.code.assignment.solutions;

import com.singtel.code.assignment.models.Animal;
import com.singtel.code.assignment.models.Fish;
import com.singtel.code.assignment.models.ISing;
import com.singtel.code.assignment.models.ISwim;
import com.singtel.code.assignment.models.IWalk;
import com.singtel.code.assignment.models.NoSing;
import com.singtel.code.assignment.models.NoWalk;
import com.singtel.code.assignment.models.SingtelSwim;

public class SolutionB1 {
	
	public static void main(String[] args) {
		
		ISwim fishSwim = new SingtelSwim();
		IWalk fishWalk = new NoWalk();
		ISing fishSing = new NoSing();
		
		Animal fish = new Fish(fishWalk, null, fishSing, null, fishSwim);
		fish.getWalk().walk();
		fish.getSing().sing();
		fish.getSwim().swim();
	}

}
