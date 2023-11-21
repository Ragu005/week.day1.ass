package week1.day1;

public class ConvertANegativeNnumberToPositiveNumber {

	public static void main(String[] args) {
		
//		Pseudocode:
//			-----------
//			1. Initialize an integer with a negative number
//			   like, int number = -40;
//			2. Check if the number is a negative number 
//			   Hint : any number that is lesser than zero is a negative number
//			3. If so, convert the number to a positive numer
//
//			4. Print as below
//			        "The number -40 is converted to 40"
		
		
		int number = -40;
		
		if (number < 0) {
			
			System.out.println(number+" is a negative number");
			
		}
		
		else {
			
			System.out.println(number+" is a positive number");
		}
		
		number*=-1;
		
		System.out.println("Number -40 converted to "+ number);


	} 

}
