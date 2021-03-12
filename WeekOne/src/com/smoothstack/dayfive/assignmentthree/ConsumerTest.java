package com.smoothstack.dayfive.assignmentthree;


import org.junit.Test;

public class ConsumerTest {
	Buffer b = Buffer.getBuffer();
	
	@Test (expected = IndexOutOfBoundsException.class)
	public void run() {
		int startSize = Buffer.getBuffer().getSize();
		Consumer p = new Consumer(startSize - 1);
		p.start();
		
		while (p.isAlive()) {}
		
		 b.get(startSize - 1);
	}

}
