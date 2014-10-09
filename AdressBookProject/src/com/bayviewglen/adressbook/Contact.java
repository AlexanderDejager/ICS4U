package com.bayviewglen.adressbook;

public class Contact {
	private String firstName;
	private String lastName;
	private String phoneNumber;

	public Contact(){
		firstName = null;
		lastName = null;
		phoneNumber = null;	
	}

	public Contact(String templ, String tempf, String tempPN){
		firstName = tempf;
		lastName = templ;
		phoneNumber = tempPN;			
	}

	public void setNameFirst(String tempf){
		firstName = tempf;
	}

	public void setNameLast(String templ){
		lastName = templ;
	}
	
	public void setPhoneNumber(String tempPN){
		phoneNumber = tempPN;
	}
	
	public String getNameFirst(){
		return firstName;
	}
	
	public String getNameLast(){
		return lastName;	
	}
	
	public String getPhoneNumber(){
		return phoneNumber;
	}
 
	

}
