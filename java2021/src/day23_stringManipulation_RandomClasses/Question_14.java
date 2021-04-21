package day23_stringManipulation_RandomClasses;

public class Question_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println(endsLy("oddly"));
		System.out.println(endsLy("y"));
		System.out.println(endsLy("oddy"));
		
		
		
		
	}

	private static boolean endsLy(String str) {

	if (str.contains("ly")) {
		
		
		return true;
	}else {
		
		return false;
	}
	
	
	
	}

}
