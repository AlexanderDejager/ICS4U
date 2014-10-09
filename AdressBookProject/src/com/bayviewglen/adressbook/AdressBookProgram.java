package com.bayviewglen.adressbook;

import java.util.Scanner;

public class AdressBookProgram {

	public static void main(String[] args) {
		
		Scanner choice = new Scanner(System.in);
		String Selection = null;
		
		AddressBook book = new AddressBook();
		
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
			
		addContact(book);
			
		}else if(Selection.equals("2")){
			
		}else if(Selection.equals("3")){
			
		}else{
			
		}
		
	
		

	}

	public static boolean addContact(AddressBook b){
		Contact c = new Contact();
		String temp = null;

		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter The Contacts PhoneNumber");
		temp = in.nextLine();
		c.setPhoneNumber(temp);
		System.out.println("Enter The Contacts FirstName");
		temp = in.nextLine();
		c.setNameFirst(temp);
		System.out.println("Enter The Contacts LastName");
		temp = in.nextLine();
		c.setNameLast(temp);
		
		AddressBook.addressBook.put(c.getPhoneNumber(),c.getNameFirst()+" "+c.getNameLast());
		
		
		
		
		
		
		
		return true;
	}
}
