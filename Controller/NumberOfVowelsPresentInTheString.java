package Controller;

import model.GettingInputFromTheUser;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NumberOfVowelsPresentInTheString {
	public void printingNumberOfVowels() {
		GettingInputFromTheUser gi = new GettingInputFromTheUser();

		System.out.println("**Number of vowels present in the String**");
		String sentence;
		int count = 0;
		char[] vowels = new char[] { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };

		Scanner get = new Scanner(System.in);
		System.out.println("Enter a String:");
		sentence = get.nextLine();
		gi.setSentenceToCountVowels(sentence);

		for (int i = 0; i < sentence.length(); i++) {
			for (int j = 0; j < 10; j++) {

				Set<Character> set = new HashSet<Character>(Arrays.asList(vowels[j]));
				Set<Character> set2 = new HashSet<Character>(Arrays.asList(sentence.charAt(i)));

				if (set2.containsAll(set)) {
					count++;
				}
			}

		}

		if (count > 1) {
			System.out.println("Number of Vowels present in the given String: " + count);
		} else {
			System.out.println("There are no vowels present in the given String!");
		}

	}
}
