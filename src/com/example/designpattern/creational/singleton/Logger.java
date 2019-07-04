package com.example.designpattern.creational.singleton;

public class Logger {

	private static Logger logger;
	
	private Logger() {
	}
	
	public static Logger getLoggerObject() {
		if(logger==null) {
			logger= new Logger();
		}
		return logger;
	}
}
