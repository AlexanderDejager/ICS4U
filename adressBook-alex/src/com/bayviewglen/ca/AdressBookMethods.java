package com.bayviewglen.ca;

import java.util.HashMap;
import java.util.Map;

public class AdressBookMethods {
	
	Map<String,Contact> adressBookStorage = new HashMap<String,Contact>();
	
	//method that adds contacts
	
	public void createContact(String first ,String last , String num){
		adressBookStorage.put(num , new Contact(first , last, num));
	}
	


	

	
	//method responsible for deleting the contact
	public void deleteContact(Contact delete){
		//this variable holds the key we want
		String key = null;
		//for each loop that finds the contact to delete , along with its key
			for(String searchItem : adressBookStorage.keySet()){
				if(adressBookStorage.containsKey(delete.getPhoneNumber())){
					key = searchItem;
				}
				//removes the contact by using the key
				adressBookStorage.remove(key);
				System.out.println("Contact Was Deleted !");
			}
//method for searching by phone number
			

}
}
