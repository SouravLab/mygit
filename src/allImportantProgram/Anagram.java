package allImportantProgram;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
System.out.println(isAnagram("ccc", "cba"));
	}

	public static boolean isAnagram(String str1, String str2) {
		boolean flag = false;
		if (!str1.isEmpty() && !str2.isEmpty()) {
			String strlow1 = str1.toLowerCase().trim();
			String strlow2 = str2.toLowerCase().trim();
			char[] c1 = strlow1.toCharArray();
			char[] c2 = strlow2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			if (c1.length == c2.length) {
				return  Arrays.equals(c1, c2);

			} else {
				System.out.println("Both given string length are not equal ...");
			}
		} else
			System.out.println("string is empty ...");
		return flag;

	}

}
