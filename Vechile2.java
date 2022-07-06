package com;
public class Vehicle2{  // parent class
	void run() {
		System.out.println("Running mode is on");
	}
	class Bike extends Vehicle2{ // child class
		void features() {
			System.out.println("Well executed features");
		}
		class BMW extends Bike{  // child class
			void speed() {  
				System.out.println("Very high speed");
			}
		}
		class Testsingleinherit{ //  main class 
			public static void main (String args []) {
				BMW d = new BMW ();//  object of child class 
				d.run();// parent class method
				d.features();// child class method
				d.speed();//bmw class method
			}
		}
	}
}