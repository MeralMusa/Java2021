package day22_stringManipulation_part4;

public class Question_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(right2("Hello"));
	}

	private static String right2(String str) {

		if (str.length()>=2) {
			
		
			String dum=str.substring(str.length()-2)+str.substring(0,str.length()-2);
			
			return dum;
	
			
			
		}else {
			
			return "Invalid String";
		}
		
	}

}
