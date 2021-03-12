package com.smoothstack.dayfour.assignmentone;

public class Singleton {

	volatile public static Singleton instance = null;

	public static Singleton getInstance() {

		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}

		return instance;
	}

}
