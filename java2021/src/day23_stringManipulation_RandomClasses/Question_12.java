package day23_stringManipulation_RandomClasses;

import java.util.concurrent.CountDownLatch;

public class Question_12 {
	
	
public static void main(String[] args) {
	
	




  System.out.println(catDog("catkjldogjjcatdog"));
   
   
   
}

public static boolean catDog(String str) {
	
int catCounter =0;

int dogCounter=0;



for (int i =0;i<str.length()-2;i++) {
	
	if(str.substring(i, i+3).equals("cat")) {
		
		catCounter++;
		
	
	}
	
    if(str.substring(i, i+3).equals("dog")) {
		
		dogCounter++;
		
	
	}
	
}
System.out.println("catCounter= "+catCounter+" dogCounter= "+dogCounter);


if (catCounter==dogCounter&&catCounter>0) {

	return true;

}else {
	return false;
}

}}