package day22_stringManipulation_part4;

public class Question_10 {

	public static void main(String[] args) {
		
		
		System.out.println(frontAgain("edited"));
	}

	private static boolean frontAgain(String str) {

		
		String str1 = str.substring(0,2);          
		String str2 = str.substring(str.length()-2);
		
		return str1.equals(str2);
		
		
		

	}

}
