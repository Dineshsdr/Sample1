package day1;

import java.util.ArrayList;
import java.util.List;
//collection
public class IndxoutbondsCollection {

	public static void main(String[] args) {
		
		List<Integer> s = new ArrayList<>();
		
		s.add(10);
		s.add(20);
		
		System.out.println(s.get(0));
		
		try {
			System.out.println(s.get(3));
		} 
		catch (IndexOutOfBoundsException e) {
			System.out.println(s.get(1));
			}

		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
