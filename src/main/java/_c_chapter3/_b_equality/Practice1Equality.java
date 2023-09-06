package _c_chapter3._b_equality;

public class Practice1Equality {
    public static void main(String[] args) {

        String x1 = new String("Hello World");
        String y1 = "Hello World";
        System.out.println(x1 == y1); // false


        String x2 = "Hello World";
        String z2 = " Hello World".trim();
        System.out.println(x2.equals(z2)); // true
    }
}
