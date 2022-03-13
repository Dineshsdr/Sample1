package day1;

public class StringOutofBondExcpt {

	public static void main(String[] args) {
		String s = "null";
				
		
		
		try {
			System.out.println(s.charAt(8));

		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(4);

		}
		finally {
			System.out.println("Practise Makes Perfec");
		}
		System.out.println(System.identityHashCode(s));
				
	}
	
	
	
	
	
	
}
