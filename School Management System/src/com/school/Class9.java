package com.school;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Class9 implements Subfor9 {

	public void Stud() {
		// TODO Auto-generated method stub

		{
			String students[] = { "Neha", "Yuga", "Mohsin", "Abish" };
			String stArg = Arrays.toString(students);

			String teacher[] = { "Mrs. Hassena Kazi" };
			String stTea = Arrays.toString(teacher);
			// for(int i =0; i<=students.length; i ++) {
			System.out.println("Class 9th Students are: " + stArg);
			System.out.println("Teacher name is: " + stTea);
			// System.out.println(Arrays.toString(students[]));
			System.out.println("We are students of class 9th standard");

			System.out.println("_____________________________________________________");
		}
	}

	// It will show all details with Students & Results altogether

	public void Physics() {
		// TODO Auto-generated method stub
		String s1[] = { "Neha" };
		int num1[] = { 9 };
		String stArg = Arrays.toString(s1);
		System.out.println("My name is " + stArg);
		String stNum1 = Arrays.toString(num1);
		System.out.println("Roll number is: " + stNum1);

		System.out.println("I have Physics subject");
		System.out.println();
		System.out.println();
		for (int k = 0; k == 0; k++) {
			int num12 = random.nextInt(100);
			long k1 = TimeUnit.MILLISECONDS.toSeconds(k);

			System.out.println("Time required = " + k1 + " (in Seconds)");
			System.out.println("Score is: " + num12);

			int marks2 = num12;

			if (marks2 < 50) {
				System.out.println("Neha is failed");
			} else if (marks2 >= 50 && marks2 < 60) {
				System.out.println(" Neha has Passed got D grade");
			}
			// --
			else if (marks2 >= 60 && marks2 < 70) {
				System.out.println("Neha has  Passed got C grade");
			} else if (marks2 >= 70 && marks2 < 80) {
				System.out.println("Neha has Passed got B grade");
			} else if (marks2 >= 80 && marks2 < 90) {
				System.out.println("Neha has Passed got A grade");
			} else if (marks2 >= 90 && marks2 < 100) {
				System.out.println("Neha has Passed got O grade");
			} else {
				System.out.println("Invalid!");
			}
		}
		System.out.println();

	}

	public void Chemistry() {
		// TODO Auto-generated method stub
		String s1[] = { "yuga" };
		int num1[] = { 10 };
		String stArg = Arrays.toString(s1);
		System.out.println("My name is " + stArg);
		String stNum1 = Arrays.toString(num1);
		System.out.println("Roll number is: " + stNum1);

		System.out.println("I have Chemistry subject");
		System.out.println();
		System.out.println();
		for (int k = 0; k == 0; k++) {
			int num11 = random.nextInt(100);
			long k1 = TimeUnit.MILLISECONDS.toSeconds(k);

			System.out.println("Time required = " + k1 + " (in Seconds)");
			System.out.println("Score is: " + num11);

			int marks2 = num11;

			if (marks2 < 50) {
				System.out.println("yuga is failed");
			} else if (marks2 >= 50 && marks2 < 60) {
				System.out.println(" yuga has Passed got D grade");
			}
			// --
			else if (marks2 >= 60 && marks2 < 70) {
				System.out.println("yuga has  Passed got C grade");
			} else if (marks2 >= 70 && marks2 < 80) {
				System.out.println("yuga has Passed got B grade");
			} else if (marks2 >= 80 && marks2 < 90) {
				System.out.println("yuga has Passed got A grade");
			} else if (marks2 >= 90 && marks2 < 100) {
				System.out.println("yuga has Passed got O grade");
			} else {
				System.out.println("Invalid!");
			}
		}
		System.out.println();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void Maths() {
		// TODO Auto-generated method stub
		String s1[] = { "Mohsin" };
		int num1[] = { 11 };
		String stArg = Arrays.toString(s1);
		System.out.println("My name is " + stArg);
		String stNum1 = Arrays.toString(num1);
		System.out.println("Roll number is: " + stNum1);

		System.out.println("I have Maths subject");
		System.out.println();

		System.out.println();
		for (int k = 0; k == 0; k++) {
			int num13 = random.nextInt(100);
			long k1 = TimeUnit.MILLISECONDS.toSeconds(k);

			System.out.println("Time required = " + k1 + " (in Seconds)");
			System.out.println("Score is: " + num13);

			int marks2 = num13;

			if (marks2 < 50) {
				System.out.println("Mohsin is failed");
			} else if (marks2 >= 50 && marks2 < 60) {
				System.out.println(" Mohsin has Passed got D grade");
			}
			// --
			else if (marks2 >= 60 && marks2 < 70) {
				System.out.println("Mohsin has  Passed got C grade");
			} else if (marks2 >= 70 && marks2 < 80) {
				System.out.println("Mohsin has Passed got B grade");
			} else if (marks2 >= 80 && marks2 < 90) {
				System.out.println("Mohsin has Passed got A grade");
			} else if (marks2 >= 90 && marks2 < 100) {
				System.out.println("Mohsin has Passed got O grade");
			} else {
				System.out.println("Invalid!");
			}
		}
		System.out.println();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void Drawing() {
		// TODO Auto-generated method stub
		String s1[] = { "Abish" };
		int num1[] = { 12 };
		String stArg = Arrays.toString(s1);
		System.out.println("My name is " + stArg);
		String stNum1 = Arrays.toString(num1);
		System.out.println("Roll number is: " + stNum1);

		System.out.println("I have Drawing subject");
		System.out.println();
		for (int k = 0; k == 0; k++) {
			int num11 = random.nextInt(100);
			long k1 = TimeUnit.MILLISECONDS.toSeconds(k);

			System.out.println("Time required = " + k1 + " (in Seconds)");
			System.out.println("Score is: " + num11);

			int marks2 = num11;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (marks2 < 50) {
				System.out.println("Abish is failed");
			} else if (marks2 >= 50 && marks2 < 60) {
				System.out.println(" Abish has Passed got D grade");
			}
			// --
			else if (marks2 >= 60 && marks2 < 70) {
				System.out.println("Abish has  Passed got C grade");
			} else if (marks2 >= 70 && marks2 < 80) {
				System.out.println("Abish has Passed got B grade");
			} else if (marks2 >= 80 && marks2 < 90) {
				System.out.println("Abish has Passed got A grade");
			} else if (marks2 >= 90 && marks2 < 100) {
				System.out.println("Abish has Passed got O grade");
			} else {
				System.out.println("Invalid!");
			}
		}
		System.out.println();

	}

}
