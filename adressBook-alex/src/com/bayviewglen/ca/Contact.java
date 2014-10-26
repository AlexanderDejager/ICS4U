package com.bayviewglen.ca;

public class Contact {
	private String firstName;
	private String LastName;
	private String PhoneNumber;
	
	//this is the contact object 
	public Contact(){
		firstName = null;
	    LastName = null;
	    PhoneNumber = null;
	}
	    //giving the object inputs
	public Contact(String first, String last,String PhoneNum){
		firstName = first;
	    LastName = last;
	    PhoneNumber = PhoneNum;
		
	}
	//returns phone number
	public String getPhoneNumber(){
		return PhoneNumber;		
	}
	//returns last name
	public String getLastName(){
		return LastName;		
	}
	//returns first name
	public String getFirstName(){
		return firstName;		
	}

	
	
	
	
	
	
	
	
	
	
}

