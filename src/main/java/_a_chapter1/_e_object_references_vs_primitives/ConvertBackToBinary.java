package _a_chapter1._e_object_references_vs_primitives;
//literal = a number which is present in the code using different type of base
public class ConvertBackToBinary {

    public static void main(String[] args) {
        System.out.println(56);       // decimal base (base 10: digits 0–9) -> 56
        System.out.println(0b11);     // binary base (base 2: digits 0–1) -> 3
        System.out.println(017);      // octal base (base 8: digits 0–7) -> 15
        System.out.println(0x1F);     // hexadecimal base (base 16: digits 0–9 and letters A–F) -> 31
    }
}
