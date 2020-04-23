package com.school;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Class10 implements Subfor10 {
	int marks;

	private String Teacher = "Mrs. Leena D'Souza";

	public String getTeacher() {
		return Teacher;
	}

	public void setTeacher(String teacher) {
		Teacher = teacher;
	}

	String Teacher2 = "Mellow";

	@Override
	public void Biology() {
		// TODO Auto-generated method stub
		String s1 = "Zuber";
		System.out.println("My name is: " + s1);
		System.out.println("I have Biology subject");
		System.out.println();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void ComputerApplication() {
		// TODO Auto-generated method stub
		String s1 = "Jannat";
		System.out.println("My name is: " + s1);
		System.out.println("I have ComputerApplication subject");
		System.out.println();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void Android() {
		// TODO Auto-generated method stub
		String s1 = "Marina";
		System.out.println("My name is: " + s1);
		System.out.println("I have Android subject");
		System.out.println();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void IT() {
		// TODO Auto-generated method stub
		String s1 = "Shairin";
		System.out.println("My name is: " + s1);
		System.out.println("I have IT subject");
		System.out.println();
		System.out.println();
	}

	public List<String> Class10() {

		HashMap<String, Integer> eid = new HashMap<String, Integer>();
		eid.put("id", 100);
		eid.put("id1", 1001);
		System.out.println("hashmap");
		return null;
	}
}
