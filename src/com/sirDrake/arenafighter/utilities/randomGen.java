package com.sirDrake.arenafighter.utilities;

import java.util.Random;

public class randomGen {

	private static Random rand = new Random();

	public static int getRandom(int minValue, int maxValue) {

		return rand.nextInt(maxValue) + minValue;
	}

}
