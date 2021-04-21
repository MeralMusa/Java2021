package day22_stringManipulation_part4;

public class Question_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(firstHalf("WooHoo"));
		System.out.println(firstHalf("HelloThere"));
		System.out.println(firstHalf("abcdef"));
		
		
	}

	private static String firstHalf(String str) {
		// TODO Auto-generated method stub
		
		return str=str.substring(0, str.length()/2);
	}

}
