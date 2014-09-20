import java.util.Scanner;

//Write a program to find how many times a word appears in given text.
//The text is given at the first input line. The target word is given
//at the second input line. The output is an integer number.
//Please ignore the character casing. Consider that any non-letter
//character is a word separator. 

public class Problem6_CountSpecifiedWord {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		//equate the two strings to the same font
		String inputText = sc.nextLine().toUpperCase();
		String[] text = inputText.split("\\W+") ;
		String target = sc.nextLine().toUpperCase();
		
		int count = 0;
		for(int i = 0;i < text.length;i++){
			if(target.equals(text[i])){
				count++;
			}
		}
		System.out.print(count);
	}
}
//Examples:
//Input												Output
//Welcome to the Software University (SoftUni)!		2
//Welcome to programming.
//welcome

//I am coming...									0
//hello

//It's OK, I'm in.									1
//i	

//Java is a set of several computer software		2
//products and specifications from Oracle
//Corporation that provides a system for
//developing application software and deploying
//it in a cross-platform computing environment.
//Java is used in a wide variety of computing
//platforms from embedded devices and mobile phones
//on the low end, to enterprise servers and
//supercomputers on the high end.
//is	

