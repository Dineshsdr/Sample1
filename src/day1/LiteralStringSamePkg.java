package day1;

public class LiteralStringSamePkg {

	public static void main(String[] args) {
		// We can able to save multiple data in same memory
		System.out.println("Need Clarification");
		String S1 = "HashCode";
		System.out.println(System.identityHashCode(S1));
		
		
		System.out.println("Doubt");
		String S2 = "Clarification Needed";
		System.out.println(System.identityHashCode(S2));
		
		String S3 = "Help Me";
		System.out.println(System.identityHashCode(S3));
		
		
		
		
	}
	
}
