import java.util.Scanner;

//Write a program to count the number of words in given sentence.
//Use any non-letter character as word separator.

public class Problem5_CountAllWords {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String[] text = sc.nextLine().split("\\W+");
		
		System.out.print(text.length);	
		}
	}
//Examples:
//Input													Output
//Welcome to the Software University (SoftUni)!			6

//I am coming...										3

//It's OK, I'm in.										6

//Java is a set of several computer software			60
//products and specifications from Oracle
//Corporation that provides a system for developing
//application software and deploying it in a
//cross-platform computing environment. Java is used
//in a wide variety of computing platforms from
//embedded devices and mobile phones on the low end,
//to enterprise servers and supercomputers on the
//high end.												

