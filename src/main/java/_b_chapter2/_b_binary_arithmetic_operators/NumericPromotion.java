package _b_chapter2._b_binary_arithmetic_operators;

public class NumericPromotion {
  /*

    Numeric Promotion Rules

    1. If two values have different data types,
    Java will automatically promote one of the values to the larger of the two data types.

    2. If one of the values is integral and the other is floating-point,
    Java will automatically promote the integral value to the floating-point value’s data type.

    3. Smaller data types, namely byte, short, and char,
    are first promoted to int any time they’re used with a Java binary arithmetic operator,
    even if neither of the operands is int.

    4. After all promotion has occurred and the operands have the same data type,
    the resulting value will have the same data type as its promoted operands.

    */


    public static void main(String[] args) {
        short a = 10;
        short b= 3;
        System.out.println(a/b);

        char c=10000;
        char d=20000;

        System.out.println("sum of (10000 + 20000) chars is: " + (c+d));

        char e ='t';
        char f= 'e';

        System.out.println("casting char 't' means: " + (int) e);
        System.out.println("casting char 'e' means: " + (int) f);
        System.out.println("the result of sum ('t' + 'f') (chars) is: " + (e+f));

        char g ='t';
        char h= 1;

        System.out.println("the result of sum ('t' + 1) (chars) is: " + (g+h));
    }
}
