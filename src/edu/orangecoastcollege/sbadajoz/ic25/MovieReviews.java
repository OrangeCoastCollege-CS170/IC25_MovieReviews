package edu.orangecoastcollege.sbadajoz.ic25;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*
Badajoz, Seve
CS A170
December 2, 2016

IC25
*/
public class MovieReviews {
	public static void main(String[] args) {
		File ratings = new File("MovieReviews.txt");
		double avg = 0.0;
		int counter = 0;
		ArrayList<Double> list = new ArrayList<>();
		try {
			Scanner input = new Scanner(ratings);
			while (input.hasNext()) {
				list.add(input.nextDouble());
				avg += list.get(counter);
			}
			for (Double double1 : list) {
				System.out.println(double1);
			}
			System.out.println("Average rating: " + (avg / list.size()));
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
	}
}
