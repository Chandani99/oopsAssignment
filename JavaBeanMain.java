package com.objectoriented;
import java.util.Scanner;
public class JavaBeanMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name");
		String name=sc.nextLine();
		System.out.println("Enter Age");
		int age=sc.nextInt();
		System.out.println("Enter Roll Number");
		int roll=sc.nextInt();
		System.out.println("Enter Marks");
		int marks=sc.nextInt();
		
		_JavaBean jb1=new _JavaBean();
		
		
			    jb1.setMarks(marks);
				jb1.setAge(age);
				jb1.setName(name);
				jb1.setRoll(roll);
				jb1.showDetails();
		 
		_JavaBean jb2=new _JavaBean(24,"Vandana",22,450);
		jb2.showDetails();
		//_JavaBean jb2=new _JavaBean();
		// TODO Auto-generated method stub
	

	}

}
