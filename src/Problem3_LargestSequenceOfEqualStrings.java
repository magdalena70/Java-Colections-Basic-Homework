import java.util.Scanner;


//Write a program that enters an array of strings and finds in it
//the largest sequence of equal elements.
//If several sequences have the same longest length,
//print the leftmost of them.
//The input strings are given as a single line, separated by a space.

public class Problem3_LargestSequenceOfEqualStrings {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String[] splitStr = input.nextLine().split(" ");
		
		int counter = 1;
		int maxCounter = 1;
		int index = 0;
		for(int i = 1;i < splitStr.length;i++){
			if(splitStr[i].equals(splitStr[i-1])){
				counter++;
			}else{
				counter = 1;
			}
			
			if(counter > maxCounter){
				maxCounter = counter;
				index = i;
			}
		}
		
		for(int i = 0;i < maxCounter;i++){
			System.out.print(splitStr[index] + " ");
		}
	}

}
//Examples:
//Input						Output
//hi yes yes yes bye		yes yes yes

//SoftUni softUni softuni	SoftUni

//1 1 2 2 3 3 4 4 5 5		1 1

//a b b xxx c c c			c c c

//hi hi hi hi hi			hi hi hi hi hi

//hello						hello
