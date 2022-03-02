package test.java;

import static org.junit.jupiter.api.Assertions.*;
import main.java.*;
import org.junit.jupiter.api.Test;

class BatTesting{
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
	
	private final static String tiger_name;
	private final static String eat_tiger_expected_output;
	private final static String has_eaten_tiger_expected_output;
	
	private final static String move_expected_output;
	private final static String has_not_eaten_expected_output;
	private final static String eat_null_pointer_exception_message;
	private final static String eat_thing_illegal_argument_exception_message;
	
	
	static {
		bat_name = "Shereen";
		eat_bat_expected_output = bat_name + " Bat has just eaten a Bat" ;
		has_eaten_bat_expected_output = bat_name + " Bat has eaten a Bat";
		
		ant_name = "Mary Joy";
		eat_ant_expected_output = bat_name + " Bat has just eaten a Ant" ;
		has_eaten_ant_expected_output = bat_name + " Bat has eaten a Ant";
		
		fly_name = "Joshua";
		eat_fly_expected_output = bat_name + " Bat has just eaten a Fly" ;
		has_eaten_fly_expected_output = bat_name + " Bat has eaten a Fly";
		
		thing_name = "Raymond";
		
		tiger_name = "Andrew";
		eat_tiger_expected_output = bat_name + " Bat has just eaten a Tiger" ;
		has_eaten_tiger_expected_output = bat_name + " Bat has eaten a Tiger";
		
		move_expected_output = bat_name + " Bat is swooping through the dark.";
		has_not_eaten_expected_output = bat_name + " Bat has had nothing to eat!";
		eat_null_pointer_exception_message = "Argument for Creature's eat() method was null";
		eat_thing_illegal_argument_exception_message = "Argument for Bat eat() method was not an instance of the Creature class!";
	}
		
	@Test
	void testEatingAntExpectedOutput() {
		Bat bat = new Bat(bat_name);
		Ant aAnt = new Ant(ant_name);
		bat.eat(aAnt);
		assertEquals(eat_ant_expected_output, bat.obtainCurrentMealLog());
	}
	
	@Test
	void testHasEatenAntExpectedOutput() {
		Bat bat = new Bat(bat_name);
		Ant aAnt = new Ant(ant_name);
		bat.eat(aAnt);
		bat.whatDidYouEat();
		assertEquals(has_eaten_ant_expected_output, bat.obtainCurrentMealLog());
	}
	
	@Test
	void testEatingBatExpectedOutput() {
		Bat bat = new Bat(bat_name);
		Bat aBat = new Bat(bat_name);
		bat.eat(aBat);
		assertEquals(eat_bat_expected_output, bat.obtainCurrentMealLog());
	}
	
	@Test
	void testHasEatenBatExpectedOutput() {
		Bat bat = new Bat(bat_name);
		Bat aBat = new Bat(bat_name);
		bat.eat(aBat);
		bat.whatDidYouEat();
		assertEquals(has_eaten_bat_expected_output, bat.obtainCurrentMealLog());
	}
	
	@Test
	void testEatingFlyExpectedOutput() {
		Bat bat = new Bat(bat_name);
		Fly aFly = new Fly(fly_name);
		bat.eat(aFly);
		assertEquals(eat_fly_expected_output, bat.obtainCurrentMealLog());
	}
	
	@Test
	void testHasEatenFlyExpectedOutput() {
		Bat bat = new Bat(bat_name);
		Fly aFly = new Fly(fly_name);
		bat.eat(aFly);
		bat.whatDidYouEat();
		assertEquals(has_eaten_fly_expected_output, bat.obtainCurrentMealLog());
	}
	
	@Test
	void testEatingTigerExpectedOutput() {
		Bat bat = new Bat(bat_name);
		Tiger aTiger = new Tiger(tiger_name);
		bat.eat(aTiger);
		assertEquals(eat_tiger_expected_output, bat.obtainCurrentMealLog());
	}
	
	@Test
	void testHasEatenTigerExpectedOutput() {
		Bat bat = new Bat(bat_name);
		Tiger aTiger = new Tiger(tiger_name);
		bat.eat(aTiger);
		bat.whatDidYouEat();
		assertEquals(has_eaten_tiger_expected_output, bat.obtainCurrentMealLog());
	}
	
	@Test
	void testEatingNothingNullPointerExceptionShouldBeThrown() {
		Bat bat = new Bat(bat_name);
		Exception exception = assertThrows(NullPointerException.class, () -> bat.eat(null));
		assertEquals(eat_null_pointer_exception_message, exception.getMessage());
	}
	
	@Test
	void testEatingThingIllegalArgumentExceptionShouldBeThrown() {
		Bat bat = new Bat(bat_name);
		Exception exception = assertThrows(IllegalArgumentException.class, () -> bat.eat(new Thing(thing_name)));
		assertEquals(eat_thing_illegal_argument_exception_message, exception.getMessage());
	}
	
	@Test
	void testMovingExpectedOutput() {
		Bat bat = new Bat(bat_name);
		bat.move();
		assertEquals(move_expected_output, bat.obtainMoveString());
	}
	
	@Test
	void testFlyingExpectedOutput() {
		Bat bat = new Bat(bat_name);
		bat.fly();
		assertEquals(move_expected_output, bat.obtainMoveString());
	}
	
	@Test
	void testHasNotEatenAnythingYetExpectedOutput() {
		Bat bat = new Bat(bat_name);
		assertEquals(has_not_eaten_expected_output, bat.obtainCurrentMealLog());
	}


}