package com.ethan.and.aj.Encounters;

public class FirstEncounter extends Encounter{

	/**
	 * Initializes an encounter with a list of options
	 * @param options List of options
	 */
	public FirstEncounter(String name, String[] options) {
		super(name, options);
		//Adds this encounter to the overall list
		Encounter.getEncounters().add(this);
	}

	//Implementation of this function
	//Processes current encounter then moves onto next
	//May want to split into two functions
	public Encounter getNextEncounter(int input) {
		if(input == 1) {
			System.out.println("The stick smacks the skeleton in the face. He looks puzzled! \nHe charges at you full speed! \nYou lose " + 0 +"HP");
			//damageEnemy(attack);
			//damage(skeletonAttack);
			System.out.println("Your health is currently " + 0);
			//if(skeletonHealth > 0 ) {
			//	System.out.println("The skeleton's health is currently " + skeletonHealth);
			//}
			return Encounter.getEncounterByName("Squid Encounter");
		}else {
			System.out.println("The skeleton sympathizes with your tears and gives you a sword");
			return Encounter.getEncounterByName("Snake Encounter");
		}

		
	}


}
