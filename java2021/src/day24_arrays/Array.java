package day24_arrays;

public class Array {

	public static void main(String[] args) {
		
		int[] List = {10,20,30,40};
		
		String[] myArray = {"Apple","Orange","Watermelon"};
		
		System.out.println(List[0]);
		System.out.println(List[1]);
		System.out.println(List[2]);
		System.out.println(List[3]);
		
		System.out.println(List.length);
		System.out.println(myArray.length);
		
		for(int i=0;i<List.length;i++) {
			System.out.println(List[i]);
		}
		
		
		
		int[] score = {80,90,100,35,60,72,64,30,10,5,3,99,89,80,90,100,35,60,72,64,30,10,5,3,99,89};
		
		int sum = 0;
		
		
		
		
		for(int i=0;i<score.length;i++) {
			
			sum = sum + score[i];
		}
		
		
		
		
		System.out.println("Sum is:" + sum);
		
		System.out.println("Total element in array is:" + score.length);
		System.out.println("Average is:" + sum/score.length);
		
		
		
		
		

		
		

	}

}
