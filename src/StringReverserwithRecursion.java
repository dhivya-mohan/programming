
public class StringReverserwithRecursion implements StringReverser {
	String reverse = "";

	public String reverse(String str) {
		if (str.length() < 2) {
			return str;
		} else {
			return reverse(str.substring(1)) + str.charAt(0);
		}
	}
}
