package Controller;
import model.GettingInputFromTheUser;
import java.util.Scanner;

public class OccuranceOfEachVowels {
	public void PrintingOccuranceOfVowels() {
		GettingInputFromTheUser gi = new GettingInputFromTheUser();
		
		System.out.println("**Occurance of each vowel in the String**");
		Scanner get = new Scanner(System.in);
		System.out.println("Enter a String:");
		String sentence = get.nextLine();
		gi.setSentenceToCheckOccuranceOfVowel(sentence);
		
		// resetting character count
		int charACount = 0;
		int charECount = 0;
		int charICount = 0;
		int charOCount = 0;
		int charUCount = 0;

		for (char a : sentence.toCharArray()) {
			if (a == 'a' || a == 'A') {
				charACount++;
			}
		}

		for (char e : sentence.toCharArray()) {
			if (e == 'e' || e == 'E') {
				charECount++;
			}
		}

		for (char i : sentence.toCharArray()) {
			if (i == 'i' || i == 'I') {
				charICount++;
			}
		}

		for (char o : sentence.toCharArray()) {
			if (o == 'o' || o == 'O') {
				charOCount++;
			}
		}

		for (char u : sentence.toCharArray()) {
			if (u == 'u' || u == 'U') {
				charUCount++;
			}
		}

		System.out.println("count of vowel 'a' on String is :  " + charACount);
		System.out.println("count of vowel 'e' on String is :  " + charECount);
		System.out.println("count of vowel 'i' on String is :  " + charICount);
		System.out.println("count of vowel 'o' on String is :  " + charOCount);
		System.out.println("count of vowel 'u' on String is :  " + charUCount);
	}

}
