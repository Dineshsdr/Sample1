package Abstract;

public class Source extends EmployeeLogin {

	private void facebook() {
		System.out.println("Facebook1");
	}

	@Override
	public void instagram() {
		System.out.println("Instagram 234");
	}

	@Override
	public void details() {
		System.out.println("Detais number 2");
		
	}
	
	public static void main(String[] args) {
		Source AS = new Source();
		AS.facebook();
		AS.instagram();
		AS.login();
		AS.details();
	}
	
	
	
	
	
	
	
	
}
