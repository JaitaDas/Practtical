package com;

public class DataMember {
   int speedlimit = 70;
   
}
class Hyundai extends DataMember {
	int speedlimit = 80;
	public static void main(String args[]) {
		Hyundai obj = new Hyundai();
		System.out.println(obj.speedlimit);
	}
}
