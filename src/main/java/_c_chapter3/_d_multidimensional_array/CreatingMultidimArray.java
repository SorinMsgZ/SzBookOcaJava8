package _c_chapter3._d_multidimensional_array;

public class CreatingMultidimArray {

	int[][] vars1; // 2D array
	int vars2[][]; // 2D array
	int[] vars3[]; // 2D array
	int[] vars4[], space[][]; // a 2D AND a 3D array

	// asymmetric array - mode 1
	int[][] differentSize = { { 1, 4 }, { 3 }, { 9, 8, 7 } };
	int[][] differentSize2 = new int[][] { { 1, 4 }, { 3 }, { 9, 8, 7 } };

	public static void main(String[] args) {

		CreatingMultidimArray m = new CreatingMultidimArray();
		System.out.println(m.vars1.length); // NullPointerException

		// asymmetric array - mode 2
		int[][] argsx = new int[4][];
		argsx[0] = new int[5];
		argsx[1] = new int[3];

		// int[][] java = new int[][]; //-> does not compile

		// asymmetric array - mode 3
		// int [][] argsy = new int[][3];//-> does not compile

	}
}
