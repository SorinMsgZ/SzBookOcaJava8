package _c_chapter3._b_equality;

public class StringEquality {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = new String("abc");

        System.out.println(s1.equals(s2));
    }
}
