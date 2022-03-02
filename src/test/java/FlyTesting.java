package test.java;

import static org.junit.jupiter.api.Assertions.*;
import main.java.*;
import org.junit.jupiter.api.Test;

class FlyTesting{
	// String fixtures
	private final static String fly_name;	
		
	private final static String thing_name;
	private final static String eat_thing_expected_output;
	private final static String has_eaten_thing_expected_output;
	
	private final static String move_expected_output;
	private final static String has_not_eaten_expected_output;
	private final static String eat_null_pointer_exception_message;
	private final static String eat_thing_illegal_argument_exception_message;

	static {
		fly_name = "Flyman";
				
		thing_name = "Thingman";
		eat_thing_expected_output = fly_name + " Fly has just eaten a Thing" ;
		has_eaten_thing_expected_output = fly_name + " Fly has eaten a Thing";
		
		move_expected_output = fly_name + " Fly is buzzing around in flight.";
		has_not_eaten_expected_output = fly_name + " Fly has had nothing to eat!";
		eat_null_pointer_exception_message = "Argument for Creature's eat() method was null";
		eat_thing_illegal_argument_exception_message = "Argument for Bat eat() method was an instance of the Creature class!";
	}

	@Test
	void testEatingThingExpectedOutput() {
		Fly fly = new Fly(fly_name);
		Thing aThing = new Thing(thing_name);
		fly.eat(aThing);
		assertEquals(eat_thing_expected_output, fly.obtainCurrentMealLog());
	}
	
	@Test
	void testHasEatenThingExpectedOutput() {
		Fly fly = new Fly(fly_name);
		Thing aThing = new Thing(thing_name);
		fly.eat(aThing);
		fly.whatDidYouEat();
		assertEquals(has_eaten_thing_expected_output, fly.obtainCurrentMealLog());
	}
	
	@Test
	void testEatingNothingNullPointerExceptionShouldBeThrown() {
		Fly fly = new Fly(fly_name);
		Exception exception = assertThrows(NullPointerException.class, () -> fly.eat(null));
		assertEquals(eat_null_pointer_exception_message, exception.getMessage());
	}
	
	@Test
	void testEatingCreatureIllegalArgumentExceptionShouldBeThrown() {
		Fly fly = new Fly(fly_name);
		Exception exception = assertThrows(IllegalArgumentException.class, () -> fly.eat(new Fly(fly_name)));
		assertEquals(eat_thing_illegal_argument_exception_message, exception.getMessage());
	}
	
	@Test
	void testMovingExpectedOutput() {
		Fly fly = new Fly(fly_name);
		fly.move();
		assertEquals(move_expected_output, fly.obtainMoveString());
	}
	
	@Test
	void testHasNotEatenAnythingYetExpectedOutput() {
		Fly fly = new Fly(fly_name);
		assertEquals(has_not_eaten_expected_output, fly.obtainCurrentMealLog());
	}

}