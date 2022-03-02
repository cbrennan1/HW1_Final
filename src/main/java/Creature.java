package main.java;

import main.java.Thing;

public abstract class Creature extends Thing{

	private Thing lastMealAte;
	private String mealLog;
	private boolean justAte;
	
	public Creature(String name) {
		super(name);
		mealLog = super.toString() + " has had nothing to eat!";
		justAte = false;
	}
	
	// Creatures may be asked to eat various Things.
	public void eat(Thing aThing) {
		if (aThing == null) {
			throw new NullPointerException("Eat() method was null");
		}
		lastMealAte = aThing;
		mealLog = super.toString() + " has just eaten a " + aThing.getClass().getSimpleName();
		justAte = true;
		System.out.println(mealLog);
	}
	
	// Tell the Creature to move.
	public abstract void move();
	
	// Make the Creature tell what is in its stomach.
	public void whatDidYouEat() {
		if (justAte) {
			mealLog = super.toString() + " has eaten a " + lastMealAte.getClass().getSimpleName();
			justAte = false;
		}
		System.out.println(mealLog);
	}
	
	// Obtain Current Meal Log
	public String obtainCurrentMealLog() {
		return mealLog;
	}
	
}