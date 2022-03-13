package day1;

public class Sample {

	public static void main(String[] args) {
		
		System.out.println(0);
		System.out.println(1);
		
		try {
			System.out.println(2/0);
		} 
		//need to change the exception name
		catch (ArithmeticException e) {
			System.out.println("2");

		}
		finally {
			System.out.println("Hello");
		}
		
		
		
		System.out.println(3);
		System.out.println(4);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
