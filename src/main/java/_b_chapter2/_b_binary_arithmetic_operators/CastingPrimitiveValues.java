package _b_chapter2._b_binary_arithmetic_operators;

public class CastingPrimitiveValues {

    public static void main(String[] args) {
        int intValue = 1921222;
        short shortValue = (short) intValue; // Attempting to cast int to short
        System.out.println("int value: " + intValue);
        System.out.println("short value: " + shortValue); // Output will be different from 1921222

        System.out.print(2147483647+1);

        int i = 2147483647+1; //without cast
        System.out.println(i);

        int i_cast = (int) 2147483648L; //without cast
        System.out.println(i_cast);

    }
}
