package com.bayviewglen.ca;

public class Contact {
	private String firstName;
	private String lastName;
	private String phoneNumber;
	
	//this is the contact object 
	public Contact(){
		firstName = null;
	    lastName = null;
	    phoneNumber = null;
	}
	    //giving the object inputs
	public Contact(String first, String last,String PhoneNum){
		firstName = first;
	    lastName = last;
	    phoneNumber = PhoneNum;
		
	}
	//returns phone number
	public String getPhoneNumber(){
		return phoneNumber;		
	}
	//returns last name
	public String getLastName(){
		return lastName;		
	}
	//returns first name
	public String getFirstName(){
		return firstName;		
	}
	//displays the contact
	public void displayContact(){
		System.out.println(firstName + lastName + phoneNumber);
	}
	//sets phone number
	public void setPhoneNumber(String num){
		phoneNumber = num;	
	}
	//sets last name
	public void setLastName(String lName){
		lastName = lName;
	}
	//sets first name
	public void setFirstName(String fName){
		firstName = fName;
	
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
}

