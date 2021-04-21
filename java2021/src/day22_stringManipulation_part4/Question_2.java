package day22_stringManipulation_part4;

public class Question_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(makeAbba("Hi","Bye"));
		System.out.println(makeAbba("Yo","Alice"));
		System.out.println(makeAbba("What","Up"));
	}

	private static String  makeAbba(String a, String b) {
		
		

		
		
		return a+b+b+a;
	}

}
