package algorithms;

public class InsretSpaces {
	public static void main(String[] args) {
		String s = "ABC";
		char[] chars = s.toCharArray();
		for (char ch : chars) {
			String temp = "";
			for (int i = 0; i < chars.length - 1; i++) {
				temp = temp + ch + " ";
			}
		}
	}
}