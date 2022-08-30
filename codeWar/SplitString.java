package codeWar;

import java.util.Arrays;

public class SplitString {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(StringSpliter("karem")));
	}

	public static String[] StringSpliter(String word) {

		if (word.length() % 2 != 0)// if odd character we add (_)
			word += "_";

		String arr[] = new String[word.length() / 2];// set size of array by length the word

		for (int i = 0, j = 0; i < word.length(); i += 2, j++) {
			arr[j] = word.substring(i, i + 2);

		}

		return arr;
	}
}
