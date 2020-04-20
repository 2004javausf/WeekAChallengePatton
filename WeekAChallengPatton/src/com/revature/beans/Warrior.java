package com.revature.beans;

public class Warrior {
	private String name;
	private int height;
	private int weight;
	private String weapon;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	
	@Override
	public String toString() {
		return "Warrior [name=" + name + ", height=" + height + ", weight=" + weight + ", weapon=" + weapon + "]";
	}
	
	
}
