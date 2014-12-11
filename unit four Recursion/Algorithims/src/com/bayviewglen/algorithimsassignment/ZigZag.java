package com.bayviewglen.algorithimsassignment;

import java.util.ArrayList;
/**
 * 
 * @author mhussein
 * @version 2
 * Completes the needed steps to take an array of integers and make sure it is a zig-zag sequence 
 * It takes the sequence and creates the longest subsequence of numbers that allow for a zig-zag sequence
 * 
 */
public class ZigZag {

	public static void main(String[] args) {
		int[] zigZag = {70, 55, 13, 2, 99, 2, 80, 80, 80, 80, 100, 19, 7, 5, 5, 5, 1000, 32, 32};// enter the integers here
		ArrayList<Integer> solutions = new ArrayList<Integer>();// puts them into list because so much easier to use
		for(int w = 0; w < zigZag.length; ++ w)
			solutions.add(zigZag[w]);
		if(zigZag.length < 2){
			System.out.print(zigZag.length);
		}else{
			System.out.println(getAmount(solutions));
		}
	}
	
/**
 * 	
 * @param ArrayList<Integer>
 * @return size of ArrayList after getting all viable zigzag numbers
 */
	private static int getAmount(ArrayList<Integer> zigzag) {
		ArrayList<Integer> solutions = zigzag;
		int difference = 0; 
		int i = 0;
		solutions = removeDuplicates(solutions); // removes all the duplicates of the numbers next to eachother
		System.out.println(getAmount(solutions));
		while(i < solutions.size() - 2){
			difference = solutions.get(i + 1) - solutions.get(i);
			if(difference == 0){ 
				solutions.remove(i);
				i = 0;
				continue;
			}else if (difference > 0){ // if its positive
				if(solutions.get(i + 2) == solutions.get(i + 1)){
					solutions.remove(i + 2);
					i = 0;
					continue;
				}else if(solutions.get(i + 2) - solutions.get(i + 1) > 0 ){ // if they both be positive remove the bigger one
					int max = Math.max(solutions.get(i + 2), solutions.get(i + 1));
					if(solutions.get(i + 2) == max)
						solutions.remove(i);
					else
						solutions.remove(i);
					continue;
				}else{
					i++;
					continue;
				}
			}else{
				if(solutions.get(i + 2) - solutions.get(i + 1) < 0 ){ // if they both negative then remove the smaller one
					int min = Math.min(solutions.get(i + 2), solutions.get(i + 1));
					if(solutions.get(i + 2) == min)
						solutions.remove(i);
					else
						solutions.remove(i);
					continue;
				}else{
					i++;
					continue;
				}
			}
		}
		return solutions.size();
	}

	/**
	 * @param ArrayList<Integer>
	 * @return ArrayList<Integer> with all repeating numbers next to themselves removed
	 */
	private static ArrayList<Integer> removeDuplicates(ArrayList<Integer> solutions) {
		ArrayList<Integer> changed = solutions;
		for(int i = 0; i < changed.size() - 1; ++i){
			if(changed.get(i) == changed.get(i + 1)){
				changed.remove(i);
				i = 0;
			}
				
		}
		return changed;
	}
}