package _c_chapter3._a_creating_manipulating_strings;

import java.util.Arrays;

public class StringPractice {

	public static void main(String[] args) {

		String[] strings = { "1000", "9", "109" };
		Arrays.sort(strings);
		for (String string : strings)
		  System.out.print(string + " ");

	}
}
