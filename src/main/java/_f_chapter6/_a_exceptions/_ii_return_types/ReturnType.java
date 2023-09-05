package _f_chapter6._a_exceptions._ii_return_types;

public class ReturnType {
    public static void main(String[] args) {
        ReturnType test = new ReturnType();
        String[] names = {"a","b"};
        test.indexOf(names, "c");
    }

    public int indexOf(String[] names, String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) {
                System.out.println(i); //inserted by SZ
                return i; }
        }
        System.out.println(-1); //inserted by SZ
        return -1;
    }
}
