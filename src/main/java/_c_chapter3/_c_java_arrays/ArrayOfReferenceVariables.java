package _c_chapter3._c_java_arrays;

import java.util.ArrayList;

public class ArrayOfReferenceVariables {
    public static void main(String[] args) {
        String [] bugs = { "cricket", "beetle", "ladybug" };
        String [] alias = bugs;
        System.out.println(bugs.equals(alias));     // true
        System.out.println(bugs.toString()); // [Ljava.lang.String;@160bc7c0
        System.out.println(java.util.Arrays.toString(bugs)); //[cricket, beetle, ladybug]


        String[] strings = { "stringValue" };
        Object[] objects = strings;
        String[] againStrings = (String[]) objects;
        //againStrings[0] = new StringBuilder();   // DOES NOT COMPILE
        //objects[0] = new StringBuilder();        // careful! -> Runtime -> Exception
    }
}
