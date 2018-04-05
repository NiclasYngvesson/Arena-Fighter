package com.sirDrake.arenafighter.utilities;

import java.util.Scanner;

import com.sirDrake.arenafighter.models.Battle;
import com.sirDrake.arenafighter.models.Character;

public class ArenaUtilities {

	// arenaMenu method
	public void arenaMenu(String name) {

		Character player = new Character(name);

		Scanner sc = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.println("********************************");
			System.out.println("   ***Welcome to the arena***   ");
			System.out.println("                                ");
			System.out.println("           " + player.getName());
			System.out.println("*********************************");
			System.out.println("* Health:\t" + player.getHealth());
			System.out.println("* Strength:\t" + player.getStrength());
			System.out.println("* Battles:\t" + player.getBattles().size());
			System.out.println("*********************************");
			System.out.println("   ***  Make your choice  ***");
			System.out.println("");
			System.out.println("*   F to fight an opponent!");
			System.out.println("*   R to retire!");
			System.out.print("\t\t");

			String choice = sc.nextLine();

			switch (choice) {

			case "f":

			case "F":

				Character opp =  new Character(nameGen.getRandomRomanName(randomGen.getRandom(1, 2)));
				Battle battle = new Battle(player, opp);
				battle.battleLoop();
				break;

			case "r":
			case "R":

				System.out.println(player.getName() + " has retired glorius, living of his fame and glory!");
				run = false;
				player.setScore(10);
				break;

			default:

				System.out.println("Not a valid choice " + player.getName() + ", try once more!");
				break;
			}

			if (player.isDead()) {

				System.out
						.println(player.getName() + " has been killed in glorius battle and now dines with the gods.");
				run = false;
			}
		}

		// displays the players history
		playerHistory(player);
		sc.close();
	}

	private void playerHistory(Character player) {

		for (Battle battle : (player.getBattles())) {

			System.out
					.println(battle.getOpponent().getName() + "was killed in " + battle.getRounds().size() + " rounds");
			System.out.println();

		}

		System.out.println(player.getName() + " earned 5 points for every battle, and was victorius in "
				+ player.getBattles().size() + " battles");
		
		if (player.isDead() == false) {
			System.out
					.println(player.getName() + " also retired as a hero undefeated, earning yet another 10 points. ");
		}
		
		System.out.println("Points all in all: " + player.getScore());
	
	}

}
