package com.sirDrake.arenafighter.utilities;

import com.sirDrake.arenafighter.utilities.randomGen;

public class nameGen {

	static String[] romanNames = { "Acidinus", "Adventus", "Ahala", "Ahenobarbus", "Albinus", "Amantius", "Ambustus",
			"Annalis", "Antias", "Aquilinus", "Avitus", "Balbus", "Brutus", "Carbo", "Cerialis", "Cethegus", "Cinna",
			"Crassus", "Curio", "Dolabella", "Drusus", "Felix", "Flaccus", "Florus", "Galba", "Gallus", "Germanicus",
			"Hadrianus", "Lentulus", "Libo", "Lucullus", "Mamertinus", "Marcus", "Merula", "Minea", "Murena", "Naevius",
			"Petronax", "Philippus", "Piso", "Pollio", "Pulcher", "Quintilianus", "Rex", "Rufus", "Sabinus", "Scipio",
			"Silanus", "Sosius", "Tatiana", "Tertia", "Urbicus", "Varro", "Marianus", "Marinus", "Marius", "Simmaco",
			"Tettius", "Vinicius", "Agrippa", "Appius", "Aulus", "Caeso", "Decimus", "Faustus", "Gaius", "Gnaeus",
			"Hostus", "Lucius", "Mamercus", "Manius", "Marcus", "Mettius", "Nonus", "Numerius", "Octavius", "Opiter",
			"Paullus", "Postumus", "Proculus", "Publius", "Quintus", "Septimus", "Sertor", "Servius", "Sextus",
			"Spurius", "Statius", "Tiberius", "Titus", "Tullus", "Vibius", "Volesus", "Vopiscus" };

	public static String getRandomRomanName(int a) {

		String randomizedRomanName = "";

		for (int i = 1; i <= a; i++) {

			int x = randomGen.getRandom(0, romanNames.length);
			randomizedRomanName += romanNames[x] + " ";

		}

		return randomizedRomanName;
	}

}
