package day23_stringManipulation_RandomClasses;

public class Question_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(hasBad("badxx"));
		System.out.println(hasBad("xbadxx"));
		System.out.println(hasBad("xxbadxx"));
		
		
		
	}

	private static boolean hasBad(String str) {
		// TODO Auto-generated method stub
		
		
		if(str.substring(0, 3).contains("bad")||str.substring(1, 4).contains("bad")){
			
			return true;
		}else {
			
			return false;
		}
	}

}
