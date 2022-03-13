package day1;

public class ThrowDuplicateException {

	public static void main(String[] args) {
		System.out.println(0);
		System.out.println(1);

		try {
			System.out.println(2 / 0);

		}

		catch (ArithmeticException e) {
			throw new NullPointerException();
		} catch (Exception e) {
			System.out.println("2");
		} finally {
			System.out.println("Final");

		}
		System.out.println(3);
		System.out.println(4);

	}

}
