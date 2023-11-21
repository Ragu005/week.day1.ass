package week1.day1;

public class ArmStrongNumber {
	
	public static void main(String[] args) {
		int num=152;
		int sum=0;
		int original=num;
		while(num>0) {
		int remainder=num%10;
		sum=sum+(remainder*remainder*remainder);
		num=num/10;
		System.out.println(sum);
	}
		if(sum==original) {
			System.out.println("the given number is ArmStrongNumber");
		}else {
			System.out.println("the given number is not ArmStrongNumber");
		}
	}

}
