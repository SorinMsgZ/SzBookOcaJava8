package _c_chapter3._b_equality;

public class EqualityPractice2 {
    String name;

    public static void main(String[] args) {
        EqualityPractice2 t1 = new EqualityPractice2();
        EqualityPractice2 t2 = new EqualityPractice2();
        EqualityPractice2 t3 = t1;
        System.out.println(t1 == t1); // true
        System.out.println(t1 == t2); // false
        System.out.println(t1.equals(t2)); // false
    }
}

