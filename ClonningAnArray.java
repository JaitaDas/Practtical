package Array;

public class ClonningAnArray {
	public static void main(String args[]) {
		int[] arr= {44,4,5,6};
		System.out.println("print the actual array");
		for(int i:arr)
			System.out.println(i);
		System.out.println("Print the clone array");
		int carr[]=arr.clone();
		for(int i:arr) 
			System.out.println(i);
		System.out.println("both are equal or not?");
		System.out.println(arr==carr);
	}

}
