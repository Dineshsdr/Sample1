package Abstract;

public class Fullyabs2 implements FullyAbstraction{

	private void birthdays() {
		System.out.println("Birthdays Notification");
	}

	@Override
	public void google() {
		System.out.println("google");
	}

	@Override
	public void facebook() {
		System.out.println("facebook");
		
	}
	
	public static void main(String[] args) {
		Fullyabs2 Y2J = new Fullyabs2();
		Y2J.birthdays();
		Y2J.facebook();
		Y2J.google();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
