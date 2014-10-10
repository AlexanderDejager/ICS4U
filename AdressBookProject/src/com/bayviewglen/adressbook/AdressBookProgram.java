package com.bayviewglen.adressbook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AdressBookProgram {

	public static void main(String[] args) {
		
		
		Map<String, String> addressBook = new HashMap<String, String>();
		
		Scanner choice = new Scanner(System.in);
		String Selection = null;

		System.out.println("|---------------------------------------------------------------|");
		System.out.println("|                Welcome To The Adress Book Menu                |");
		System.out.println("|---------------------------------------------------------------|");
		System.out.println("|Please Select a number                                         |");
		System.out.println("|---------------------------------------------------------------|");
		System.out.println("| 1.Add Contact");
		System.out.println("| 2.");
		System.out.println("| 3.");
		System.out.println("| 4.");
		System.out.println("| 5.");
		System.out.println("| 6.");
		System.out.println("| 7.");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|----------------------------------------------------------------");
		System.out.print("your Choice :");
		Selection = choice.nextLine();


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

		}else if(Selection.equals("2")){

		}else if(Selection.equals("3")){

		}else{

		}


	}
}
