package com.sirDrake.arenafighter.models;

import java.util.ArrayList;

import com.sirDrake.arenafighter.utilities.randomGen;

public class Character {

	public Character(String name) {
		this.setName(name);
		this.setHealth ( randomGen.getRandom(6, 10));
		this.strength = randomGen.getRandom(5, 6);
		this.battles = new ArrayList<Battle>();
	}
	//The characters attributes
	private int score;
	private String name;
	private int health;
	private int strength;
	private ArrayList<Battle> battles;
	
	//below are the setters and getters for the character
	public boolean isDead() {
		return this.health <= 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health += health;
	}

	public int getStrength() {
		return strength;
	}

	public int getScore() {
		return score;
	}
	// this setter adds a score to the score the total score
	public void setScore(int score) {
		this.score += score;
	}

	public ArrayList<Battle> getBattles() {
		return battles;
	}
	//adds a battle to the characters list of battles
	public void addBattle(Battle battle) {
		battles.add(battle);
	}

	protected void displayCharacter() {
		System.out.println("*********************************");
		System.out.println("           " + this.getName());
		System.out.println("*********************************");
		System.out.println("* Health:\t" + this.getHealth());
		System.out.println("* Strength:\t" + this.getStrength());
		System.out.println("*********************************");

	}

}
