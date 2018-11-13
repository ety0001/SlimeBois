package com.ethan.and.aj.Encounters;
import java.util.ArrayList;

public abstract class Encounter{
	
	private static ArrayList<Encounter> encounters = new ArrayList<Encounter>();
	private String[] options;
	private String name;
	
	/**
	* Initializes an encounter with a list of options
	* @param options List of options
	*/
	protected Encounter(String name, String[] options) {
		this.name = name;
		this.options = options;
	}
	
	public String getName() {
		return name;
	}
	
	//By default just prints the String[] of options
	public void printOptions() {
		for(String s : options) {
			System.out.println(s);
		}
	}
	
	//Change this to whatever is going to be constant among all classes
	//All children of this class must have this function
	public abstract Encounter getNextEncounter(int input);
	
	public static ArrayList<Encounter> getEncounters(){
		return encounters;
	}
	
	
	public static Encounter getEncounterByName(String name) {
		for(Encounter ent : encounters) {
			if(ent.getName().equalsIgnoreCase(name)) {
				return ent;
			}
		}
		return null;
	}
}
