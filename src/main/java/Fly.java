package main.java;

import main.java.Creature;
import main.java.Flyer;
import main.java.Thing;

public class Fly extends Creature implements Flyer{
	private final String moveString;
	
	public Fly(String name) {
		super(name);
		moveString = super.toString() + " is buzzing around in flight.";
	}
	
	// When asked to move, a Fly flies.
	@Override
	public void move() {
		fly();
	}
	
	// A Fly eats only Things; a fly will not eat anything that is a Creature.
	@Override 
	public void eat(Thing aThing) {
		if (aThing == null || !(aThing instanceof Creature)) {
			super.eat(aThing);
		}
		else {
			System.out.println(super.toString() + " won't eat a " + aThing.getClass().getSimpleName() + ".");
		}

	}

	// When asked to fly, a Fly prints the message '{name} {class} is buzzing around in flight.'
	@Override
	public void fly() {
		System.out.println(moveString);
	}
	
	// Obtain Move String
	public String obtainMoveString() {
		return this.moveString;
	}
}