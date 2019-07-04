package com.example.designpattern.creational.prototype;

import java.util.List;

public class ImplementorClass {
	public static void main(String[] args) {
		UserDetails users = new UserDetails();

		users.getUsers(); // load default users from Service/DAO

		// Use the clone method to get the Employee object
		UserDetails usersNew;
		try {
			usersNew = (UserDetails) users.clone();
			UserDetails usersNew1 = (UserDetails) users.clone();

			List<User> list = usersNew.getUsersList();
			list.add(new User("Tim", "tim@gmail.com"));

			List<User> list1 = usersNew1.getUsersList();
			list1.remove(new User("steve", "steve@gmail.com"));

			System.out.println("Default object users List: " + users.getUsersList());
			System.out.println("\nClone1-UsersNew List: " + list);
			System.out.println("\nUsersNew1 List: " + list1);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}
}