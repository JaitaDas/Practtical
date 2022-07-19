package Array;

public class ClonningAnArray {
	public static void main(String args[]) {
		int[] arr= {44,4,5,6};  //declaring & initializing
		System.out.println("print the actual array");
		for(int i:arr)  //for each loo for print
			System.out.println(i); //print
		System.out.println("Print the clone array");
		int carr[]=arr.clone();  //creating clone
		for(int i:arr)  //for each loop for cloaning array
			System.out.println(i);
		System.out.println("both are equal or not?");
		System.out.println(arr==carr);  //checking
	}

}
