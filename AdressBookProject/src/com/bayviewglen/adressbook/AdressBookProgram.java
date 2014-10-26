package com.bayviewglen.adressbook;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AdressBookProgram {

	public static void main(String[] args) {
		
		final String BOOK_WORK ="1";
		final String BOOK_FAMILY ="2";
		final String BOOK_FRIENDS = "3";
		final String BOOK_SERVICES = "4";
		final String BOOK_EMERGENCY_CONTACTS = "5";
		final String QUIT_PROGRAM = "0";
		
		
		Map<String, String> addressBook = new HashMap<String, String>();
		boolean isValidAddressBook = false;
		while(isValidAddressBook==false){
			Scanner select = new Scanner(System.in);
			String bookChoice = null;
		System.out.println("|---------------------------------------------------------------|");
		System.out.println("|Welcome To Adress Book                                         |");
		System.out.println("|---------------------------------------------------------------|");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		for(int i=0;i<20;i++){
			System.out.print(".");
			try {
			    Thread.sleep(100);                 
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
		
		}
		System.out.print("   Done!!!");
		try {
		    Thread.sleep(100);                 
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		System.out.println("");
		System.out.println("");
		//this is a table to select the adress book you would like to use ...... pretty self explanitory
		System.out.println("|---------------------------------------------------------------|");
		System.out.println("|Please Choose An Adress Book                                   |");
		System.out.println("|---------------------------------------------------------------|");
		System.out.println("|1.Work                                                         |");
		System.out.println("|2.Family                                                       |");     
		System.out.println("|3.Friends                                                      |");
		System.out.println("|4.Services                                                     |");
		System.out.println("|5.Emergency Contacts                                           |");
		System.out.println("|0.Quit Program                                                 |");
		System.out.println("|---------------------------------------------------------------|");
		System.out.println("");
		try {
		    Thread.sleep(500);                 
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		System.out.print("Please enter An Option:");
		bookChoice = select.nextLine();
		
		String adressBookChoiceString = null;
		
		
		if(bookChoice.equals(BOOK_WORK)){
			System.out.println("");
			System.out.println("you have chosen your Work Contacts");
			adressBookChoiceString = "work.txt";
			Scanner scanFile = new Scanner("work.txt");
			isValidAddressBook = true;
			
		}else if(bookChoice.equals(BOOK_FAMILY)){
			System.out.println("");
			System.out.println("you have chosen your Work Contacts");
			adressBookChoiceString = "work.txt";
			Scanner scanFile = new Scanner("work.txt");
			isValidAddressBook = true;
			
		}else if(bookChoice.equals(BOOK_FRIENDS)){
			System.out.println("");
			System.out.println("you have chosen your Work Contacts");
			adressBookChoiceString = "work.txt";
			Scanner scanFile = new Scanner("work.txt");
			isValidAddressBook = true;
			
		}else if(bookChoice.equals(BOOK_SERVICES)){
			System.out.println("");
			System.out.println("you have chosen your Work Contacts");
			adressBookChoiceString = "work.txt";
			Scanner scanFile = new Scanner("work.txt");
			isValidAddressBook = true;
			
		}else if(bookChoice.equals(BOOK_EMERGENCY_CONTACTS)){
			System.out.println("");
			System.out.println("you have chosen your Work Contacts");
			adressBookChoiceString = "work.txt";
			Scanner scanFile = new Scanner("work.txt");
			isValidAddressBook = true;
			
		}else if(bookChoice.equals(QUIT_PROGRAM)){
			System.exit(0);
		}else{
			System.out.println("");
			System.out.println("please enter a valid option");
			
		}
		
		
		
		
		
		
		}
		
		Scanner choice = new Scanner(System.in);
		String Selection = null;
		boolean done = false;
		while(done == false){
			try {
			    Thread.sleep(1000);                 
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
		System.out.println("|---------------------------------------------------------------|");
		System.out.println("|                Welcome To The Adress Book Menu                |");
		System.out.println("|---------------------------------------------------------------|");
		System.out.println("|Please Select a number                                         |");
		System.out.println("|---------------------------------------------------------------|");
		System.out.println("| 1.Add Contact");
		System.out.println("| 2.Remove Contact");
		System.out.println("| 3.D");
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
			
		
			
		}else if(Selection.equals("7")){
			done = true;
			
		}else{
		System.out.println("Please Enter One Of The Choices Or Press 7 If You Wish To Exit");
		}
		}

	}
}
