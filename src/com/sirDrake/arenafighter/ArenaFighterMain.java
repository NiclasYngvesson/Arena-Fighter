package com.sirDrake.arenafighter;

import java.util.Scanner;

import com.sirDrake.arenafighter.utilities.ArenaUtilities;

public class ArenaFighterMain {

	public static void main(String[] args) {

		// creating an instance of the arena utilities class, to be able to access the
		// methods in it.
		ArenaUtilities arena = new ArenaUtilities();

		String name;
		Scanner chName = new Scanner(System.in);

		System.out.println("   ***   Arena fighter, we salute you!   ***");
		System.out.println("   ***   State thy name to the gods...   ***");

		System.out.print("\t\t");
		name = chName.nextLine();
		arena.arenaMenu(name);
		chName.close();
	}

}
