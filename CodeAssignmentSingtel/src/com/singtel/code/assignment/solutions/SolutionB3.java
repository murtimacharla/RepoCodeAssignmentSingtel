package com.singtel.code.assignment.solutions;

import com.singtel.code.assignment.models.Animal;
import com.singtel.code.assignment.models.Dolphin;
import com.singtel.code.assignment.models.SingtelSwim;

public class SolutionB3 {
	
	public static void main(String[] args) {
		Animal dolphin = new Dolphin(new SingtelSwim());
		dolphin.getSwim().swim();
		
	}

}
