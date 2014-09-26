package com.bayviewglen.queens;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Queens {

	public static void main(String[] args) {

		int n = 0;
		Scanner input = new Scanner(System.in);

		System.out.print("please enter a value for n: ");
		n = input.nextInt();

		String Arr[][] = new String[n][n];
		
		Stack<String> queenQue = new Stack<String>();

		//this creates the blank chess board
		for(int c = 0; c < n; c ++){
			System.out.println();
			for (int r = 0; r < n; r++){
				Arr[c][r]="X";
			}
		}
		//code for placing a Q
		//Arr[n-1][0] = "Q";
		
		//this is responsible for printing the chess board
		for(int c = 0; c < n; c ++){
			System.out.println();
			for (int r = 0; r < n; r++){
				System.out.print(Arr[c][r]);
				System.out.print(" ");
			}

		}




































	}

}
