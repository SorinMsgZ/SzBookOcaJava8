package _d_chapter4._c_acces_modifiers;

public class PassByValueWithReturnAppend {
    public static void main(String[] args) {
        int number = 1;                           // 1
        StringBuilder letters = new StringBuilder("abc");                   // abc
        number(number);                           // 1
        letters(letters);               // abcd
        System.out.println(number + letters.toString());     // 1abcd
    }
    public static int number(int number) {
        number++;
        return number;
    }
    public static StringBuilder letters(StringBuilder letters) {
        letters.append("d");
        return letters;
    }
}
