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
		
		
		Map<String, String> addressBook = new HashMap<String, String>();
		boolean isValidAddressBook = false;
		while(isValidAddressBook==false){
			Scanner select = new Scanner(System.in);
			String bookChoice = "6";
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
		System.out.println("|6.Quit Program                                                 |");
		System.out.println("|---------------------------------------------------------------|");
		System.out.println("");
		try {
		    Thread.sleep(500);                 
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		System.out.print("Please enter An Option:");
		
		
		if(bookChoice.equals("1")){
			
			try {
				FileWriter write = new FileWriter("Work.txt",true);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();	
			}
			
			PrintWriter print_line = new PrintWriter();
			
		
			
			System.out.println("you have chosen your Work Contacts");
			 
			
		}else if(bookChoice.equals("2")){
			
		}else if(bookChoice.equals("3")){
			
		}else if(bookChoice.equals("4")){
			
		}else if(bookChoice.equals("5")){
			
		}else if(bookChoice.equals("6")){
			System.exit(0);
		}else{
			System.out.println("please enter a valid option");
			
		}
		
		
		
		
		
		
		}
		
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
