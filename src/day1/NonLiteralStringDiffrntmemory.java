package day1;

public class NonLiteralStringDiffrntmemory {

	public static void main(String[] args) {
		
		System.out.println("Non Literal String");
		String S1 = new String("Nwe Java");
		System.out.println(System.identityHashCode(S1));
		
		String S2 = new String("New Topic");
		System.out.println(System.identityHashCode(S2));
		
		String S3 = new String("Homework");
		System.out.println(System.identityHashCode(S3));
	}
	
}
