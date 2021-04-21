package day23_stringManipulation_RandomClasses;

public class Question_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(atFirst("hello"));
		System.out.println(atFirst("hi"));
		System.out.println(atFirst("h"));
		
		
		
		
		
	}

	private static String atFirst(String str) {
		// TODO Auto-generated method stub
		
		
		if (str.length()>=2){
			
			return str.substring(0,2);
			
		}else {
			
			return str.substring(0)+"@";
		}
	
		
	}

}
