package day22_stringManipulation_part4;

public class Question_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(	withoutEnd("Hello"));
		System.out.println(	withoutEnd("java"));
		System.out.println(	withoutEnd("coding"));
		System.out.println(	withoutEnd("ck"));
		
		

		
	}

	private static String withoutEnd(String str) {

		if (str.length()>2) {
			return str.substring(1, str.length()-1);

		}else {
			
			return" Invalid string";
		}
		
		
	}

	
}
