package com.singtel.code.assignment.models;

public class Fish extends Animal {
	
	public Fish() {
		
	}
	
	public Fish(IWalk walk, IFly fly, ISing sing) {
		super(walk, fly, sing);
	}
	
	public Fish(IWalk walk, IFly fly, ISing sing, ITalk talk, ISwim swim) {
		super(walk, fly, sing, talk, swim);
	}
	
	private Enum<FishSize> size;
	
	private String color;
	
	private boolean isJoker;
	
	private boolean eatsOtherFish;

	public Enum<FishSize> getSize() {
		return size;
	}

	public void setSize(Enum<FishSize> size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isJoker() {
		return isJoker;
	}

	public void setJoker(boolean isJoker) {
		this.isJoker = isJoker;
	}

	public boolean isEatsOtherFish() {
		return eatsOtherFish;
	}

	public void setEatsOtherFish(boolean eatsOtherFish) {
		this.eatsOtherFish = eatsOtherFish;
	}

	@Override
	public String toString() {
		return "Fish [size=" + size + ", color=" + color + ", isJoker=" + isJoker + ", eatsOtherFish=" + eatsOtherFish
				+ "]";
	}

}
