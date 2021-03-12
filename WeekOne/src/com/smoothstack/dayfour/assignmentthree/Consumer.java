package com.smoothstack.dayfour.assignmentthree;

public class Consumer extends Thread {

	Integer index;
	Consumer (int index) {
		this.index = index;
	}
	public void run() {

		Buffer buffer = Buffer.getBuffer();
		buffer.remove(index);
		
	}

}
