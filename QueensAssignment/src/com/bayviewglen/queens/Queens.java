package com.bayviewglen.queens;

import java.util.Arrays;
import java.util.Scanner;

public class Queens {

	public static void main(String[] args) {

		int n = 0;
		Scanner input = new Scanner(System.in);

		System.out.print("please enter a value for n: ");
		n = input.nextInt();

		String Arr[][] = new String[n][n];


		for(int c = 0; c < n; c ++){
			System.out.println();
			for (int r = 0; r < n; r++){
				Arr[c][r]="X";
			}
		}
		Arr[n-1][0] = "Q";

		for(int c = 0; c < n; c ++){
			System.out.println();
			for (int r = 0; r < n; r++){
				System.out.print(Arr[c][r]);
				System.out.print(" ");
			}

		}




































	}

}
