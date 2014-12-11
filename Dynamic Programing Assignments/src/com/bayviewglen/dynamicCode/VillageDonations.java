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
			// if there is only a single guy in the village his donation is the
			// only one you can collect
		} else if (donated.length == 1) {
			return donated[0];
			// two guys ,we will choose the one willing to give more
		} else if (donated.length == 2) {
			return Math.max(donated[0], donated[1]);
			// when there are three people , all of them are neighbors , takes
			// the biggest of the three and returns it
		} else if (donated.length == 3) {
			return Math.max(Math.max(donated[0], donated[1]), donated[2]);

		}
		return 0;
	}

}
