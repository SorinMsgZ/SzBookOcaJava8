package _c_chapter3._d_multidimensional_array;

public class UsingMultiDimArray {
    public static void main(String[] args) {

        int[][] twoD = new int[3][2];

        //using standard for loop
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++)
                System.out.print(twoD[i][j] + " "); // print element
            System.out.println();                 // time for a new row
        }

        //using for each loop (easyer to read
        for (int[] inner : twoD) {
            for (int num : inner)
                System.out.print(num + " ");
            System.out.println();
        }
    }
}
