package com.objectoriented;

public class ShowStudentDetails {
public static void getstudent(boolean isFromNIT) {
    	if(isFromNIT==true) {
    		Studentdetails s1=new Studentdetails(24,"Chandani","Gorakhpur");
    		s1.setcName("NIT");
//    		System.out.println(s1.getcName()); 
    		s1.displayDetails();
    	}
    	else {
    		Studentdetails s2=new Studentdetails(28,"Brijesh","Ghazipur");
    		s2.setcName("Other");
    		s2.displayDetails();
    	}
    }
	public static void main(String[] args) {
		getstudent(false);
		// TODO Auto-generated method stub

	}

}
