package test.java;

import static org.junit.jupiter.api.Assertions.*;
import main.java.*;
import org.junit.jupiter.api.Test;

public class AntTesting{
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
	
	private final static String move_expcted_output;
	private final static String has_not_eaten_expected_output;
	private final static String eat_null_pointer_exception_message;
		
	static {
		ant_name = "Antman";
		eat_ant_expected_output = ant_name+ " Ant has just eaten a Ant" ;
		has_eaten_ant_expected_output = ant_name + " Ant has eaten a Ant";
		
		bat_name = "Batman";
		eat_bat_expected_output = ant_name + " Ant has just eaten a Bat" ;
		has_eaten_bat_expected_output = ant_name + " Ant has eaten a Bat";
		
		fly_name = "Flyman";
		eat_fly_expected_output = ant_name + " Ant has just eaten a Fly" ;
		has_eaten_fly_expected_output = ant_name + " Ant has eaten a Fly";
		
		thing_name = "Thingman";
		eat_thing_expected_output = ant_name + " Ant has just eaten a Thing" ;
		has_eaten_thing_expected_output = ant_name + " Ant has eaten a Thing";
		
		tiger_name = "Tigerman";
		eat_tiger_expected_output = ant_name + " Ant has just eaten a Tiger" ;
		has_eaten_tiger_expected_output = ant_name + " Ant has eaten a Tiger";
		
		move_expcted_output = ant_name + " Ant is crawling around.";
		has_not_eaten_expected_output = ant_name + " Ant has had nothing to eat!";
		eat_null_pointer_exception_message = "Argument for Creature's eat() method was null";
	}
		
	@Test
	public void testEatingAntExpectedOutput() {
		Ant ant = new Ant(ant_name);
		Ant aAnt = new Ant(ant_name);
		ant.eat(aAnt);
		assertEquals(eat_ant_expected_output, ant.obtainCurrentMealLog());
	}
	
	@Test
	public void testHasEatenAntExpectedOutput() {
		Ant ant = new Ant(ant_name);
		Ant aAnt = new Ant(ant_name);
		ant.eat(aAnt);
		ant.whatDidYouEat();
		assertEquals(has_eaten_ant_expected_output, ant.obtainCurrentMealLog());
	}
	
	@Test
	public void testEatingBatExpectedOutput() {
		Ant ant = new Ant(ant_name);
		Bat aBat = new Bat(bat_name);
		ant.eat(aBat);
		assertEquals(eat_bat_expected_output, ant.obtainCurrentMealLog());
	}
	
	@Test
	public void testHasEatenBatExpectedOutput() {
		Ant ant = new Ant(ant_name);
		Bat aBat = new Bat(bat_name);
		ant.eat(aBat);
		ant.whatDidYouEat();
		assertEquals(has_eaten_bat_expected_output, ant.obtainCurrentMealLog());
	}
	
	@Test
	public void testEatingFlyExpectedOutput() {
		Ant ant = new Ant(ant_name);
		Fly aFly = new Fly(fly_name);
		ant.eat(aFly);
		assertEquals(eat_fly_expected_output, ant.obtainCurrentMealLog());
	}
	
	@Test
	public void testHasEatenFlyExpectedOutput() {
		Ant ant = new Ant(ant_name);
		Fly aFly = new Fly(fly_name);
		ant.eat(aFly);
		ant.whatDidYouEat();
		assertEquals(has_eaten_fly_expected_output, ant.obtainCurrentMealLog());
	}
	
	@Test
	public void testEatingThingExpectedOutput() {
		Ant ant = new Ant(ant_name);
		Thing aThing = new Thing(thing_name);
		ant.eat(aThing);
		assertEquals(eat_thing_expected_output, ant.obtainCurrentMealLog());
	}
	
	@Test
	public void testHasEatenThingExpectedOutput() {
		Ant ant = new Ant(ant_name);
		Thing aThing = new Thing(thing_name);
		ant.eat(aThing);
		ant.whatDidYouEat();
		assertEquals(has_eaten_thing_expected_output, ant.obtainCurrentMealLog());
	}
	
	@Test
	public void testEatingTigerExpectedOutput() {
		Ant ant = new Ant(ant_name);
		Tiger aTiger = new Tiger(tiger_name);
		ant.eat(aTiger);
		assertEquals(eat_tiger_expected_output, ant.obtainCurrentMealLog());
	}
	
	@Test
	public void testHasEatenTigerExpectedOutput() {
		Ant ant = new Ant(ant_name);
		Tiger aTiger = new Tiger(tiger_name);
		ant.eat(aTiger);
		ant.whatDidYouEat();
		assertEquals(has_eaten_tiger_expected_output, ant.obtainCurrentMealLog());
	}
	
	@Test
	public void testEatingNothingNullPointerExceptionShouldBeThrown() {
		Ant ant = new Ant(ant_name);
		Exception exception = assertThrows(NullPointerException.class, () -> ant.eat(null));
		assertEquals(eat_null_pointer_exception_message, exception.getMessage());
	}
	
	@Test
	public void testMovingExpectedOutput() {
		Ant ant = new Ant(ant_name);
		ant.move();
		assertEquals(move_expcted_output, ant.getMoveString());
	}
	
	@Test
	public void testHasNotEatenAnythingYetExpectedOutput() {
		Ant ant = new Ant(ant_name);
		assertEquals(has_not_eaten_expected_output, ant.obtainCurrentMealLog());
	}


}