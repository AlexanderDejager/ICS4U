package com.bayviewglen.adressbook;

import java.util.HashMap;

public class AddressBook {
	
	HashMap<String,Contact> addressBook = new HashMap<String,Contact>();
	
	public boolean addContact(Contact c){
		addressBook.put(c.getPhoneNumber(), c);
		
		return true;
	}

}
