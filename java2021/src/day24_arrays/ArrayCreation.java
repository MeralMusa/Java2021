package day24_arrays;

public class ArrayCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		int score1=85;
		int score2=85;
    	int score3=100;
        int score4=90;
 		int score5=76;
        int score6=85;
        int score7=826;
        int score8=85;
		
		
		int avgScroe=(score1+score2+score3+score4+score5+score6+score7+score8)/8;

		System.out.println(avgScroe);
		
		
		

		//Option-1
		int[] numbers;
		numbers = new int[3]; 
		
		//Option-2
		int[] numbers1 = new int[4];
		float[] temp = new float[100];
		char[] letters = new char[40];
		long[] units = new long[50];
		String words[] = new String[5];
		
		System.out.println(numbers[2]); //default value for int   is 0
		System.out.println(temp[82]);//default value for int   is 0.0
		System.out.println(words[4]);  //default value for string is null
		System.out.println(letters[20]);//default value for string is 0
	
		System.out.println(units[49]);//default value for string is 0


	}
	

}
