package week1.day1;

public class PrintEvenNumber {
	
	public static void main(String[] args) {
		
		for (int i = 1; i < 20; i++) {
			
			if (i%2==0) {
				
				System.out.println("Even Numbers "+i);
				
			}
			
			else {
				
				System.out.println("odd number "+i);
			}
		}
	}

}
