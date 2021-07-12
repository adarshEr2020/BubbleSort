package com.bridgelabz.bubblesort;

import java.util.ArrayList;
//import java.util.Scanner;

public class BubbleSortMain {

	public static void main(String[] args) {
		//Scanner input = new Scanner(System.in);
		ReadFile read = new ReadFile();
		ArrayList<Integer> dataArray = read.readFile();
		
		// Convert the arraylist into array to pass into generic class 

		Integer[] array = new Integer[dataArray.size()];
		array = dataArray.toArray(array);
		
		// call the bubble sort method 
		
		BubbleSortImplementation bubbleSort = new BubbleSortImplementation(array);
		bubbleSort.sort();
	}

}
