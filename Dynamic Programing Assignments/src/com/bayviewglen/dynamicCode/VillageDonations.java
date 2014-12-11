package com.bayviewglen.dynamicCode;

/**
 * 
 * @author aDejager
 * @version 2 Gets the value of the village donation, using dynamic programming.
 *          the Internet was god in this project.
 */
public class VillageDonations {

	public static void main(String[] donated) {
		// put whatever values you want into donations to test the program
		int[] donations = { 1, 2, 3, 8, 7, 11 };
		System.out.println(maxDonations(donations));
	}

	/**
	 * 
	 * @param int[]
	 * @return greatest donation you can receive from the town
	 */
	// the method that allows me to figure out the maximum donation i can
	// receive
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
			// dealing with all the other cases
		} else {
			// set both of the bellow to first value because the loop will start
			// at 2
			donationsStorage1[0] = donated[0];
			donationsStorage1[1] = donated[0];

			// iterates through the whole thing to find the biggest value
			// between
			// adding the current value of the house and the house two houses
			// down
			// or the current house
			for (int i = 2; i < donated.length - 1; i++)
				// will not remember the index,
				// however stores the current biggest value
				donationsStorage1[i] = Math.max(donationsStorage1[i - 2]
						+ donated[i], donationsStorage1[i - 1]);
			// Repeating this this time however we start with the second house
			// rather than the first
			donationStorage2[0] = donated[1];
			donationStorage2[1] = donated[1];
			donationStorage2[2] = Math.max(donated[1], donated[2]);
			// again we iterate through for the value
			for (int i = 2; i < donated.length; i++)
				donationStorage2[i] = Math.max(donationStorage2[i - 2]
						+ donated[i], donationStorage2[i - 1]);
			// we are returning the greatest value between the two possible
			// values
			return Math.max(donationsStorage1[donationsStorage1.length - 2],
					donationStorage2[donationStorage2.length - 1]);
		}
	}
}