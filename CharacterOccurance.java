package week1.day1;

public class CharacterOccurance {
	
	public static void main(String[] args) {
		//input  String str = "You have no choice other than following me!";
		//output   Occurrence of o is:6
		int count = 0;
		String str = "You have no choice other than following me!";
		//String converted into character Array
		char[] ch = str.toCharArray();
		//Iterate the values 0 to Array length
		for (int i = 0; i < ch.length; i++) {
			//If it is matched Increse the count
			if (ch[i] == 'o') {
				count++;
			}
		}
		//Print the String and count
		System.out.println("Given String is : " + str);
		System.out.println("Occurrence of o is:" + count);
	}


}
