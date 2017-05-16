package view;

import Controller.NumberOfVowelsPresentInTheString;
import Controller.OccuranceOfEachVowels;
import Controller.RemovingVowels;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DisplayingTheOccuranceOfVowels {

	public static void main(String args[]) throws NumberFormatException, IOException {
		int loop = 1;
		do {
			System.out.println("********************************");
			System.out.println(
					"1-Find the number of vowels in a string \n2-Find the occuraance of vowel in a string \n3-Remove vowels from a string");
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			int option = Integer.parseInt(input.readLine());

			switch (option) {
			case 1:
				NumberOfVowelsPresentInTheString fn = new NumberOfVowelsPresentInTheString();
				fn.printingNumberOfVowels();
				break;

			case 2:
				OccuranceOfEachVowels ov = new OccuranceOfEachVowels();
				ov.PrintingOccuranceOfVowels();
				break;

			case 3:
				RemovingVowels rv = new RemovingVowels();
				rv.removingvowels();
				break;

			default:
				System.exit(0);
				break;
			}
		} while (loop < 10);
	}

}