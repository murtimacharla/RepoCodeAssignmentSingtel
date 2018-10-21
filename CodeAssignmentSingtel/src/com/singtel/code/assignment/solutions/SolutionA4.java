package com.singtel.code.assignment.solutions;

import com.singtel.code.assignment.models.Bird;
import com.singtel.code.assignment.models.CockadoodleTalk;
import com.singtel.code.assignment.models.IFly;
import com.singtel.code.assignment.models.ISwim;
import com.singtel.code.assignment.models.ITalk;
import com.singtel.code.assignment.models.IWalk;
import com.singtel.code.assignment.models.MeowTalk;
import com.singtel.code.assignment.models.NoSwim;
import com.singtel.code.assignment.models.Parrot;
import com.singtel.code.assignment.models.SingtelFly;
import com.singtel.code.assignment.models.SingtelWalk;
import com.singtel.code.assignment.models.WoofTalk;
public class SolutionA4 {
	
	public static void main(String[] args) {
		IFly parrotFly = new SingtelFly();
		ISwim parrotSwim = new NoSwim();
		IWalk parrotWalk = new SingtelWalk();
		
		ITalk dogParrotTalk = new WoofTalk();
		ITalk catParrotTalk = new MeowTalk();
		ITalk roosterParrotTalk = new CockadoodleTalk();
		
		Bird dogParrot = new Parrot(parrotWalk, parrotFly, null, dogParrotTalk, parrotSwim);
		Bird catParrot = new Parrot(parrotWalk, parrotFly, null, catParrotTalk, parrotSwim);
		Bird roosterParrot = new Parrot(parrotWalk, parrotFly, null, roosterParrotTalk, parrotSwim);
		
		System.out.println(" --- Dog Parrot --- ");
		dogParrot.getTalk().talk();
		
		System.out.println(" --- Cat Parrot --- ");
		catParrot.getTalk().talk();
		
		System.out.println(" --- Rooster Parrot --- ");
		roosterParrot.getTalk().talk();
		
		/*Note: If another parrot comes with different way of talking, another class should be created 
		implementing ITalk or uses existing ones like QuackTalk*/
		
	}

}
