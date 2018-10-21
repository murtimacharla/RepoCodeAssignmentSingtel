package com.singtel.code.assignment.solutions;

import java.util.ArrayList;
import java.util.List;

import com.singtel.code.assignment.models.Animal;
import com.singtel.code.assignment.models.Bird;
import com.singtel.code.assignment.models.Chicken;
import com.singtel.code.assignment.models.CluckTalk;
import com.singtel.code.assignment.models.CockadoodleTalk;
import com.singtel.code.assignment.models.Dolphin;
import com.singtel.code.assignment.models.Duck;
import com.singtel.code.assignment.models.Fish;
import com.singtel.code.assignment.models.IFly;
import com.singtel.code.assignment.models.ISing;
import com.singtel.code.assignment.models.ISwim;
import com.singtel.code.assignment.models.ITalk;
import com.singtel.code.assignment.models.IWalk;
import com.singtel.code.assignment.models.MeowTalk;
import com.singtel.code.assignment.models.NoFly;
import com.singtel.code.assignment.models.NoSing;
import com.singtel.code.assignment.models.NoSwim;
import com.singtel.code.assignment.models.NoWalk;
import com.singtel.code.assignment.models.Parrot;
import com.singtel.code.assignment.models.QuackTalk;
import com.singtel.code.assignment.models.Rooster;
import com.singtel.code.assignment.models.SingtelFly;
import com.singtel.code.assignment.models.SingtelSing;
import com.singtel.code.assignment.models.SingtelSwim;
import com.singtel.code.assignment.models.SingtelWalk;
import com.singtel.code.assignment.models.WoofTalk;

public class SolutionE {
	
	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<Animal>();
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
		
		IFly roosterFly = new NoFly();
		ITalk roosterTalk = new CockadoodleTalk();
		ISwim roosterSwim = new NoSwim();
		IWalk roosterWalk = new SingtelWalk();
		
		Chicken rooster = new Rooster(roosterWalk, roosterFly, null, roosterTalk, roosterSwim);
		
		IFly parrotFly = new SingtelFly();
		ISwim parrotSwim = new NoSwim();
		IWalk parrotWalk = new SingtelWalk();
		
		ITalk dogParrotTalk = new WoofTalk();
		ITalk catParrotTalk = new MeowTalk();
		ITalk roosterParrotTalk = new CockadoodleTalk();
		
		ISing parrotSing = new SingtelSing();
		
		Bird dogParrot = new Parrot(parrotWalk, parrotFly, parrotSing, dogParrotTalk, parrotSwim);
		Bird catParrot = new Parrot(parrotWalk, parrotFly, parrotSing, catParrotTalk, parrotSwim);
		Bird roosterParrot = new Parrot(parrotWalk, parrotFly, parrotSing, roosterParrotTalk, parrotSwim);
		
		ISwim fishSwim = new SingtelSwim();
		IWalk fishWalk = new NoWalk();
		ISing fishSing = new NoSing();
		
		Animal fish = new Fish(fishWalk, null, fishSing, null, fishSwim);
		
		Animal dolphin = new Dolphin(new SingtelSwim());
		
		animals.add(duck);
		animals.add(chicken);
		animals.add(rooster);
		animals.add(dogParrot);
		animals.add(catParrot);
		animals.add(roosterParrot);
		animals.add(fish);
		animals.add(dolphin);
		
		int countSwim = 0;
		int countWalk = 0;
		int countSing = 0;
		int countFly = 0;
		
		for(Animal animal : animals) {
			if(animal.getFly() != null) {
				if(animal.getFly() instanceof NoFly == false) {
					countFly++;
				}
			}
			
			if(animal.getSwim() != null) {
				if(animal.getSwim() instanceof NoSwim == false) {
					countSwim++;
				}
			}
			
			if(animal.getWalk() != null) {
				if(animal.getWalk() instanceof NoWalk == false) {
					countWalk++;
				}
			}
			
			if(animal.getSing() != null) {
				if(animal.getSing() instanceof NoSing == false || animal.getSing() == null) {
					countSing++;
				}
			}
			
		}
		
		System.out.println("Swim Count: " + countSwim);
		System.out.println("Walk Count: " + countWalk);
		System.out.println("Sing count: " + countSing);
		System.out.println("Fly Count: " + countFly);
		
		
	}

}
