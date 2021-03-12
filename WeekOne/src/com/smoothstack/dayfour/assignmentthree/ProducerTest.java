package com.smoothstack.dayfour.assignmentthree;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProducerTest {
	Buffer b = Buffer.getBuffer();
	
	@Test
	public void run() {
		Producer p = new Producer(5);
		p.start();
		
		while (p.isAlive()) {}
		
		assertEquals(5, b.get(b.getSize() - 1));
	}

}
