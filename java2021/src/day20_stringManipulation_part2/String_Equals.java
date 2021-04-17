package day20_stringManipulation_part2;

public class String_Equals {

	public static void main(String[] args) {
		
		String s1 = "Welcome to Java";
		String s2 = "Welcome to Java";
		String s3 = "Welcome to C++";
		
		boolean b1 = s1.equals(s2);
		boolean b2 = s1.equals(s3);
		
		System.out.println(b1 + "|" + b2);
		
		boolean b3 = s1==s2;
		boolean b4 = s1==s3;
		
		System.out.println(b3 + "|" + b4);
		
		String s4 = new String("Welcome to Java");
//      String new keyword created a new object 
//		on the heap memory,by that we have two Strings with the 
//		same value but stored different. S1 on stringpool s4 outside 
//		from string pool in the Heap memory. This is the reason why 
//      it comes False by comparing, unless we choose equals method.
	System.out.println(s1==s4);
		System.out.println(s1.equals(s4));

	}

}
