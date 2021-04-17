package day21_stringManipulation_part3;

public class String_Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String Sentence = "Java String Manipulation is fun!";

		System.out.println(Sentence.substring(2));
		System.out.println(Sentence.substring(5, 11));
		
		System.out.println(Sentence.length());
		System.out.println(Sentence.substring(5,Sentence.length()-5));
		
		

		String chars= "{{}}";
		
		String word = "AUTOMATION";
		
		String result= chars.substring(0,2).concat(word).concat(chars.substring(2));
		
		System.out.println(result);
		
		System.out.println(word.toLowerCase());
		
		
		
		

	}

}
