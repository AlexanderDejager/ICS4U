package com.bayviewglen.algorithimsassignment;
/**
 * 
 * @author mhussein
 * @version 2
 * Gets the value of the village donation, actually uses dynamic programming. Yes i had some help with 
 * figuring this one out because I couldn't get it on my own. Fully understand it know so don't worry
 */
public class VillageDonations2 {

	public static void main(String[] villageDonationsgs) {// this one works
		int[] donations = {1,2,3,5,7,9}; // drop in them donations
		System.out.println(maxDonations(donations));
	}
	/**
	 * 
	 * @param int[]
	 * @return largest donation available from the town
	 */
	private static int maxDonations(int[] villageDonations) { // the actual method where it all happens
		int donationsProblem1[]=new int[villageDonations.length];// to make sure i get the real amount
		int donationsProblem2[]=new int[villageDonations.length];// i got two to just make sure
		
		if(villageDonations.length == 0){ // if no one lives in the village , no money
			return 0;
		
		}else if(villageDonations.length==1){ // one guy means one thing
			return villageDonations[0];
		
		}else if(villageDonations.length==2){ // two guys means we take the one willing to give more
			return Math.max(villageDonations[0],villageDonations[1]);
		
		}else if(villageDonations.length==3){ // three guys means all are neighbors so take the biggest of the three
			return Math.max(Math.max(villageDonations[0],villageDonations[1]),villageDonations[2]);
		
		}else{ // every other case
			donationsProblem1[0]=villageDonations[0]; // set both to first value because loop starts at 2
			donationsProblem1[1]=villageDonations[0];
			
			for(int i =2;i<villageDonations.length-1;i++)// go through the whole thing and find biggest one between adding the current one and the house two away or the current house
				donationsProblem1[i]=Math.max(donationsProblem1[i-2]+villageDonations[i], donationsProblem1[i-1]); // doesn't remember which ones, but stores the current biggest value
			
			donationsProblem2[0]=villageDonations[1]; // do it again but starting with the second house not the first
			donationsProblem2[1]=villageDonations[1];
			donationsProblem2[2]=Math.max(villageDonations[1],villageDonations[2]);
			
			for(int i = 2;i<villageDonations.length;i++)// exact same thing
				donationsProblem2[i]=Math.max(donationsProblem2[i-2]+villageDonations[i], donationsProblem2[i-1]);
			
			return Math.max(donationsProblem1[donationsProblem1.length-2], donationsProblem2[donationsProblem2.length-1]); // returns the greatest between the two possible ones
		}
	}
}



