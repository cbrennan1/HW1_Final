package test.java;

import static org.junit.jupiter.api.Assertions.*;
import main.java.*;

import org.junit.jupiter.api.Test;

class TigerTesting{
	
	// String fixtures
	private final static String ant_name;
	private final static String eat_ant_expected_output;
	private final static String has_eaten_ant_expected_output;

	private final static String bat_name;
	private final static String eat_bat_expected_output;
	private final static String has_eaten_bat_expected_output;
	
	private final static String fly_name;	
	private final static String eat_fly_expected_output;
	private final static String has_eaten_fly_expected_output;
	
	private final static String thing_name;
	private final static String eat_thing_expected_output;
	private final static String has_eaten_thing_expected_output;
	
	private final static String tiger_name;
	private final static String eat_tiger_expected_output;
	private final static String has_eaten_tiger_expected_output;
	
	private final static String move_expected_output;
	private final static String has_not_eaten_expected_output;
	private final static String eat_null_pointer_exception_message;
	
	static {
		tiger_name = "Tigerman";
		eat_tiger_expected_output = tiger_name + " Tiger has just eaten a Tiger" ;
		has_eaten_tiger_expected_output = tiger_name + " Tiger has eaten a Tiger";
		
		ant_name = "Antman";
		eat_ant_expected_output = tiger_name + " Tiger has just eaten a Ant" ;
		has_eaten_ant_expected_output = tiger_name + " Tiger has eaten a Ant";
		
		bat_name = "Batman";
		eat_bat_expected_output = tiger_name + " Tiger has just eaten a Bat" ;
		has_eaten_bat_expected_output = tiger_name + " Tiger has eaten a Bat";
		
		fly_name = "Flyman";
		eat_fly_expected_output = tiger_name + " Tiger has just eaten a Fly" ;
		has_eaten_fly_expected_output = tiger_name + " Tiger has eaten a Fly";
		
		thing_name = "Thingman";
		eat_thing_expected_output = tiger_name + " Tiger has just eaten a Thing" ;
		has_eaten_thing_expected_output = tiger_name + " Tiger has eaten a Thing";
		
		move_expected_output = tiger_name + " Tiger has just pounced.";
		has_not_eaten_expected_output = tiger_name + " Tiger has had nothing to eat!";
		eat_null_pointer_exception_message = "Argument for Creature's eat() method was null";
	}
	
	@Test
	void testEatingAntExpectedOutput() {
		Tiger tiger = new Tiger(tiger_name);
		Ant aAnt = new Ant(ant_name);
		tiger.eat(aAnt);
		assertEquals(eat_ant_expected_output, tiger.obtainCurrentMealLog());
	}
	
	@Test
	void testHasEatenAntExpectedOutput() {
		Tiger tiger = new Tiger(tiger_name);
		Ant aAnt = new Ant(ant_name);
		tiger.eat(aAnt);
		tiger.whatDidYouEat();
		assertEquals(has_eaten_ant_expected_output, tiger.obtainCurrentMealLog());
	}
	
	@Test
	void testEatingBatExpectedOutput() {
		Tiger tiger = new Tiger(tiger_name);
		Bat aBat = new Bat(bat_name);
		tiger.eat(aBat);
		assertEquals(eat_bat_expected_output, tiger.obtainCurrentMealLog());
	}
	
	@Test
	void testHasEatenBatExpectedOutput() {
		Tiger tiger = new Tiger(tiger_name);
		Bat aBat = new Bat(bat_name);
		tiger.eat(aBat);
		tiger.whatDidYouEat();
		assertEquals(has_eaten_bat_expected_output, tiger.obtainCurrentMealLog());
	}
	
	@Test
	void testEatingFlyExpectedOutput() {
		Tiger tiger = new Tiger(tiger_name);
		Fly aFly = new Fly(fly_name);
		tiger.eat(aFly);
		assertEquals(eat_fly_expected_output, tiger.obtainCurrentMealLog());
	}
	
	@Test
	void testHasEatenFlyExpectedOutput() {
		Tiger tiger = new Tiger(tiger_name);
		Fly aFly = new Fly(fly_name);
		tiger.eat(aFly);
		tiger.whatDidYouEat();
		assertEquals(has_eaten_fly_expected_output, tiger.obtainCurrentMealLog());
	}
	
	@Test
	void testEatingThingExpectedOutput() {
		Tiger tiger = new Tiger(tiger_name);
		Thing aThing = new Thing(thing_name);
		tiger.eat(aThing);
		assertEquals(eat_thing_expected_output, tiger.obtainCurrentMealLog());
	}
	
	@Test
	void testHasEatenThingExpectedOutput() {
		Tiger tiger = new Tiger(tiger_name);
		Thing aThing = new Thing(thing_name);
		tiger.eat(aThing);
		tiger.whatDidYouEat();
		assertEquals(has_eaten_thing_expected_output, tiger.obtainCurrentMealLog());
	}
	
	@Test
	void testEatingTigerExpectedOutput() {
		Tiger tiger = new Tiger(tiger_name);
		Tiger aTiger = new Tiger(tiger_name);
		tiger.eat(aTiger);
		assertEquals(eat_tiger_expected_output, tiger.obtainCurrentMealLog());
	}
	
	@Test
	void testHasEatenTigerExpectedOutput() {
		Tiger tiger = new Tiger(tiger_name);
		Tiger aTiger = new Tiger(tiger_name);
		tiger.eat(aTiger);
		tiger.whatDidYouEat();
		assertEquals(has_eaten_tiger_expected_output, tiger.obtainCurrentMealLog());
	}
	
	@Test
	void testEatingNothingNullPointerExceptionShouldBeThrown() {
		Tiger tiger = new Tiger(tiger_name);
		Exception exception = assertThrows(NullPointerException.class, () -> tiger.eat(null));
		assertEquals(eat_null_pointer_exception_message, exception.getMessage());
	}
	
	@Test
	void testMovingExpectedOutput() {
		Tiger tiger = new Tiger(tiger_name);
		tiger.move();
		assertEquals(move_expected_output, tiger.getMoveString());
	}
	
	@Test
	void testHasNotEatenAnythingYetExpectedOutput() {
		Tiger tiger = new Tiger(tiger_name);
		assertEquals(has_not_eaten_expected_output, tiger.obtainCurrentMealLog());
	}


}