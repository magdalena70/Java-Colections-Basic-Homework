import java.util.Scanner;

//Write a program to find all increasing sequences inside an array of
//integers. The integers are given in a single line, separated by a space.
//Print the sequences in the order of their appearance in the input array,
//each at a single line. Separate the sequence elements by a space.
//Find also the longest increasing sequence and print it at the last line.
//If several sequences have the same longest length,
//print the leftmost of them.

public class Problem4_LongestIncreasingSequence {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String[] lineSplited = input.nextLine().split(" ");
		int[] numbers = new int[lineSplited.length];
		//Parse string to int
		for (int i = 0; i < lineSplited.length; i++) {
			numbers[i] = Integer.parseInt(lineSplited[i]);
		}

		int counter = 0;
		int counterSequence = 1;
		int indexNumber = 0;
		System.out.print(numbers[0] + " ");
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > numbers[i - 1]) {
				System.out.print(numbers[i] + " ");
				counterSequence++;
			} else {
				System.out.println();
				System.out.print(numbers[i] + " ");
				counterSequence = 1;
			}

			if (counterSequence > counter) {
				counter = counterSequence;
				indexNumber = i;
			}
		}
		//check the index:
		//System.out.printf("\n[index->%d]",indexNumber);
		System.out.println();
		System.out.print("Longest: ");
		int index = (indexNumber - (counter - 1));
		//check the counter:
		//System.out.printf("[counter->%d]\n",counter);
		if(counter > 1){
			for (int y = 0; y < counter; y++) {	
				System.out.print(numbers[index] + " ");
				index++;
			}
		}else{
			System.out.print(numbers[0]);
		}
	}
}
//Example
//Input						Output
//5 -1 10 20 3 4			5
//							-1 10 20
//							3 4
//							Longest: -1 10 20

//3 2 1						3
//							2
//							1
//							Longest: 1