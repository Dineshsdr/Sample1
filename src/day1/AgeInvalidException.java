package day1;

public class AgeInvalidException extends Exception {

	
	@Override
	public String getMessage() {
		
		String New = "Age is not Eligible";
		return New;
	}
	
	
	
	
}
