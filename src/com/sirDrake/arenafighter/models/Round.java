package com.sirDrake.arenafighter.models;

import com.sirDrake.arenafighter.utilities.randomGen;

public class Round {
	Round(Character player, Character opponent) {

		this.player = player;
		this.opponent = opponent;
		this.setPlayerAttack();
		this.setOpponentAttack();

	}

	private Character opponent;
	private Character player;
	private int opponentAttack;
	private int playerAttack;

	
	//Method for resolve the round. Comparing the attack values for the opponent and player.
	//The one with highest value will do damage to the other. The damage is the difference between the attack values and is removed from the "losing" characters health.
	public void roundResolve() {

		if (getPlayerAttack() > getOpponentAttack()) {

			System.out.println(player.getName() + " strikes and does " + (getPlayerAttack() - getOpponentAttack())
					+ " points of damage. (PlAtt:" + getPlayerAttack()+ "), (OpAtt:" + getOpponentAttack()+")");

			opponent.setHealth(getOpponentAttack() - getPlayerAttack());

		} else if (getPlayerAttack() < getOpponentAttack()) {

			System.out.println(opponent.getName() + "strikes and does " + (getOpponentAttack() - getPlayerAttack())
					+ " points of damage. (PlAtt: "+ getPlayerAttack()+"), (OpAtt: " + getOpponentAttack()+")");

			player.setHealth(getPlayerAttack() - getOpponentAttack());

		} else {
			System.out.println(player.getName() + " and " + opponent.getName() + "are deadlocked in battle...");
			System.out.println("The battle rages on!!");
		}
	}
	
	//Setters and getters for the Attack values.
	public int getPlayerAttack() {

		return playerAttack;
	}

	//The setter for the players attack value takes the strength and add a random from 1-6.
	private void setPlayerAttack() {
		this.playerAttack = player.getStrength() + randomGen.getRandom(1, 6);
	}

	public int getOpponentAttack() {
		return opponentAttack;
	}
	
	//The setter for the players attack value takes the strength and add a random from 1-6.
	public void setOpponentAttack() {
		this.opponentAttack = opponent.getStrength() + randomGen.getRandom(1, 6);
	}

}
