package week1.day1;

public class IsPrime {
	
	public static void main(String[] args) {
		
//		Goal: To understand the problem solving, looping and conditional statement
//
//		a) Create a class by name: IsPrime
//		b) Create a main method using shortcut
//		c) Write a logic to find if the given number is prime or not
//		d) Print if it is prime or not
//
//		Hint: Iterate through all numbers from 2 to n-1 (input) and 
//		for every number check if it divides n (input). 
//		If we find any number that divides, print prime.
//		If nothing divides, then print non-prime

		int number = 12;
		
		boolean flag = true;
		
		if (number <=1) {
			
			flag =false;
			
		}
		else {
			
			for (int i = 2; i <=number/2; i++) {
				
				if (number% i == 0) {
					
					flag = false;
					
					break;
					
				}
				
			}
		}
		
		if (flag) {
			
			System.out.println(number+" is a prime number");
			
		}
		
		else {
			
			System.out.println(number+ " is a notPrime number");
		}
	}

}
