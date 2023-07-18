package _a_chapter1._h_variable_scope;

public class VariableTypeScopePractice {
    static int MAX_LENGTH = 5;
    //this is a class variable (because of static);
    //MAX_LENGTH goes into scope on line 4 where it is declared
    //It stays in scope until the program ends.
    int length;
    //this is an instance variable or a field
    //length goes into scope on line 8 where it is declared
    //It stays in scope until the object ends.

    public void grow(int inches) { //'inches' is a local variable & goes into scope at line 13 where it is declared
        if (length < MAX_LENGTH) {
            int newSize = length + inches; //'newSize' is a local variable & goes into scope at line 15 where it is declared
            length = newSize;
        } //'newSize' goes out of scope when that block ends on line 17
    }//'inches' goes out of scope when that block ends on line 18
}
