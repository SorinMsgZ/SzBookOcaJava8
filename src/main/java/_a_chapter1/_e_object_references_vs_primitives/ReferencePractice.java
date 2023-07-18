package _a_chapter1._e_object_references_vs_primitives;

public class ReferencePractice {
    //int value = null;   // DOES NOT COMPILE
    String s = null;

    String reference = "hello";
    int len = reference.length();
    //int bad = len.length(); // DOES NOT COMPILE
}
