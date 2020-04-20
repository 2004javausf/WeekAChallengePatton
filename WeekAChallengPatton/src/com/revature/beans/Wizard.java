package com.revature.beans;

public class Wizard {
	private String name;
	private int age;
	private String weapon;
	private String element;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	public String getElement() {
		return element;
	}
	public void setElement(String element) {
		this.element = element;
	}
	
	@Override
	public String toString() {
		return "Wizard [name=" + name + ", age=" + age + ", weapon=" + weapon + ", element=" + element + "]";
	}
	
	
}
