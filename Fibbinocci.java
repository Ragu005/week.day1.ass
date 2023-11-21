package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		
//		0  1  1  2  3  5  8  13  21  34  55  89  144
//
//		Goal: To understand the arthimetic operation and loop
//
//		a) Create a class by name: Fibbinocci
//		b) Create a main method using shortcut
//		c) Write a logic to print fibbinocci from 0 to 56
//
//		Hints: 
//
//		Initialize 3 int variables (Tip: firstNum = 0, secNum = 1, sum = 0)
//		Print first number
//		Iterate from 1 to the 11
//		Add first and second number assign to sum
//		Assign second number to the first number
//		Assign sum to the second number
//		Print sum
		
		int firstNum = 0;
		
		int secNum = 1;
		
		int sum = 0;
		
		System.out.println("Fibbinocci Number "+ firstNum);
		System.out.println("Fibbinocci Number "+ secNum);
		
		for (int i = 0; i < 11; i++) {
			
			sum = firstNum + secNum;
			
			System.out.println("Fibbinocci Number "+sum);
			
			firstNum = secNum;
			
			secNum = sum;
			
		}


	}

}
