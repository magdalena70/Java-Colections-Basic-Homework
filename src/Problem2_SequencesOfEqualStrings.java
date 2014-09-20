import java.util.Scanner;

//Write a program that enters an array of strings and finds in it
//all sequences of equal elements.
//The input strings are given as a single line, separated by a space.

public class Problem2_SequencesOfEqualStrings {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String[] sequenceArr = input.nextLine().split(" ");
		
		for(int i = 0;i < sequenceArr.length - 1;i++){
			if(sequenceArr[i].equals(sequenceArr[i+1])){
				System.out.print(sequenceArr[i] + " ");
			}else{
				System.out.println(sequenceArr[i]);
			}
		}
		if(sequenceArr[sequenceArr.length-2].equals(sequenceArr[sequenceArr.length-1])){
			System.out.print(sequenceArr[sequenceArr.length-1]);
		}else{
			System.out.println(sequenceArr[sequenceArr.length-1]);
		}
	}
}
//Examples:
//Input						Output
//hi yes yes yes bye		hi
//							yes yes yes
//							bye
	
//SoftUni softUni softuni	SoftUni
//							softUni
//							softuni
	
//1 1 2 2 3 3 4 4 5 5		1 1
//							2 2
//							3 3
//							4 4
//							5 5
	
//a b b xxx c c c			a
//							b b
//							xxx
//							c c c
	
//hi hi hi hi hi			hi hi hi hi hi
//hello						hello
