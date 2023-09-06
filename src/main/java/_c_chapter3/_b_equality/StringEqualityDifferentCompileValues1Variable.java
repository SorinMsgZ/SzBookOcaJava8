package _c_chapter3._b_equality;

public class StringEqualityDifferentCompileValues1Variable {

	public static void main(String[] args) {

		// !!!!
		
		System.out.println('\n' +"Using just 1 variables and comparing it to a literal: ");

		System.out.println('\n' + "Test1a - using compound assignment operator: ");
		String s1 = "";
		s1 += "abc";
		System.out.println(s1 == "abc"); // false!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		System.out.println(s1.equals("abc")); // true

		System.out.println('\n' + "Test1b - using simple assignment operator: ");
		String s2 = "";
		s2 = s2 + "abc";
		System.out.println(s2 == "abc"); // false
		System.out.println(s2.equals("abc")); // true

		System.out.println('\n' + "Test1c - using concat() method: ");
		String s3 = "";
		s3 = s3.concat("abc");
		System.out.println(s3 == "abc"); // false
		System.out.println(s3.equals("abc")); // true
	}

}
