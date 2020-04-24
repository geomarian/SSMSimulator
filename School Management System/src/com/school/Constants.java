package com.school;

public class Constants extends Main {
	static String msg = "Starting Simulation...";
	static String school = "Sacred Heart convent school";
	static String principle = "Francis Xavier";
	static String peon = "Chandran";

	public void display() throws InterruptedException {
		System.out.println("*********************************");
		System.out.println(msg);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Principle name is::= " + principle);
		Thread.sleep(1000);
		System.out.println("School name is::= " + school);
		System.out.println("Peon name is::= " + peon);
		System.out.println();
		System.out.println("*********************************");
		Thread.sleep(2000);
	}

}
