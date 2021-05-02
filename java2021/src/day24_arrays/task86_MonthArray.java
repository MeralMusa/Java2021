package day24_arrays;

import java.util.Scanner;

public class task86_MonthArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] myArr = new String[12];
		
		myArr[0]="Jan";
		myArr[1]="Feb";
		myArr[2]="March";
		myArr[3]="April";
		myArr[4]="May";
		myArr[5]="June";
		myArr[6]="July";
		myArr[7]="August";
		myArr[8]="Sept";
		myArr[9]="October";
		myArr[10]="Nov";
		myArr[11]="Dec";
		
		
		
		System.out.print("Enter your month index number:");
		
		
		int ind = sc.nextInt();
		
		System.out.println("The month is " + myArr[ind]);
		
		
		
		
		System.out.println(myArr);
		
		
		
		
		
	}

}
