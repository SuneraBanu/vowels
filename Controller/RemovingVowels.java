package Controller;

import model.GettingInputFromTheUser;
import java.util.Scanner;

public class RemovingVowels {
	public void removingvowels() {
		GettingInputFromTheUser gi = new GettingInputFromTheUser();

		System.out.println("**Removing vowels in the String**");
		String sentence, Newtext;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String : ");
		sentence = scan.nextLine();
		gi.setSentenceToRemoveVowel(sentence);

		System.out.println("Removing Vowels from The String [" + sentence + "]\n");
		Newtext = sentence.replaceAll("[aeiouAEIOU]", "");

		System.out.println("All Vowels Removed Successfully..!!\nNow the String is :" + Newtext);

	}

}
