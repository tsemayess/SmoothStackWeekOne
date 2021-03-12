package com.smoothstack.dayfive.assignmentthree;

public class Producer extends Thread {

	Integer value;
	Producer (int value) {
		this.value = value;
	}
	
	public void run() {
		Buffer buffer = Buffer.getBuffer();
		buffer.put(value);
	}

}
