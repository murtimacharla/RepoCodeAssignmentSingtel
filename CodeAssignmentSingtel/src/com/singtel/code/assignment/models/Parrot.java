package com.singtel.code.assignment.models;

public class Parrot extends Bird {
	
	public Parrot() {
		
	}

	public Parrot(IWalk walk, IFly fly, ISing sing, ITalk talk, ISwim swim) {
		super(walk, fly, sing, talk, swim);
	}

}
