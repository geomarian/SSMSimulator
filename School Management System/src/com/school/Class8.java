package com.school;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Class8 implements Subfor8 {

	int marks;

	private String Teacher = "Mrs. Fernandis";
	String Teacher2 = "Mellow";

	public String getTeacher() {
		return Teacher;
	}

	public void setTeacher(String Teacher) {
		this.Teacher = Teacher;

	}

	// final Random random = new Random();

	public void GK() {

		// TODO Auto-generated method stub
		String s1 = "Bilal";
		System.out.println("My name is: " + s1);
		System.out.println("I have GK subject");

	}

	public void English() {
		// TODO Auto-generated method stub
		String s2 = "Kamlesh";
		System.out.println("My name is: " + s2);
		System.out.println("I have English subject");

	}

	public void PT() {
		// TODO Auto-generated method stub
		String s3 = "Junaid";
		System.out.println("My name is: " + s3);
		System.out.println("I have PT subject");

	}

	public void Hindi() {
		// TODO Auto-generated method stub
		String s4 = "Sana";
		System.out.println("My name is: " + s4);
		System.out.println("I have Hindi subject");
	}

	public List<String> Class8() {
		ArrayList<String> word = new ArrayList<String>();
		System.out.println(" New Students added");

		word.add("New GOne");

		word.add("New RaOne");

		word.add("New Mickeal");
		System.out.println();
		System.out.println(word);
		System.out.println();
		try {
				Thread.sleep(4000);
		} 	
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		word.remove("New GOne");
		System.out.println();
		System.out.println(word);

		System.out.println("GOne student removed");
		System.out.println();

		word.add("New Jackson");
		System.out.println();
//		for (String name: word) {
//			System.out.println(name);
//		}
		System.out.println();
		// will iterate & will show in array
		Iterator<String> it = word.iterator();

		// will show all Data together
		while (it.hasNext()) {
			System.out.println("Show all data : ");
			System.out.println(it.next());
		}
		return word;
	}

	@Override
	public void ArrayList() {
		// TODO Auto-generated method stub

	}
}
