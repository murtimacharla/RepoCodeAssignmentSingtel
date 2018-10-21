package com.singtel.code.assignment.models;

public class Bird extends Animal {
	
	public Bird() {
		
	}
	
	public Bird(IWalk walk, IFly fly, ISing sing) {
		super(walk, fly, sing);
	}
	
	//Added talk and swim
	public Bird(IWalk walk, IFly fly, ISing sing, ITalk talk, ISwim swim) {
		super(walk, fly, sing, talk, swim);
	}

}
