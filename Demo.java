package com.objectoriented;

public class Demo {
    Demo(){
    	
    	System.out.println("This is default constructor");
    }
    Demo(String s){
    	
    	System.out.println("This is constructor with string argument i.e.: " +s);
    }
    Demo(int i){
    	
    	System.out.println("This is constructor with integer argument i.e.: " +i);
    }
    Demo(float f){
    	
    	System.out.println("This is constructor with flaot argument i.e.: " +f);
    }
	public static void main(String[] args) {
		 Demo d1=new Demo("Chandani");
		
	}

}
