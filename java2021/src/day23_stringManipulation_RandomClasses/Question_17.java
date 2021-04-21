package day23_stringManipulation_RandomClasses;

public class Question_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println(isPalindrom("levlev"));
		System.out.println(isPalindrom("wow"));
		System.out.println(isPalindrom("topspot"));
		System.out.println(isPalindrom("cannvas"));
		System.out.println(isPalindrom("kaaa k"));
		
		
	}

	private static boolean isPalindrom(String str) {
		
		
		str=str.replace(" ", "");
		String dum1="";
		String dum2="";
		
	for(int i =str.length()-1;i>=0;i--){
		
		
		dum1+=str.charAt(i);
		
			
		}
		
		if(str.equalsIgnoreCase(dum1)) {
			
			return true ;
		}else {
			
			return false;
		}
	}
		
		
	
		}
		

