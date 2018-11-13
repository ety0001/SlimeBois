package com.ethan.and.aj.Encounters;

public class LastEncounter extends Encounter{

	/**
	 * Initializes an encounter with a list of options
	 * @param options List of options
	 */
	public LastEncounter(String name, String[] options) {
		super(name, options);
		//Adds this encounter to the overall list
		Encounter.getEncounters().add(this);
	}

	//Implementation of this function
	public Encounter getNextEncounter(int input) {
		System.out.println("Game over");
		return null;

		
	}


}
