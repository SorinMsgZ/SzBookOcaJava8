package _d_chapter4._c_acces_modifiers;

public class PassByValuePrimitive {
    public static void main(String[] args) {
        int num = 4;
        newNumber(5);

        System.out.println(num);     // 4
    }

    public static void newNumber(int num) {
        num = 8;

    }
}
