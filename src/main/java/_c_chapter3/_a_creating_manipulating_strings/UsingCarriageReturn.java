package _c_chapter3._a_creating_manipulating_strings;

public class UsingCarriageReturn {
    public static void main(String[] args) {
        System.out.println("Using carriage return 1");
        System.out.println("Using carriage return 2");
        System.out.println("Aaaaabcs" + '\r' + "X");

        System.out.println("abc" + '\r' + "def");
    }
}
