package day2;

public class AcesSpecifierDeflt2 extends AcesSpecifersDefautl{

	private void Child1() {
		System.out.println("child 1");
	}
	public static void main(String[] args) {
	
		AcesSpecifierDeflt2 A = new AcesSpecifierDeflt2();
	//	AcesSpecifersDefautl B = new AcesSpecifersDefautl();
	//	B.empId();
	//	B.empName();
	//	B.empLoc();
		A.Child1();
		A.empId();
		A.empName();
		A.empLoc();
	}
	
	
	
	
	
	
}
