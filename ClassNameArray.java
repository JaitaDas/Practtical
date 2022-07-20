package Array;
//to get the class name of array in java
public class ClassNameArray {
	public static void main(String args[]) {
		int arr[] = {1,2,3};  //declaration & initialization of an array
     Class c= arr.getClass();  //getting the class name
     String name=c.getName();
     System.out.println(name);  //print the class name

     }
 }
