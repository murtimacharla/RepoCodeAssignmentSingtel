package com.singtel.code.assignment.models;

public class Rooster extends Chicken {
	
	public Rooster() {
		
	}
	
	public Rooster(IWalk walk, IFly fly, ISing sing, ITalk talk, ISwim swim) {
		super(walk, fly, sing, talk, swim);
	}

}
