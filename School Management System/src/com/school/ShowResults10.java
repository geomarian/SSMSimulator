package com.school;

import java.util.concurrent.TimeUnit;

public class ShowResults10 extends Class10 {

	public void results1() throws InterruptedException {

		String s1 = "Zuber";
		String s2 = "Jannat";
		String s3 = "Marina";
		String s4 = "Shairin";

		System.out.println("____________________");
		System.out.println("Below are Class 10th Results");
		// String Teacher2;
		System.out.println();
		for (int i = 0; i == 0; i++) {
			int num = random.nextInt(100);
			long i1 = TimeUnit.MILLISECONDS.toSeconds(i);

			System.out.println("Time required = " + i1 + " (in Seconds)");

			System.out.println(s1 + "Score is: " + num);

			int marks = num;

			if (marks < 50) {
				System.out.println("Zuber is failed");
			} else if (marks >= 50 && marks < 60) {
				System.out.println(" Zuber has Passed got D grade");
			}

			else if (marks >= 60 && marks < 70) {
				System.out.println("Zuber has Passed got C grade");
			} else if (marks >= 70 && marks < 80) {
				System.out.println("Zuber has Passed got B grade");
			} else if (marks >= 80 && marks < 90) {
				System.out.println("Zuber has Passed got A grade");
			} else if (marks >= 90 && marks < 100) {
				System.out.println("Zuber has Passed got O grade");
			} else {
				System.out.println("Invalid!");

				System.out.println();
			}
			Thread.sleep(2000);
			for (int j = 0; j == 0; j++) {
				int num1 = random.nextInt(100);
				long j1 = TimeUnit.MILLISECONDS.toSeconds(j);
				System.out.println();
				System.out.println("Time required = " + j1 + " (in Seconds)");
				System.out.println(s2 + "Score is: " + num1);

				int marks1 = num1;

				if (marks1 < 50) {
					System.out.println("Jannat is failed");
				} else if (marks1 >= 50 && marks1 < 60) {
					System.out.println(" Jannat has Passed got D grade");
				}
				// --
				else if (marks1 >= 60 && marks1 < 70) {
					System.out.println("Jannat has Passed got C grade");
				} else if (marks1 >= 70 && marks1 < 80) {
					System.out.println("Jannat has Passed got B grade");
				} else if (marks1 >= 80 && marks1 < 90) {
					System.out.println("Jannat has Passed got A grade");
				} else if (marks1 >= 90 && marks1 < 100) {
					System.out.println("Jannat has Passed got O grade");
				} else {
					System.out.println("Invalid!");
				}
			}
			System.out.println();
			Thread.sleep(2000);
			// System.out.println(Teacher2 + "Score is:" + num);

			for (int k = 0; k == 0; k++) {
				int num2 = random.nextInt(100);
				long k1 = TimeUnit.MILLISECONDS.toSeconds(k);

				System.out.println("Time required = " + k1 + " (in Seconds)");
				System.out.println(s3 + "Score is: " + num2);

				int marks2 = num2;

				if (marks2 < 50) {
					System.out.println("Marina is failed");
				} else if (marks2 >= 50 && marks2 < 60) {
					System.out.println(" Marina has Passed got D grade");
				}
				// --
				else if (marks2 >= 60 && marks2 < 70) {
					System.out.println("Marina has  Passed got C grade");
				} else if (marks2 >= 70 && marks2 < 80) {
					System.out.println("Marina has Passed got B grade");
				} else if (marks2 >= 80 && marks2 < 90) {
					System.out.println("Marina has Passed got A grade");
				} else if (marks2 >= 90 && marks2 < 100) {
					System.out.println("Marina has Passed got O grade");
				} else {
					System.out.println("Invalid!");
				}
			}
			System.out.println();
			Thread.sleep(2000);
			for (int l = 0; l == 0; l++) {
				int num3 = random.nextInt(100);
				long l1 = TimeUnit.MILLISECONDS.toSeconds(l);

				System.out.println("Time required = " + l1 + " (in Seconds)");
				System.out.println(s4 + "Score is: " + num3);

				int marks3 = num3;

				if (marks3 < 50) {
					System.out.println("Shairin is failed");
				} else if (marks3 >= 50 && marks3 < 60) {
					System.out.println(" Shairin has Passed got D grade");
				}
				// --
				else if (marks3 >= 60 && marks3 < 70) {
					System.out.println("Shairin has Passed got C grade");
				} else if (marks3 >= 70 && marks3 < 80) {
					System.out.println("Shairin has Passed got B grade");
				} else if (marks3 >= 80 && marks3 < 90) {
					System.out.println("Shairin has Passed got A grade");
				} else if (marks3 >= 90 && marks3 < 100) {
					System.out.println("Shairin has Passed got O grade");
				} else {
					System.out.println("Invalid!");
				}
			}
			System.out.println();
		}

	}

}
