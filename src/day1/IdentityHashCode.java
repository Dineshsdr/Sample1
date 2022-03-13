package day1;

public class IdentityHashCode {

	public static void main(String[] args) {
		
		String s1 = "Dinesh";
		
		int identityhashcode = System.identityHashCode(s1);
		
		//to Print the memory addres
		System.out.println(identityhashcode);
		
		// Need clarification why this logic again used
		System.out.println(System.identityHashCode(s1));

		
		
	}
	
	
	
	
	
	
}
