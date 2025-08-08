package day11;

import static org.junit.Assert.*;

import org.junit.Test;

public class calculatorTest {

	@Test
	public void testAdd() {
		calculator c1 = new calculator();
		assertEquals(5, c1.add(2, 3));
	}

	@Test
	public void testSub() {
		calculator c1 = new calculator();
		assertEquals(-1, c1.sub(2, 3));
	}

}
