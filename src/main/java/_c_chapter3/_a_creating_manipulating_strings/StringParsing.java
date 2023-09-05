package _c_chapter3._a_creating_manipulating_strings;

import java.sql.SQLOutput;

public class StringParsing {

    public static void main(String[] args) {

        //String s1 = 1+2; //does NOT compile!

        //String s2 = (String) (1+2); //does NOT compile!

        String s3 = 1+"2";

        System.out.println(s3);

        System.out.println(1+2+"a"); // results "3a"
    }
}
