package com.sirDrake.arenafighter.models;

import java.util.ArrayList;

public class Battle {

	public Battle(Character player, Character opp) {

		this.player = player;
		this.opponent = opp;
		this.rounds = new ArrayList<Round>();
	}

	private Character player;
	private Character opponent;
	private ArrayList<Round> rounds;

	// method to start the loop battles
	public void battleLoop() {

		boolean runningBattle = true;

		System.out.println("***\t" + player.getName() + " you will fight: ");
		opponent.displayCharacter();
		System.out.println("\n\n\tThe Battle begins!\n");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		while (runningBattle) {

			
			Round round = new Round(player, opponent);

			round.roundResolve();

			System.out.println();
			player.displayCharacter();
			System.out.println();
			opponent.displayCharacter();

			addRound(round);

			if (opponent.isDead()) {
				System.out.println("****\t" + player.getName() + " you defeated " + opponent.getName());
				runningBattle = false;
				player.addBattle(this);
				player.setScore(5);
			} else if (player.isDead()) {
				System.out.println("****\t" + player.getName() + " was slain by " + opponent.getName());
				runningBattle = false;
			} else {
				 System.out.println("\tA new round begins...\n");
				 
			}

		}

	}

	public Character getPlayer() {
		return player;
	}

	public Character getOpponent() {
		return opponent;
	}

	public ArrayList<Round> getRounds() {
		return rounds;
	}

	public void addRound(Round round) {
		rounds.add(round);
	}

}
