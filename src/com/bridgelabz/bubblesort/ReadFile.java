package com.bridgelabz.bubblesort;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
	public static ArrayList<Integer> readFile(){
		ArrayList<Integer> dataArray = new ArrayList<>();
		String data = " ";
		String filePath = "C:\\Users\\Welcome\\Eclipse workspace\\BubbleSort\\src\\com\\bridgelabz\\bubblesort\\data.txt";
		
		try {
			File myObj = new File(filePath);
			Scanner myReader = new Scanner(myObj);
			while(myReader.hasNextLine()) {
				// reading the line from the  file and removing the 
				data = myReader.nextLine().replaceAll(",",data);
				
				// splitting the data into new Line based on white space
				String[] data1 = data.split("\\W+");
				for(String s: data1)
					dataArray.add(Integer.parseInt(s));
			}
			myReader.close();
		}catch (FileNotFoundException e) {
			System.out.println("An error occured ");
			e.printStackTrace();
		}
		return dataArray;
	}
}