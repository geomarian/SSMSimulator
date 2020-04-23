package com.school;

public class Constants extends Main {
	static String school = "Sacred Heart convent school";
	static String principle = "Francis Xavier";
	static String peon = "Chandran";

	public void display() {
		System.out.println("*********************************");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Principle name is::= " + principle);
		System.out.println("School name is::= " + school);
		System.out.println("Peon name is::= " + peon);
		System.out.println();
		System.out.println("*********************************");
	}

}
