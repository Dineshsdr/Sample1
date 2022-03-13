package day1;

public class JumpingStatement {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			
			//  5==4f   5==5t
			if (i==4 || i==5) {
				
				continue;
				
			}
			System.out.println(i);
			
		}
		System.out.println("Success");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
