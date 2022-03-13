package day1;

public class ImmutableSTring {
	
	private static String concat;

	public static void main(String[] args) {
		
		// Immutable string is to join two strings 
		// join need to use concat
		//finally need to get hashcode
		
		
		System.out.println("Immutable String");
		String S1 = "Java";
		System.out.println(System.identityHashCode(S1));
		
		String S2 = "Doubt";
		System.out.println(System.identityHashCode(S2));
		
		S2 = S1.concat(S2);
		System.out.println(S2);
		System.out.println(System.identityHashCode(S2));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
