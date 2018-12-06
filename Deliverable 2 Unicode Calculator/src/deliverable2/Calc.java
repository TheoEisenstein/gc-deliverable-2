package deliverable2;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		
		System.out.println("Enter a word: ");
		
		Scanner inTake1 = new Scanner(System.in);
		
		String word1 = inTake1.nextLine();
		
		System.out.println();
		System.out.println("You entered: " + word1 +" for word one.");
		System.out.println();
		
		
		int word1Length = word1.length();
		int wordAdd = 0;
		
		
		for ( int i = 0; i < word1Length; i++) {
			wordAdd = wordAdd+word1.codePointAt(i);
			 
		}
		
		
		System.out.println("Enter a second word: ");
		Scanner inTake2 = new Scanner(System.in);
				String word2 = inTake2.nextLine();
				
				System.out.println("You entered: " + word2 + " for word two.");
				System.out.println();
				
				int word2Length = word2.length();
				int word2Add = 0;
				
				for (int i = 0; i < word2Length; i++) {
					word2Add = word2Add+word2.codePointAt(i);
				}
				
		int absDifference = +Math.abs(wordAdd-word2Add);
		
		System.out.println();
		System.out.println("The Unicode value for each letter in the first word summed = " +wordAdd + ".");
		System.out.println();
		System.out.println("The Unicode value for each letter in the second word summed = " +word2Add+ ".");
		System.out.println();
		System.out.println("The absolute value of the difference between the first word summed and the second word summed = " + absDifference + ".");
		
}}