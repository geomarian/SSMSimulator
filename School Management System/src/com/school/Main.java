package com.school;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method
		Constants c = new Constants();
		c.display();

		// Details of class 7th
		Subfor7 sub7 = new Class7();
		sub7.History();
		sub7.Geography();
		sub7.Marathi();
		sub7.Malayalam();
		sub7.Stud();

		System.out.println("Class 7 finished.");
		System.out.println();
		System.out.println("---------------");
		Thread.sleep(1000);
		// Details of class 8 - Private access
		System.out.println("Entering Class 8 standard");
		System.out.println("____");
		Thread.sleep(1000);
		Class8 eight = new Class8();

		// __________
		List<String> word = eight.Class8();
		System.out.println(word);

		// ________
		System.out.println("-----------");
		System.out.println("-----------");
		System.out.println("Class 8 teacher is: " + eight.getTeacher());
		System.out.println("-----------");
		Thread.sleep(2000);
		Subfor8 sub8 = new Class8();
		sub8.English();
		sub8.Hindi();
		sub8.GK();
		sub8.PT();
		// sub8.results();
		Thread.sleep(2000);
		ShowResults10 sr = new ShowResults10();
		sr.results1();

		System.out.println();
		System.out.println("-----------");
		System.out.println("Entering Class 9 standard");
		Class9 c9 = new Class9();
		c9.Stud();
		c9.Chemistry();
		c9.Drawing();
		c9.Maths();
		c9.Physics();
		ShowResults8 sr8 = new ShowResults8();
		sr8.results2();
		Thread.sleep(2000);

		System.out.println();
		System.out.println("-----------");
		System.out.println("Entering Class 10 standard");
		Class10 c10 = new Class10();
		c10.Biology();
		c10.ComputerApplication();
		c10.IT();
		c10.Android();
		// c10.results();
		Thread.sleep(2000);
		ShowResults10 sr10 = new ShowResults10();
		sr10.results1();
		c10.hashCode();

//		List<String> eid = (List<String>) new Class10();
//		System.out.println(eid);

		ArrayList<String> studen = new ArrayList<String>();
		// studen.addAll(studen);
		studen.add("Alia");
		studen.add("Deepika");
		System.out.println(studen);
		System.out.println("2 students added successfully");
		studen.remove(0);
		System.out.println(studen);
		System.out.println("1 student removed");

		Thread.sleep(2000);
		System.out.println();
		System.out.println("New School is beign added");
		// studen.add(stu2);
		List<String> school = new ArrayList<String>();
		school.add("GGPS");
		System.out.println(school);
		System.out.println("New school added");
		System.out.println();
		// 1
		Thread.sleep(2000);
		List<Integer> class12 = new ArrayList<Integer>();
		System.out.println("New Class added");
		class12.add(12);
		class12.add(13);
		System.out.println(class12);

		Thread.sleep(2000);
		class12.remove(0);
		System.out.println();
		System.out.println("Class 12 removed");
		System.out.println(class12);
		System.out.println("*****");

		// 2
		List<String> Hm = new ArrayList<String>();
		Hm.add("Kishor Sir");
		Hm.add("Niranjan sir");
		Thread.sleep(2000);
		System.out.println(Hm);
		System.out.println("New Staff added");
		System.out.println();
		Hm.remove("Kishor Sir");
		System.out.println("Kishor is removed");
		System.out.println(Hm);
		System.out.println("-*******-");
		System.out.println();
		List<Boolean> tf = new ArrayList<Boolean>();
		tf.add(true); // 4
		System.out.println(tf);
		System.out.println("All Data Added & Removed");
		System.out.println();

		for (Integer name : class12) {
			System.out.println("Remaining class ");
			class12.parallelStream();
			System.out.println("## " + name);
		}
		System.out.println();
		// will iterate & will show in array
		Iterator<String> it = Hm.iterator();

		// will show all Data together
		while (it.hasNext()) {
			System.out.println("Show remaining Staff : ");
			System.out.println(it.next());
			System.out.println("## " + Hm);
			Thread.sleep(3000);
			System.out.println();
			System.out.println(" ********** ");
			System.out.println(" ********** ");
			System.out.println(" ********** ");
			System.out.println();
			System.out.println(" Simulation of School Management System is Completed successfully!!! ");

		}

	}

}
