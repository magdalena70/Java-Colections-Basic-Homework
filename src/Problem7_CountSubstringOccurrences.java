import java.util.Scanner;

//Write a program to find how many times given string appears in given
//text as substring. The text is given at the first input line.
//The search string is given at the second input line.
//The output is an integer number. Please ignore the character casing.

public class Problem7_CountSubstringOccurrences {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine().toLowerCase();
		String subString = sc.nextLine().toLowerCase();
		
		int count = 0;
		for(int i = 0;i <= text.length() - subString.length();i++){
			if(text.substring(i,subString.length() + i).equals(subString)){
				count++;
			}
		}
		System.out.print(count);
	}
}
//Examples:
//Input												Output
//Welcome to the Software University (SoftUni)!		4
//Welcome to programming. Programming is wellness
//for developers, said Maxwell.
//wel

//aaaaaa											5
//aa

//ababa caba										3
//aba

//Welcome to SoftUni								0
//Java	

