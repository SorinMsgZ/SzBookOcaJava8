package _c_chapter3._c_java_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UsingArray {
	public static void main(String[] args) {
		String[] mammals = { "monkey", "chimp", "donkey" };
		System.out.println(mammals.length); // 3 ; mammals is an array - length property!
		System.out.println(mammals[0]); // monkey
		System.out.println(mammals[1]); // chimp
		System.out.println(mammals[2]); // donkey

		int[] numbers = new int[10];
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = i + 5;

		numbers[10] = 3;// ->ArrayIndexOutOfBoundsException
		numbers[numbers.length] = 5;// ->ArrayIndexOutOfBoundsException
		for (int i = 0; i <= numbers.length; i++)
			numbers[i] = i + 5;// ->ArrayIndexOutOfBoundsException

		// test
		char[] c = new char[2];
//        int length = c.length(); //-> does not compile
		int length = c.length; //c is an array!
		mammals[0].length(); //this element is of type String - length() method

		List<String> xList = Arrays.asList("s", "d");
		xList.size();

	}
}
