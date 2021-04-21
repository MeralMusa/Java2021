package day23_stringManipulation_RandomClasses;

public class Question_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println(doubleChar("The"));
		System.out.println(doubleChar("AAbb"));
		System.out.println(doubleChar("Hi-There"));
		
	}

	private static String  doubleChar(String str) {
		
		String  dum ="";
		
		for (int i =0;i<str.length();i++) {
			
			
			dum=dum+str.charAt(i)+str.charAt(i);
			
			
			}
		
		
		return dum;
		// TODO Auto-generated method stub
	}

}
