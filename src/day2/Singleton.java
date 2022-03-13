package day2;

public class Singleton {

	// Step1: Declare your object/variable for the class
	static Singleton s = null;

	// Step2: Declare your constructor as private(
	private Singleton() {

	}

	// Step3: Create a method for object creation
	private static Singleton getInstance() {

		// null==null
		if (s == null) {
			// ref=new Classname
			s = new Singleton();

		}
		return s;

	}

	// Step4: Create all the methods you want
	private void empId() {
		System.out.println("Emp ID: 519506");
	}

	public static void main(String[] args) {
		Singleton e = getInstance();
		System.out.println(System.identityHashCode(e));

		Singleton e1 = getInstance();
		System.out.println(System.identityHashCode(e1));

		Singleton e2 = getInstance();
		System.out.println(System.identityHashCode(e2));
		
		e.empId();
		e1.empId();
		e2.empId();

	}
}
