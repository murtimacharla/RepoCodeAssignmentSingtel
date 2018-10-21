package com.singtel.code.assignment.solutions;

import com.singtel.code.assignment.models.Bird;
import com.singtel.code.assignment.models.Chicken;
import com.singtel.code.assignment.models.CluckTalk;
import com.singtel.code.assignment.models.Duck;
import com.singtel.code.assignment.models.IFly;
import com.singtel.code.assignment.models.ISwim;
import com.singtel.code.assignment.models.ITalk;
import com.singtel.code.assignment.models.IWalk;
import com.singtel.code.assignment.models.NoFly;
import com.singtel.code.assignment.models.NoSwim;
import com.singtel.code.assignment.models.QuackTalk;
import com.singtel.code.assignment.models.SingtelSwim;
import com.singtel.code.assignment.models.SingtelWalk;

public class SolutionA2 {
	
	public static void main(String[] args) {
		IFly duckFly = new NoFly();
		ITalk duckTalk = new QuackTalk(); 
		ISwim duckSwim = new SingtelSwim();
		IWalk duckWalk = new SingtelWalk();
		
		IFly chickenFly = new NoFly();
		ITalk chickenTalk = new CluckTalk();
		ISwim chickenSwim = new NoSwim();
		IWalk chickenWalk = new SingtelWalk();
		
		Bird duck = new Duck(duckWalk, duckFly, null, duckTalk, duckSwim);
		Bird chicken = new Chicken(chickenWalk, chickenFly, null, chickenTalk, chickenSwim);
		
		System.out.println(" --- Duck --- ");
		duck.getWalk().walk();
		duck.getFly().fly();
		duck.getTalk().talk();
		duck.getSwim().swim();
		
		System.out.println(" --- Chicken --- ");
		chicken.getWalk().walk();
		chicken.getFly().fly();
		chicken.getTalk().talk();
		chicken.getSwim().swim();
		
		
	}

}
