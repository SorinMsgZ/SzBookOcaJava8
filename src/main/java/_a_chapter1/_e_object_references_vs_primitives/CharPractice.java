package _a_chapter1._e_object_references_vs_primitives;

public class CharPractice {

    public static void main(String[] args) {
        System.out.println("The return of the char 'F' is:" +"\n" + "\t" +'F'); //this is a char
        System.out.println("The return of the String 'F' is:" +"\n" + "\t" +"F"); //this is a string

        System.out.println("The return of the char '{' is:" +"\n" + "\t" +'{'); //this is a char
        System.out.println("The return of the String '{' is:" +"\n" + "\t" +"{"); //this is a string


        char a = 65;
        System.out.println("The return of 'char d = 65' is:" +"\n" + "\t" + a);   //returns 'A'
        System.out.println("The return of '2*d (char d = 65)' is:" +"\n" + "\t" + 2*a);   //returns 130

        char i = 130;
        System.out.println("The return of 'char i = 130' is:" +"\n" + "\t" + i);   //returns a symbol

        char h= '\u0041';
        System.out.println("Every character has a DECIMAL or HEXADECIMAL equivalent number!");
        System.out.println("e.g. hexadecimal equivalent like: '\\u + hexadecimal number'");
        System.out.println("The return of 'char h= '\\u0041' is:" +"\n" + "\t" +h);   //returns 'A'

        char d = 12866;
        System.out.println("The return of 'char d = 12866' is:" +"\n" + "\t" +d);   //returns a symbol

        char maxChar1 = Character.MAX_VALUE;
        System.out.println("The return of 'Character.MAX_VALUE' is:" +"\n" + "\t" +maxChar1); //returns a symbol

        char maxChar2 = 65535;
        System.out.println("The return of 'char maxChar2 = 65535 (the MAX number value for a char)' is:" +"\n" + "\t" +maxChar2); //returns a symbol


    }
}
