package _c_chapter3._c_java_arrays;

public class ArrayOfPrimitives {
    public static void main(String[] args) {
        //3 ways to create the array
        int[] numbers1 = new int[3];
        int[] numbers2 = new int[]{42, 55, 99};
        int[] numbers3 = {42, 55, 99};

        //multiple arrays in declaration
        int[] ids1, types1; //-> 2 variables (arrays) of type int[]
        int ids2[], types2; //-> 2 variables (1 array and 1 int) - one variable (array) of type int[] and one variable of type int

        ids2 = new int[3]; //array of type int[]
        types2 = 1; //int

    }
}
