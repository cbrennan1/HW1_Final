package main.java;

import main.java.Creature;
import main.java.Flyer;
import main.java.Thing;

public class Bat extends Creature implements Flyer{
	private final String moveString;
	
	public Bat(String name) {
		super(name);
		moveString = super.toString() + " is swooping through the dark.";
	}
	
	//  When asked to move, a Bat flies.	
	@Override 
	public void move() {
		fly();
	}
	
	// A Bat eats only Creatures in the same way that any Creature eats.
	@Override
	public void eat(Thing aThing) {
		if (aThing == null || aThing instanceof Creature) {
			super.eat(aThing);
		}
		else {
			throw new IllegalArgumentException("Argument for Bat eat() method was not an instance of the Creature class!");
		}
	}

	// When asked to fly, a Bat prints the message {name} {class} is swooping through the dark.
	@Override
	public void fly() {
		System.out.println(moveString);
	}
	
	//  obtain the move string.
	public String obtainMoveString() {
		return this.moveString;
	}
}
