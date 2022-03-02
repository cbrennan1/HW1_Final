package main.java;

import main.java.Ant;
import main.java.Bat;
import main.java.Creature;
import main.java.Fly;
import main.java.Thing;
import main.java.Tiger;

public class TestCreature {
	// Thing Count and Creature Count Variable
	public final static int THING_COUNT = 8;
	public static final int CREATURE_COUNT = 8;
	
	public static void main(String[] args) {
		// Array for things and creatures with respective sizes
		Thing[] arrayThing = new Thing[THING_COUNT];
		Creature[] arrayCreature = new Creature[CREATURE_COUNT];
		// Index and Offset Variable
		int index = 0;
		int offset = 0;
		
		//create and print a few Tiger instances. 
		//Add code to the main() to create several instances of Tiger in the Thing array; 
		//this is in addition to the earlier Thing instances.
		while (index < (CREATURE_COUNT / 4) + offset) {
			Tiger currTiger = new Tiger("Tiger" + index);
			arrayThing[index] = currTiger;
			arrayCreature[index] = currTiger;
			index++;
		}
		
		offset = offset + (CREATURE_COUNT / 4);
		
		//ant instances
		while (index < (CREATURE_COUNT / 4) + offset) {
			Ant currAnt = new Ant("Ant" + index);
			arrayThing[index] = currAnt;
			arrayCreature[index] = currAnt;
			index++;
		}
		offset = offset + (CREATURE_COUNT / 4);
		//bat instances
		while (index < (CREATURE_COUNT / 4) + offset) {
			Bat currBat = new Bat("Bat" + index);
			arrayThing[index] = currBat;
			arrayCreature[index] = currBat;
			index++;
		}
		
		offset = offset + (CREATURE_COUNT / 4);
		
		//fly instances
		while (index < (CREATURE_COUNT / 4) + offset) {
			Fly currFly = new Fly("Fly" + index);
			arrayThing[index] = currFly;
			arrayCreature[index] = currFly;
			index++;
		}
		
		while (index < THING_COUNT) {
			arrayThing[index] = new Thing("Thing" + index);
			index++;
		}

		// print a heading "Things:" followed by a blank line
		System.out.println("Things:\n");
		// print each thing, which each print one line about themselves
		for (int i = 0; i < THING_COUNT; i++) {
			if (i == THING_COUNT - 1) {
				System.out.println(arrayThing[i] + "\n");
			}
			else {
				System.out.println(arrayThing[i]);
			}
		}
		// print a blank line then the heading "Creatures:" followed by a blank line
		System.out.println("Creatures:\n");
		// print each creature then a blank line
		for (int i = 0; i < CREATURE_COUNT; i++) {
			if (i == CREATURE_COUNT - 1) {
				System.out.println(arrayCreature[i] + "\n");
			}
			else {
				System.out.println(arrayCreature[i]);
			}
		}
		
		System.out.println("Creature move() method implementation:\n");
		for (int i = 0; i < CREATURE_COUNT; i++) {
			if (i == CREATURE_COUNT - 1) {
				arrayCreature[i].move();
				System.out.println();
			}
			else {
				arrayCreature[i].move();
			}
		}
		
		System.out.println("Creature eat() method implementation:\n");
		for (int i = 0; i < CREATURE_COUNT; i++) {
			if (i == CREATURE_COUNT - 1) {
				arrayCreature[i].eat(arrayThing[i]);
				System.out.println();
			}
			else {
				arrayCreature[i].eat(arrayThing[i]);
			}
		}
		
		System.out.println("Creature whatDidYouEat() methods implementation:\n");
		for (int i = 0; i < CREATURE_COUNT; i++) {
			if (i == CREATURE_COUNT - 1) {
				arrayCreature[i].whatDidYouEat();
				System.out.println();
			}
			else {
				arrayCreature[i].whatDidYouEat();
			}
		}
	}

}
