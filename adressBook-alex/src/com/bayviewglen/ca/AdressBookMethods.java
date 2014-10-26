package com.bayviewglen.ca;

import java.util.HashMap;
import java.util.Map;

public class AdressBookMethods {
	
	Map<String,Contact> adressBookStorage = new HashMap<String,Contact>();
	
	//method that adds contacts
	
	public void createContact(String first ,String last , String num){
		adressBookStorage.put(num , new Contact(first , last, num));
	}

}
