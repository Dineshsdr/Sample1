package day1;

public class MutableString {

	public static void main(String[] args) {
		
		//StringBuffer ref = new StringBuffer("Value");
		System.out.println("Mutable String");
		StringBuffer S1 = new StringBuffer("Pranu");
		System.out.println(System.identityHashCode(S1));
		
		StringBuffer S2 = new StringBuffer("SDR");
		System.out.println(System.identityHashCode(S2));
		
		
		//Using apend instead of concat
		S2.append(S1);
		System.out.println(S2);
		System.out.println(System.identityHashCode(S2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
