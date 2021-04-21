package day22_stringManipulation_part4;

public class Question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println(helloName("Bob"));
		System.out.println(helloName("Alice"));
		System.out.println(helloName("X"));
		
		
		
		
		
	}

	private static String helloName(String str) {
		
		
		return "Hello "+str.concat("!");
	}

}
