package com.objectoriented;
import java.util.Scanner;
public class JavaBeanMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name");
		String name=sc.nextLine();
		System.out.println("Enter Age");
		int age=sc.nextInt();
		if(age<16&& age>60) {
			System.out.println("Invalid age.");
			age=sc.nextInt();
		}
		System.out.println("Enter Roll Number");
		int marks=sc.nextInt();
		if(0>marks&& marks>500) {
			System.out.println("Invalid age.");
			age=sc.nextInt();
		}
		System.out.println("Enter Marks");
		int roll=sc.nextInt();
		
		_JavaBean jb1=new _JavaBean(roll,name,age,marks);
		jb1.showDetails();
		//_JavaBean jb2=new _JavaBean();
		// TODO Auto-generated method stub

	}

}
