package com.example.designpattern.creational.singleton;

public class TestLogger {

	public static void main(String[] args) {
		Logger logger = Logger.getLoggerObject();
		System.out.println(logger.hashCode());
		
		Logger logger2 = Logger.getLoggerObject();
		System.out.println(logger2.hashCode());
		
	}
}
