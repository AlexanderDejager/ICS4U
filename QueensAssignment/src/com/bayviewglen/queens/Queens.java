package com.bayviewglen.queens;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Queens {

	public static void main(String[] args) {
		
		boolean checked = false;
		boolean nQueenPossible = false ;
		int n = 0;
		Scanner input = new Scanner(System.in);

		System.out.print("please enter a value for n: ");
		n = input.nextInt();
		

		String Arr[][] = new String[n][n];
		
		int indexX=0;
		int indexY=n-1;
		
		Stack<String> queenQue = new Stack<String>();
		
		

		//this creates the blank chess board
		for(int c = 0; c < n; c ++){
			System.out.println();
			for (int r = 0; r < n; r++){
				Arr[c][r]="X";
			}
			
		}
		
		
	
		while(checked == false){
			
			Arr[indexY][indexX] = "Q";
			queenQue.push(Integer.toString(indexX));
			queenQue.push(Integer.toString(indexY));
			
			if(Arr[indexY][indexX].equals("Q")){
				System.out.println("yes");
			}
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
			
		
		
		
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
