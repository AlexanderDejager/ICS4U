package com.bayviewglen.queens;

import java.util.Stack;

public class Queen {

	//method that adds queens

	public static void AddQueen(int indexX,int indexY,String[][] Arr,Stack<String> queenQue){
		Arr[indexY][indexX]= "Q";
		queenQue.push("row " + Integer.toString(indexY) + "colum " + Integer.toString(indexX));
	}




}
