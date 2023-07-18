package _a_chapter1._j_destroying_objects;

public class Scope {
    public static void main(String[] args) {
        String one, two;
        one = new String("a");
        two = new String("b");
        one = two; //the variable one changes to point to "b"
        // -> object "a" eligible for garbage collection
        String three = one;
        //Notice that three points to what one is pointing to right now
        // and not what it was pointing to at the beginning
        one = null;
    } //object "b" doesn’t go out of scope until the end of the method
}
