package com.bayviewglen.adressbook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AdressBookProgram {

	public static void main(String[] args) {
		
		
		Map<String, String> addressBook = new HashMap<String, String>();
		
		Scanner choice = new Scanner(System.in);
		String Selection = null;
		boolean done = false;
		while(done == false){
		System.out.println("|---------------------------------------------------------------|");
		System.out.println("|                Welcome To The Adress Book Menu                |");
		System.out.println("|---------------------------------------------------------------|");
		System.out.println("|Please Select a number                                         |");
		System.out.println("|---------------------------------------------------------------|");
		System.out.println("| 1.Add Contact");
		System.out.println("| 2.Remove Contact");
		System.out.println("| 3.");
		System.out.println("| 4.");
		System.out.println("| 5.");
		System.out.println("| 6.");
		System.out.println("| 7.exit program");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|----------------------------------------------------------------");
		System.out.print("your Choice :");
		Selection = choice.nextLine();
		
		//this is what you use to select contacts
		if(Selection.equals("1")){
			
			Contact c = new Contact();
			String firstName = null;
			String lastName = null;
			String phoneNumber = null;
			String contact = null;

			Scanner in = new Scanner(System.in);

			System.out.println("Enter The Contacts PhoneNumber");
			phoneNumber = in.nextLine();

			System.out.println("Enter The Contacts FirstName");
			firstName = in.nextLine();
			
			System.out.println("Enter The Contacts LasttName");
			lastName = in.nextLine();
			contact = firstName + " " + " " + lastName + " " + phoneNumber;
			
			addressBook.put(phoneNumber, contact);
		
			System.out.println(addressBook.get(phoneNumber));
		//this code removes contacts
		}else if(Selection.equals("2")){
			Scanner input = new Scanner(System.in);
			String key = null;
			System.out.println("Please enter the number of the contact you wish to remove");
			key = input.nextLine();
			addressBook.remove(key);
			System.out.println(addressBook.get(key));
			
		}else if(Selection.equals("7")){
			done = true;
			
		}else{
		System.out.println("Please Enter One Of The Choices Or Press 7 If You Wish To Exit");
		}
		}

	}
}
