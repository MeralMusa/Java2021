package day24_arrays;

import java.util.Scanner;

public class task87_DayArray {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		String[] day = new String[7];
		
		day[0]="Monday";
		day[1]="Tuesday";
		day[2]="Wednesday";
		day[3]="Thursday";
		day[4]="Friday";
		day[5]="Saturday";
		day[6]="Sunday";
		
		System.out.print("Enter your day:");
		int index = sc.nextInt();
		
		System.out.println("The day is : " + day[index]);
		
		
				
		

	}

}
