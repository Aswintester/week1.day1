package week1.day1;

public class Assignment1Oct2Fibonacci {

	public static void main(String[] args) {

		int range = 8;
		int firstNum = 0;
		int secNum = 1;
//initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)

		System.out.println(firstNum); // Print first number
		for (int i = 1; i <= range; i++) // Iterate from 1 to the range
		{
			int sum = firstNum + secNum; // add first and second number assign to sum
			firstNum = secNum; // Assign second number to the first number
			secNum = sum; // Assign sum to the second number
			System.out.println(sum); // print sum
		}

	}

}

//Learning
//1. Just typed the program as given in Pseudo code
//2. Learnt what is fibonacci series is
