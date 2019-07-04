package com.example.designpattern.structural;


//https://www.geeksforgeeks.org/facade-design-pattern-introduction/

/*
 * A single class that represent the entire sub system.
 * Example : 
 * 	Evnet manager
 * 	 - I want to organize event - invite, food.....
 * 
 * 	 In Java, the interface JDBC can be called a facade because, we as users or clients create connection using the “java.sql.Connection” interface, the implementation of which we are not concerned about. The implementation is left to the vendor of driver.
 * 
 * 
 * 	Example : 
 * 	in a distributed system, multiple across layers...
 * 		Check stock -> payment, UpdateStock -> , GenerateInvoice..
 * 		Advantages - network calls....
 * 		Internal detaisls of facade can change
 * 		Facade keeps track transactional boundry...
 */
public class FacadePattern {

}
