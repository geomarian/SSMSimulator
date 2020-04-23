package com.school;

import java.util.Arrays;

public class Class7 implements Subfor7 {

	// int[] rollNo = {1, 2, 3, 4,5};
	public void Stud() {
		{
			String students[] = { "Azhar", "Neil", "Nitin", "Mukesh" };
			String stArg = Arrays.toString(students);
			
			
			String teacher[] = { "Mrs. Kavya Madhavan" };
			String stTea = Arrays.toString(teacher);
			// for(int i =0; i<=students.length; i ++) {
			System.out.println("Class 7th Students are: " + stArg);
			System.out.println("Teacher name is: " + stTea);
			// System.out.println(Arrays.toString(students[]));
			System.out.println("We are students of class 7th standard");

			System.out.println("_____________________________________________________");
		}
	}
//	for(int j=0; j<=rollNo.length; j++) {
//		System.out.println(rollNo[j]);
//	}

	@Override
	public void History() throws InterruptedException {
		// TODO Auto-generated method stub
		String s1[] = { "Azhar" };
		int num1[] = { 1 };
		String stArg = Arrays.toString(s1);
		System.out.println("My name is " + stArg);
		String stNum1 = Arrays.toString(num1);
		System.out.println("Roll number is: " + stNum1);

		System.out.println("I have History subject");
		System.out.println();
		Thread.sleep(2000);

	}

	@Override
	public void Geography() {
		// TODO Auto-generated method stub
		String s1[] = { "Neil" };
		int num2[] = { 2 };

		String stArg = Arrays.toString(s1);
		System.out.println("My name is " + stArg);

		String stNum2 = Arrays.toString(num2);
		System.out.println("Roll number is: " + stNum2);

		System.out.println("I have Geography subject");
		System.out.println();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void Marathi() throws InterruptedException {
		// TODO Auto-generated method stub
		String s1[] = { "Nitin" };
		int num3[] = { 3 };

		String stArg = Arrays.toString(s1);
		System.out.println("My name is " + stArg);

		String stNum3 = Arrays.toString(num3);
		System.out.println("Roll number is: " + stNum3);

		System.out.println("I have Marathi subject");
		System.out.println();
		Thread.sleep(2000);
	}

	@Override
	public void Malayalam() {
		// TODO Auto-generated method stub
		String s1[] = { "Mukesh" };
		int num4[] = { 4 };

		String stArg = Arrays.toString(s1);
		System.out.println("My name is " + stArg);
		String stNum4 = Arrays.toString(num4);
		System.out.println("Roll number is: " + stNum4);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("I have Malayalam subject");
		System.out.println();

	}

}
