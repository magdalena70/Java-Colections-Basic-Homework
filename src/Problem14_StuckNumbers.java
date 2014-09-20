import java.util.Scanner;

//You are given n numbers. Write a program to find among these numbers
//all sets of 4 numbers {a, b, c, d}, such that a|b == c|d,
//where a ≠ b ≠ c ≠ d. Assume that "a|b" means to append the number
//b after a. We call these numbers {a, b, c, d} stuck numbers:
//if we append a and b, we get the same result like if we append c and d.
//Note that the numbers a, b, c and d should be distinct (a ≠ b ≠ c ≠ d).
//Input
//The input comes from the console. The first line holds the count n.
//The next line holds n integer numbers, separated by a space.
//The input numbers will be distinct (no duplicates are allowed).
//The input data will always be valid and in the format described.
//There is no need to check it explicitly.
//Output
//Print at the console all stuck numbers {a, b, c, d} found in the input
//sequence in format "a|b==c|d" (without any spaces), each at a separate
//line. The order of the output lines is not important.Print "No" in case
//no stuck numbers exist among the input sequence of numbers.

public class Problem14_StuckNumbers {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[] numbers = sc.nextLine().split(" ");
		
		for(int num1 = 0;num1 < n;num1++){
			for(int num2 = 0;num2 < numbers.length;num2++){
				for(int num3 = 0;num3 < numbers.length;num3++){
					for(int num4 = 0;num4 < numbers.length;num4++){
						if( numbers[num1]!=numbers[num2]&&
								numbers[num2]!=numbers[num3]&&
								numbers[num3]!=numbers[num4]&&
								numbers[num4]!=numbers[num1]&&
								numbers[num1]!=numbers[num3]&&
								numbers[num2]!=numbers[num4] ){
							
							if((numbers[num1]+numbers[num2]).equals
							(numbers[num3]+numbers[num4])){
								System.out.printf("%s|%s == %s|%s\n",
										numbers[num1],numbers[num2],
										numbers[num3],numbers[num4]);	
							}
						}
					}
				}
			}
		}
	}
}
//Examples
//Input							Output
//5								2|51==25|1								
//2 51 1 75 25					25|1==2|51

//7								
//2 22 23 32 322 222 5			2|322==23|22
//								23|22==2|322
//								32|22==322|2
//								32|222==322|22
//								322|2==32|22
//								322|22==32|222