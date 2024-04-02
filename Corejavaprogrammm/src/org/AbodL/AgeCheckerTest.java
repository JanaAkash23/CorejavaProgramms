package org.AbodL;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


class AgeCheckerTest {

	@Test
	public void testAbove18() {
		assertEquals("Both students are Above 18.", AgeChecker.checkAge(30, 25));
	}

}
