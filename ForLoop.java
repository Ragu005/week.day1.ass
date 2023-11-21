package week1.day1;

public class ForLoop {
	
	public void findPrimeNumber() {
		
		// div 1 and it self
		
				int num = 12;
				
				// 1, 2, 3, 4,
				
				// 13 --> 1, 2,3,......13
				
				int count = 0;
				
				if (num>1) {
					
					for (int i = 1; i <= num; i++) {
						
						if (num%i==0) { // 13 / 2
							
							count++;
							
						}
						
						
						
					}
					
					if (count==2) {
						
						System.out.println(num+ " is a prime number");
					}
					
					else {
						
						System.out.println(num+ " is a not prime number");
					}
					
					
					
				}
				
			
	}
	
	public static void main(String[] args) {
		
		ForLoop obj = new ForLoop();
		
		obj.findPrimeNumber();
			
	}
}
