import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//Write a program to find the most frequent word in a text and print it,
//as well as how many times it appears in format "word -> count".
//Consider any non-letter character as a word separator.
//Ignore the character casing. If several words have the same maximal
//frequency, print all of them in alphabetical order.

public class Problem11_MostFrequentWord {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		String[] text = sc.nextLine().toLowerCase().split("\\W+");
		TreeMap<String, Integer> wordsCount = new TreeMap<>();
		
		for (String word : text) {
			  Integer count = wordsCount.get(word);
			  if (count == null) {
			    count = 0; 
			  }
			  wordsCount.put(word, count+1);
		}
		
		int maxCount = 0;
		for (Object value : wordsCount.values()) {
			if (maxCount < (Integer)value) {
				maxCount = (Integer)value;
			}
		}
		
		for (Map.Entry<String, Integer> entry : wordsCount.entrySet()) {
			if (entry.getValue() == maxCount) {
				System.out.printf("%s -> %d\n",entry.getKey(),entry.getValue());
			}
		}
	}
}
//Examples:
//Input										Output
//in the middle of the night				the -> 2 times

//Welcome to SoftUni. Welcome to Java.
//Welcome everyone.							welcome -> 3 times

//Hello my friend, hello my darling.
//Come on, come here. Welcome,
//welcome darling.							come -> 2 times
//											darling -> 2 times
//											hello -> 2 times
//											my -> 2 times
//											welcome -> 2 times

