package day22_stringManipulation_part4;

public class Question_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println(extraEnd("Hello"));
		System.out.println(extraEnd("ab"));
		System.out.println(extraEnd("Hi"));
	}

	private static String extraEnd(String str) {
		
		if(str.length()<2) {
		
			return "Invalid String";
		}else {
			str=str.substring(str.length()-2);
			
			str=str+str+str;
		
		
		return str;
		}
	}

}
