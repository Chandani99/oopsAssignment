package com.objectoriented;

public class Studentdetails {
	private int roll;
	private String name;
	private String address;
	private String collageName;
    
	Studentdetails(int roll,String name,String address){
		this.roll=roll;
		this.name=name;
		this.address=address;
	}
	public void setRoll(int roll){
		this.roll=roll;
		}
	public void setName(String name){
		this.name=name;
		}
	public void setaddress(String address){
		this.address=address;
		}
	public void setcName(String collageName){
		this.collageName=collageName;
		}
	public int getRoll() {
		return roll;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getcName() {
		return collageName;
	}
	public void displayDetails() {
		System.out.println("Name:"+name);
		System.out.println("Roll Number:"+roll);
		System.out.println("Address:"+address);
		System.out.println("Collage Name:"+collageName);
//		System.out.println("Name:"+name);
	}
    
	public static void main(String[] args) {


	}
	public String getCollageName() {
		return collageName;
	}
	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}

}
