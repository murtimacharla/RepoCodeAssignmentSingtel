package com.singtel.code.assignment.models;

public class Animal {
	
	private IWalk walk;
	
	private IFly fly;
	
	private ISing sing;
	
	private ITalk talk;
	
	private ISwim swim;

	public Animal() {
		
	}
	
	public Animal(IWalk walk, IFly fly, ISing sing) {
		this.walk = walk;
		this.fly = fly;
		this.sing = sing;
	}
	
	public Animal(IWalk walk, IFly fly, ISing sing, ITalk talk, ISwim swim) {
		this.walk = walk;
		this.fly = fly;
		this.sing = sing;
		this.talk = talk;
		this.swim = swim;
	}
	
	public IWalk getWalk() {
		return walk;
	}

	public void setWalk(IWalk walk) {
		this.walk = walk;
	}

	public IFly getFly() {
		return fly;
	}

	public void setFly(IFly fly) {
		this.fly = fly;
	}

	public ISing getSing() {
		return sing;
	}

	public void setSing(ISing sing) {
		this.sing = sing;
	}

	public ITalk getTalk() {
		return talk;
	}

	public void setTalk(ITalk talk) {
		this.talk = talk;
	}

	public ISwim getSwim() {
		return swim;
	}

	public void setSwim(ISwim swim) {
		this.swim = swim;
	}
	
}
