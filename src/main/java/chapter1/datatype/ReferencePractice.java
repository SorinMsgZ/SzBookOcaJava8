package chapter1.datatype;

public class ReferencePractice {
    //int value = null;   // DOES NOT COMPILE
    String s = null;

    String reference = "hello";
    int len = reference.length();
    //int bad = len.length(); // DOES NOT COMPILE
}
