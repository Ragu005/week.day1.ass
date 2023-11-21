package week1.day1;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		
		int num = 34343;
		
		int temp ;
		
		temp = num;
		
		int rev = 0;
		
// 0*10 + 34343%10
		
		for (;num!=0;num=num/10) {  // 34343 , 3434, 343....
			
			// 3434.3, 343.4
			rev = rev * 10 +num%10;  // 3434.3, 343.4
			}
		
		if(temp==rev) {
			
			System.out.println(temp+ " is a Palindrome Number");
		}
		
		else {
			
			System.out.println(temp+ " is a not Palindrome Number");
		}
	}

}
