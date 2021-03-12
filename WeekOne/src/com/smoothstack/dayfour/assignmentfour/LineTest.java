package com.smoothstack.dayfour.assignmentfour;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LineTest {

	private Line l1 = new Line(0, 0, 1, 2);
	private Line l2 = new Line(1, 1, 4, 4);
	private Line l3 = new Line(-1, 1, 2, 4);
	private Line l4 = new Line(0, 0, 3, 4);

	@Test
	public void getSlope() {
		assertEquals(2, l1.getSlope(), 0.0001);
	}

	@Test(expected = ArithmeticException.class)
	public void getSlopeException() {
		Line l = new Line(1, 6, 1, 5);
		l.getSlope();
	}

	@Test
	public void getDistance() {
		assertEquals(5, l4.getDistance(), 0.0001);
		assertEquals(Math.sqrt(1 * 1 + 2 * 2), l1.getDistance(), 0.0000001);
	}

	@Test
	public void parallelToHP() {
		assertEquals(true, l2.parallelTo(l3));
	}

	@Test
	public void parallelToSP() {
		assertEquals(false, l3.parallelTo(l1));
	}

}
