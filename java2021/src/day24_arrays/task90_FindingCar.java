package day24_arrays;

public class task90_FindingCar {

	public static void main(String[] args) {
		
		String[] car = {"NIssan","Porsche","Mercedes","Opel","Ford"};
		
		boolean flag = false;
		
		for(int i=0;i<car.length;i++) {
			
			
			
			if(car[i].equals("Ferrari")) {
				
				flag=true;
				break;
			}
			
		}
		
		
		
		
		if(flag) {
			System.out.println("Found ");
		}else {
			System.out.println("Not found  ");
		}
		
		

	}

}
