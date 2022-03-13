package day1;

public class UserDifinExcptn {

	public static void main(String[] args) {

		
		int age = 22;
		
		if (age==23) {
			System.out.println("Eligible to Vote");
		} 
		else {
			try {
				throw new AgeInvalidException();
			} catch (Exception e) {
				e.printStackTrace();

			
			}

		}

	}

}
