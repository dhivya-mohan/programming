
public class StringReverserwithoutRecursion implements StringReverser {
	public String reverse(String str) {
		String ss = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			ss += (str.charAt(i));
		}
		return ss;
	}

}
