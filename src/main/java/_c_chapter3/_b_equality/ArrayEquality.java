package _c_chapter3._b_equality;

public class ArrayEquality {
	public static void main(String[] args) {
		int[] a1 = new int[2];
		a1[0] = 1;
		a1[1] = 2;

		int[] b1 = new int[2];
		b1[0] = 1;
		b1[1] = 2;

		int[] c1 = a1;

		System.out.println(a1.equals(b1)); //false
		System.out.println(a1 == b1); //false

		System.out.println(a1.equals(c1)); //true
		System.out.println(a1 == c1); //true
	}
}
