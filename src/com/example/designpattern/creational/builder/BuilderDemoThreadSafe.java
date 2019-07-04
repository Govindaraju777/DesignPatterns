package com.example.designpattern.creational.builder;
// Java code to demonstrate Builder Pattern 

// Server Side Code 
final class StudentThreadSafe {

	// final instance fields
	private final int id;
	private final String name;
	private final String address;

	public StudentThreadSafe(BuilderThreadSafe builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.address = builder.address;
	}

	// Static class Builder
	public static class BuilderThreadSafe {

		/// instance fields
		private int id;
		private String name;
		private String address;

		public static BuilderThreadSafe newInstance() {
			return new BuilderThreadSafe();
		}

		private BuilderThreadSafe() {
		}

		// Setter methods
		public BuilderThreadSafe setId(int id) {
			this.id = id;
			return this;
		}

		public BuilderThreadSafe setName(String name) {
			this.name = name;
			return this;
		}

		public BuilderThreadSafe setAddress(String address) {
			this.address = address;
			return this;
		}

		// build method to deal with outer class
		// to return outer instance
		public StudentThreadSafe build() {
			return new StudentThreadSafe(this);
		}
	}

	@Override
	public String toString() {
		return "id = " + this.id + ", name = " + this.name + ", address = " + this.address;
	}
}

// Client Side Code
class StudentReceiverThreadSafe {

	// volatile student instance to ensure visibility
	// of shared reference to immutable objects
	private volatile StudentThreadSafe student;

	public StudentReceiverThreadSafe() {

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				student = StudentThreadSafe.BuilderThreadSafe.newInstance().setId(1).setName("Ram").setAddress("Noida").build();
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				student = StudentThreadSafe.BuilderThreadSafe.newInstance().setId(2).setName("Shyam").setAddress("Delhi").build();
			}
		});

		t1.start();
		t2.start();
	}

	public StudentThreadSafe getStudent() {
		return student;
	}
}

// Driver class
public class BuilderDemoThreadSafe {
	public static void main(String args[]) {
		for (int i = 0; i <=10; i++) {
			StudentReceiver sr = new StudentReceiver();
			System.out.println(sr.getStudent());
		}

	}
}
