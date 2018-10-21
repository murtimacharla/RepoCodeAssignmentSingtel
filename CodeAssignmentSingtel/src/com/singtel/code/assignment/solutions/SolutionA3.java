package com.singtel.code.assignment.solutions;

import com.singtel.code.assignment.models.Chicken;
import com.singtel.code.assignment.models.CockadoodleTalk;
import com.singtel.code.assignment.models.IFly;
import com.singtel.code.assignment.models.ISwim;
import com.singtel.code.assignment.models.ITalk;
import com.singtel.code.assignment.models.IWalk;
import com.singtel.code.assignment.models.NoFly;
import com.singtel.code.assignment.models.NoSwim;
import com.singtel.code.assignment.models.Rooster;
import com.singtel.code.assignment.models.SingtelWalk;

public class SolutionA3 {
	
	public static void main(String[] args) {
		IFly roosterFly = new NoFly();
		ITalk roosterTalk = new CockadoodleTalk();
		ISwim roosterSwim = new NoSwim();
		IWalk roosterWalk = new SingtelWalk();
		
		Chicken rooster = new Rooster(roosterWalk, roosterFly, null, roosterTalk, roosterSwim);
		
		System.out.println(" --- Rooster --- ");
		rooster.getWalk().walk();
		rooster.getFly().fly();
		rooster.getTalk().talk();
		rooster.getSwim().swim();
	}

}
