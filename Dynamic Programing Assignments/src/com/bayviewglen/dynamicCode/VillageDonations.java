package com.bayviewglen.dynamicCode;

public class VillageDonations {

	public static void main(String[] donated) {
		// put whatever values you want into donations to test the program
		int[] donations = { 1, 2, 3, 8, 7, 11 };
		System.out.println(maxDonations(donations));
	}


	private static int maxDonations(int[] donated) {

		// to check if i get the real value
		int donationsStorage1[] = new int[donated.length];
		// also just a second one to make double sure
		int donationStorage2[] = new int[donated.length];
		
		
		// if no one is in the village you can not collect any donations
				if (donated.length == 0) {
					return 0;

		}
				return 0;
	}
	
}
