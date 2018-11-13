package com.ethan.and.aj;
import java.util.Scanner;

import com.ethan.and.aj.Encounters.Encounter;
import com.ethan.and.aj.Encounters.FirstEncounter;
import com.ethan.and.aj.Encounters.LastEncounter;

public class Main {

	public static void main(String[] args) {
		Scanner playerInput = new Scanner(System.in);
		String playerName;
		System.out.println("First adventurer! What is your name?");
		playerName = playerInput.nextLine();
		System.out.println("Greetings "+playerName+"!");

		
		setupEncounters();
		//Sets the very first encounter to the first one
		Encounter current = Encounter.getEncounters().get(0);
		
		while(true){
			current.printOptions();
			//TODO: Input handling
			int playerChoice = playerInput.nextInt();
			current = current.getNextEncounter(playerChoice);
			
			//Terminate the loop if the end of the game is reached
			if(current == null) break;
		}
		playerInput.close();
	}
	
	public static void setupEncounters() {
		
		//Looks weird because it's not being set to anything but that's ok
		new FirstEncounter("First Encounter", new String[]{"Quick to the fight! Fast a skeleton approaches behind you!","What do you do?", "1)Throw a stick?", "2)Cry a little"});
		//You don't need a new encounter type for every encounter. Think boss encounter or normal encounter. Here we just have a start and end.
		new LastEncounter("Squid Encounter", new String[]{"YOU FOUND A SQUID", "1)Oh no", "2)OHHHH NOOOOO"});
		new LastEncounter("Snake Encounter", new String[]{"YOU FOUND A SNEK", "1)NOPE"});
	}
	

	
	


}
