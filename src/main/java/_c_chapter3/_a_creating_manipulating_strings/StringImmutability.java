package _c_chapter3._a_creating_manipulating_strings;

public class StringImmutability {
    public static void main(String[] args) {
        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3");
        System.out.println(s2);

        s2 += "haha";
        System.out.println(s2);
    }
}
