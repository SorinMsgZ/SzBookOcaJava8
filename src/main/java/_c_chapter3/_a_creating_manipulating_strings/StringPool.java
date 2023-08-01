package _c_chapter3._a_creating_manipulating_strings;

public class StringPool {

    String name1 = "Fluffy";
    //the literal "Fluffy" goes to string pool
    String name2 = new String("Fluffy");
    // "name2.toString()" is not a literal here but a String -> so it goes to garbage collected
}
