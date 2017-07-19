
public class Maincontroller {
	public static void main(String[] args) {
		String case1 = "Hai";
		String case2 = "Hello";
		String expected1 = "iaH";
		String expected2 = "olleH";

		StringReverserwithoutRecursion sr = new StringReverserwithoutRecursion();
		StringReverserwithoutRecursion sr1 = new StringReverserwithoutRecursion();

		// Timing code for with recursion

		long startw = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			String result = sr1.reverse("Hello everyone");
		}
		long endw = System.currentTimeMillis();
		long withRecursionTime = endw - startw;
		System.out.println("Time taken to reverse a string with recursion" + " " + withRecursionTime + " ms");

		// Timing code for without recursion
		long startwo = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			String result = sr.reverse("Hello everyone");
		}
		long endwo = System.currentTimeMillis();
		long withoutRecursionTime = endwo - startwo;

		System.out.println("Time taken to reverse a string without recursion" + " " + withoutRecursionTime + " ms");

		String result1 = sr.reverse(case1);
		if (result1.equals(expected1))
			System.out.println("pass");
		else
			System.out.println("fail");

		String result2 = sr1.reverse(case1);
		if (result2.equals(expected1))
			System.out.println("pass");
		else
			System.out.println("fail");
		String result3 = sr.reverse(case2);
		if (result3.equals(expected2))
			System.out.println("pass");
		else
			System.out.println("fail");

		String result4 = sr1.reverse(case2);
		if (result4.equals(expected2))
			System.out.println("pass");
		else
			System.out.println("fail");

	}

}
