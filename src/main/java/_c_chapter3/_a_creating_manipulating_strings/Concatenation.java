package _c_chapter3._a_creating_manipulating_strings;

public class Concatenation {
    public static void main(String[] args) {
        System.out.println('\t' + "Example1: ");
        System.out.println(1 + 2);           // 3
        System.out.println("a" + "b");       // ab
        System.out.println("a" + "b" + 3);   // ab3
        System.out.println(1 + 2 + "c");     // 3c

        System.out.println('\t' + "Example2: ");
        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four);

        System.out.println('\t' + "Example3: ");
        String s = "1";             // s currently holds "1"
        s += "2";                   // s currently holds "12"
        s += 3;                     // s currently holds "123"
        System.out.println(s);      // 123
    }
}
