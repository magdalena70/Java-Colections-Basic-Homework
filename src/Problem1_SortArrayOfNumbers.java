import java.util.Scanner;

//Write a program to enter a number n and n integer numbers and sort
//and print them. Keep the numbers in array of integers: int[]. 

public class Problem1_SortArrayOfNumbers {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int countN = sc.nextInt();
		sc.nextLine();
		String[] numbers = sc.nextLine().split(" ");		
		int[] numInt = new int[numbers.length];
		
		for(int i = 0;i < countN;i++){
			numInt[i] = Integer.parseInt(numbers[i]);
		}
		
		for(int i = 0;i < numInt.length - 1;i++){
			for(int y = i + 1;y < numInt.length;y++){
				if(numInt[i] > numInt[y]){
					int x = numInt[i];
					numInt[i] = numInt[y];
					numInt[y] = x;
				}
			}
		}
		
		for(int number:numInt){
			System.out.print(number + " ");
		}
		
	}

}
//Examples:
//Input	                 Output
//7
//6 5 4 10 -3 120 4	    -3 4 4 5 6 10 120

//3
//10 9 8	             8 9 10

//1
//999	                 999

