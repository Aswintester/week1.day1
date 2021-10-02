package week1.day1;

public class Assignment1Oct2Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5; // Declare your input as 5
		int fact = 1; // Declare an integer variable fact as 1
		for (int i = 1; i <= num; i++) // Iterate from 1 to your input (tip: using loop concept)
		{
			fact = fact * i; // Within the loop: Multiply fact with the iterator variable (Tip: Assign it to
								// the 'fact' variable)
		} // End of loop
		System.out.println(fact + " is the Factorial of num");// Print factorial (fact)
	}

}


//Learnings
//1. Observing given Pesudocode
//2. Logic 
//3.variables, datatype and forloop