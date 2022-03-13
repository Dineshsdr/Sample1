package day1;

public class NulPontrExcp {

	public static void main(String[] args) {
	String s = null;
	
	
		try {
			System.out.println(s.charAt(4));

			
		}
		catch (NullPointerException e) {
			System.out.println("Dinesh");
			System.out.println(System.identityHashCode(s));

		}
		finally {
System.out.println("\n=====\nsystem will take hashcode for null value");
		}
		
		
	}
	
	
	
	
}
