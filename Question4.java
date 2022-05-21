package com.objectoriented;
import java.util.Scanner;
public class Question4 {
	public static void data(int num) {
		if(num%2==0 && num>0) {
			int n1=num%10;
			int n2=10-n1;
			num=num+n2;
			System.out.println(num);
		}
		else if(num%2!=0 && num>0) {
			System.out.println(num);
		}
		else if(num<0) {
			System.out.println("Error");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		data( number);
		// TODO Auto-generated method stub

	}

}
