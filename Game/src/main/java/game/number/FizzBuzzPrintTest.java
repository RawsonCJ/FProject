package game.number;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzPrintTest {
	FizzBuzzPrint fizzBuzz = new FizzBuzzPrint();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testMultiplesThreeOrFive() {
		fizzBuzz.multiplesThreeOrFive();
	}

	@Test
	public void testDivisibleOrIncludeThreeOrFive() {
		fizzBuzz.divisibleOrIncludeThreeOrFive();
	}

}
