package _c_chapter3._b_equality;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEquality {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<String>();
		list1.add("a");
		list1.add("b");
		list1.add("c");

		List<String> list2 = new ArrayList<String>();
		list2.add("a");
		list2.add("b");
		list2.add("c");
		
		List<String> list3 = list1;

		System.out.println(list1.equals(list2)); // true
		System.out.println(list1 == list2); // false
		
		System.out.println(list1.equals(list3)); // true
		System.out.println(list1 == list3); // true

	}

}
