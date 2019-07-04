package com.example.designpattern.creational.prototype;

public class User {
	String name;
	String email;

	public User(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String toString() {
		return "\n Name of user:" + this.name + "\tEmail of User:" + this.email;
	}
}