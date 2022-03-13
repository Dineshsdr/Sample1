package day1;

public class Array {

	public static void main(String[] args) {
		
		int s [] = new int [4];
		
		s[0]=10;
		s[1]=20;
		s[2]=30;
		
		System.out.println(s[0]);
		
		System.out.println("\nFor Loop:\n=====");
		for (int i = 0; i < 3; i++) {
			System.out.println(s[i]);
		}
		System.out.println("\nFor Enhanced For Loop\n======");
		for (int j : s) {
			System.out.println(j);
			
		}
	
	}
	
	
	
	
	
	
}
