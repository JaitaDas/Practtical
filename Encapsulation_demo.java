package com;
import java.util.Scanner;
public class Encapsulation_demo{
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		String stuname;
		int stupass,sid;
		int Biology,Computer,Maths,Physics,Chemistry;
		
		System.out.println("Enter your Name :");
		stuname=s.nextLine();
		System.out.println("Enter your User_ID :");
		sid=s.nextInt();
		System.out.println("Enter your Password :");
		stupass=s.nextInt();
		
		System.out.println("Enter marks of subjects :");
		System.out.println("Enter marks of Biology :");
		Biology=s.nextInt();
		System.out.println("Enter marks of Computer :");
		Computer=s.nextInt();
		System.out.println("Enter marks of Maths :");
		Maths=s.nextInt();
		
		System.out.println("Enter marks of Physics :");
		Physics=s.nextInt();
		System.out.println("Enter marks of Chemistry :");
		Chemistry=s.nextInt();
		
		encap_d obj = new encap_d();
		
		obj.set_name(stuname);
		obj.set_pass(stupass);
		obj.set_stu_id(sid);
		System.out.println("Name :"+obj.get_name());
		System.out.println("User ID :"+obj.get_stu_id());
		System.out.println("Password :"+obj.get_pass());
		obj.calc(Biology,Computer,Maths,Physics,Chemistry);
		System.out.println("Percentage :"+obj.percentage);
		}
	}

	class encap_d{
		private String Student_name;
		private int Studentuser_id;
		private int password;
		int total,percentage;
		
		public String get_name()
		{
			return Student_name;
		}
		public int get_stu_id()
		{
			return Studentuser_id;
		}
		public int get_pass()
		{
			return password;
		}
		public void set_name(String stu)
		{
			Student_name=stu;
		}
		public void set_stu_id(int stu)
		{
			Studentuser_id=stu;
		}
		public void set_pass(int stu)
		{
			password = stu;
		}
		public void calc(int Biology , int Computer  ,int Maths , int Physics , int Chemistry) {
		total = Biology+Computer+Maths+Physics+Chemistry;
		percentage=total/5;
	}
	}

