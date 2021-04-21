package day22_stringManipulation_part4;

public class Question_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(comboString("Hello","hi"));
		System.out.println(comboString("hi","Hello"));
		System.out.println(comboString("aaa","b"));
		
	}

	private static String comboString(String str1, String str2) {
		
		if(str1.length()>str2.length()) {
			return str2+str1+str2;
		}else {
			
			return str1+str2+str1; 
		}
		
	}

}
