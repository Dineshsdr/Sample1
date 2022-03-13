package ConditionalStatement;

public class LadderIf {

	public static void main(String[] args) {
	
		int age = 10;
		
		if (age == 4) {
			System.out.println("Value 1");
		
	  }
		else if (age == 9) {
			System.out.println("Value 2");
		}
		else if (age >= 12) {
			System.out.println("Value 3");
		}
		else if (age == 90) {
			System.out.println("Value 4");
		}
		
		else {
			System.out.println("No Value");
		}
	}	
}
