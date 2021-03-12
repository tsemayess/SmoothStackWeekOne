/**
 * 
 */
package com.smoothstack.dayfive.assignmenttwo;

/**
 * @author Tsemaye
 *
 */
public class Engine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer numApples = 0;
		Integer numBananas = 0;

		Runnable applesBananas = new Runnable() {

			@Override
			public void run() {
				try {
					synchronized (numApples) {
						Thread.sleep(100);
						synchronized (numBananas) {
							System.out.println("Number of Apples: " + numApples + "\tNumber of Bananas: " + numBananas);
						}
					}
				} catch (Exception e) {
					System.out.println("Could not get number of apples and bananas");

				}

			}

		};

		Runnable bananasApples = new Runnable() {

			@Override
			public void run() {
				try {
					synchronized (numBananas) {
						Thread.sleep(100);
						synchronized (numApples) {
							System.out.println("Number of Bananas: " + numBananas + "\tNumber of Apples: " + numApples);
						}
					}
				} catch (Exception e) {
					System.out.println("Could not get number of bananas and apples");

				}

			}

		};
		
		Thread apples = new Thread(applesBananas);
		Thread bananas = new Thread(bananasApples);
		
		
		
		apples.start();
		bananas.start();
				
		System.out.println("In deadlock?");

	}

}
