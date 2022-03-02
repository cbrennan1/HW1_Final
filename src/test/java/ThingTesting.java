package test.java;

import static org.junit.jupiter.api.Assertions.*;
import main.java.*;

import org.junit.jupiter.api.Test;

class ThingTesting{
	// String fixtures
	private final static String THING_NAME;
	private final static String TO_STRING_EXPECTED_OUTPUT;

	static {
		THING_NAME = "Thingman";
		TO_STRING_EXPECTED_OUTPUT = THING_NAME;
	}
	
	@Test
	public void testToString() {
		Thing thing = new Thing(THING_NAME);
		assertEquals(TO_STRING_EXPECTED_OUTPUT, thing.toString());
	}

}