// Method overloadind:changing data type of argument
package com;

public class Addition1 {//class
	static int add(int a,int b) {//no. of argument 2 add is a method
   	 return(a+b);}
    static double add(double a,double b)//no. of argument 2,add is a method
    {
   	 return (a+b);
    }
    class overloading{
   	 public static void main(String args[]) {
   		 System.out.println(Addition1.add(10,10));
   		 System.out.println(Addition1.add(10.3,10.5));
   	 }
    }
}
