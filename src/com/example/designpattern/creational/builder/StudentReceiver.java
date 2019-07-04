package com.example.designpattern.creational.builder;
// Java code to demonstrate need of Builder Pattern 

// Client Side Code
public class StudentReceiver {

	private final Student student = new Student();

	public StudentReceiver() {

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				student.setId(1).setName("Ram").setAddress("Noida");
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				student.setId(2).setName("Shyam").setAddress("Delhi");
			}
		});

		t1.start();
		t2.start();
	}

	public Student getStudent() {
		return student;
	}
}
