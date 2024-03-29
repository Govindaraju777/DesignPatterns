package com.example.designpattern.behavioural;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * You want to know when an event happens
 */
//https://github.com/in28minutes/Design-Patterns-For-Beginners

/*
 * Way of notifying a change to number of classes..
 */
public class ObserverPattern {
	static class SachinCenturyNotifier {
		List<SachinFan> fans = new ArrayList<SachinFan>();

		void register(SachinFan fan) {
			fans.add(fan);
		}

		void sachinScoredACentury() {
			for (SachinFan fan : fans) {
				fan.announce();
			}
		}
	}

	static class SachinFan {
		private String name;

		SachinFan(String name) {
			this.name = name;
		}

		void announce() {
			System.out.println(name + "  notified");
		}
	}

	public static void main(String[] args) {
		SachinCenturyNotifier notifier = new SachinCenturyNotifier();
		notifier.register(new SachinFan("Ranga"));
		notifier.register(new SachinFan("Ramya"));
		notifier.register(new SachinFan("Veena"));
		notifier.sachinScoredACentury();

		int[] test = {1,2};
		List<Integer> intlist = Arrays.asList(test);
		
		
		/*
		 * Ranga notified Ramya notified Veena notified
		 * 
		 */
	}
}