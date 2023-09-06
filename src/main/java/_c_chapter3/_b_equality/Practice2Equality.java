package _c_chapter3._b_equality;

public class Practice2Equality {
    String name;

    public static void main(String[] args) {
        Practice2Equality t1 = new Practice2Equality();
        Practice2Equality t2 = new Practice2Equality();
        Practice2Equality t3 = t1;
        System.out.println(t1 == t1); // true
        System.out.println(t1 == t2); // false
        System.out.println(t1.equals(t2)); // false
    }
}

