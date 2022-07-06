public class Vehicle {   //parent class A
  void run () {
	  System.out.println("running mode on");
  }
  public class Vehicle1 {  //parent class B
	  void run() {
		  System.out.println("running mode on");
	  }
	  class Bike extends  Vehicle, Vehicle1 {  //child class c
		  public static void main(String args[]) {  //object of child class
			  Bike d = new Bike ();  //parent class method
			  d.run();
		  }
	  }
  }
