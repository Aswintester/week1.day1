package week1.day1;

public class Assignment1Oct2PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 15;   // Declare an int Input and assign a value 
	
		boolean flag = false; // Declare a boolean variable flag as false
		
		for (int i=2; i<=num/2; i++) // Iterate from 2 to half of the input
		{
			int reminder=num%i; // Divide the input with each for loop variable and check the remainder
			
			if (reminder==0) {
				flag=true;  // Set the flag as true when there is no remainder
				break; // break the iterator
			}	
		}
		
		if (flag) // Check the flag (Provide a condition)
		{
			System.out.println(num + " is not a prime number."); // Print 'Not a Prime' when the condition doesn't match
		}
		else {
			System.out.println(num + " is a prime number."); // Print 'Prime' when the condition matches
		}

	}

}


//What are my learnings from this code?
	 //* 1) what is Prime Number
	 //* 2) for loop, if else condition, Break condition
	 //* 3) how to understand the logic using Pseudocode
	
