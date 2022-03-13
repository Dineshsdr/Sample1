package day1;

public class StringMethd2 {
	
	public static void main(String[] args) {
		
		String S1 = "UWelcome";
		String S2 = "uwELCOME";
		
		boolean equals = S1.equals(S2);
		System.out.println(equals);
		
		boolean equalsIgnoreCase = S1.equalsIgnoreCase(S2);
		System.out.println(equalsIgnoreCase);
		
		
		String concat = S1.concat(S2);
		System.out.println("\nConcat data: "+concat);
		
		int compareTo = S1.compareTo(S2);
		System.out.println("\nCompared data: "+compareTo);
		
		boolean equalsIgnoreCase3 = S1.equalsIgnoreCase(S2);
		System.out.println("\nIgnored Case: "+equalsIgnoreCase3);
	}
	
	
	
	

}
