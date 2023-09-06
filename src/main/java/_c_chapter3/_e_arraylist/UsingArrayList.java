package _c_chapter3._e_arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class UsingArrayList {

	public static void main(String[] args) {

		ArrayList<String> flights2 = new ArrayList<>();
		flights2.add("sd1");
		flights2.add("sd2");
		flights2.add(null);
		System.out.println(flights2.toString());
		// [sd1, sd2] - prints in a nice way
//        flights2.add(1); //--> does not compile - string expected
		

		ArrayList list = new ArrayList();
		list.add("hawk"); // [hawk]
		list.add(Boolean.TRUE); // [hawk, true]
		list.add(1); // this is a primitive
		list.add(null);
		System.out.println(list); // [hawk, true]
		//Collections.sort(list); // runtime exception
		//System.out.println("Ordered ArrayList: " + list);

		list.size();
		
		
		
		ArrayList listX = new ArrayList();
		listX.add("hawk"); 
		listX.add("3"); 
		listX.add("1"); 
		//listX.add(null);
		System.out.println(listX); // 
		Collections.sort(listX); // works without null or other than String elements
		System.out.println("Ordered ArrayList: " + listX);
		
		

		/*
		 * for(int i : list) { //cannot convert from Object to int }
		 */
		
		for(String i : flights2) {
			System.out.println(i);
		}
		
		ArrayList<Integer> test = new ArrayList<>();
		test.add(1);
		test.add(2);
		test.add(null);
		
		for(Integer i : test) {// i is of reference type Integer
			System.out.println(i); // works fine
		}
		
		for(int i : test) { // i is of primitive type int
			System.out.println(i); //runtime exception
		}
		
	}

}
