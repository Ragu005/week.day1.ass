package week1.day1;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "poTss";
		
		char[] charArray = text1.toCharArray();
		
		char[] charArray2 = text2.toCharArray();
		Arrays.sort(charArray);
		System.out.println(charArray);
		Arrays.sort(charArray2);
		System.out.println(charArray2);
		if(Arrays.equals(charArray, charArray2)){
			System.out.println("Anagram");
		}else {
			System.out.println("not an Anagram");
		}
	}

}
