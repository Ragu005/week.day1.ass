package week1.day1;

public class CheckIsGivenNumerPositiveOrNegative {
	
	
//	Pseudocode:
//		----------
//		 1. Initialize a number, say, int number= 35;
//		 2. If a number is positive, print "The number is positive"
//		    If a number is negative, print "The number is negative"
//		    If it nether negative nor positive, print as "The number is neither positive nor negative"


	public void postive() {
		// TODO Auto-generated method stub
		
		int number = -40 ;
		
		if (number > 0) {
			
			System.out.println("The number is positive");
			
		}
		
		else if (number < 0) {
			
			System.out.println("The number is negative");
			
		}
		
		else {
			
			System.out.println("The number is neither positive nor negative");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		CheckIsGivenNumerPositiveOrNegative obj = new CheckIsGivenNumerPositiveOrNegative();
		
		obj.postive();
		
		System.out.println("The number is neither positive nor negative");
	}
	
	
}
