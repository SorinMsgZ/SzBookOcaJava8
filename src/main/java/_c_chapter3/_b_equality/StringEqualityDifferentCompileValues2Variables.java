package _c_chapter3._b_equality;

public class StringEqualityDifferentCompileValues2Variables {

	public static void main(String[] args) {
		// !!!!
		System.out.println('\n' + "Using 2 variables to be compared: ");

		System.out.println('\n' + "Test2a - using compound assignment operator: ");
		String g1 = "";
		String gg1 = "abc";
		g1 += "abc";
		System.out.println(g1 == gg1); // false!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		System.out.println(g1.equals(gg1)); // true

		System.out.println('\n' + "Test2b - using simple assignment operator: ");
		String g2 = "";
		String gg2 = "abc";
		g2 = g2 + "abc";
		System.out.println(g2 == gg2); // false
		System.out.println(g2.equals(gg2)); // true

		System.out.println('\n' + "Test2c - using concat() method: ");
		String g3 = "";
		String gg3 = "abc";
		g3 = g3.concat("abc");
		System.out.println(g3 == gg3); // false
		System.out.println(gg3.equals(gg3)); // true
	}

}
