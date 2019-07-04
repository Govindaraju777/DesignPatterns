package com.example.designpattern.creational.builder;

// Driver class
public class StudentBuilderNeedDemo1 {
	public static void main(String args[]) {
		
		for(int i=0;i<=5;i++) {
			StudentReceiver sr = new StudentReceiver();
			System.out.println(sr.getStudent());
		}
		//output is junk
		/*
		 * 
		  	id = 2, name = Shyam, address = Delhi
			id = 0, name = null, address = null
			id = 0, name = null, address = null
			id = 0, name = null, address = null
			id = 0, name = null, address = null
			id = 0, name = Ram, address = Noida
		 */
		
		
		
		
	}
}