package _c_chapter3._a_creating_manipulating_strings;

public class StringMethods13 {


    public static void main(String[] args) {

        //method 1 -> length()
        String string1 = "animals";
        System.out.println(string1.length());  // 7

        //method 2 -> charAt()
        String string2 = "animals";
        System.out.println(string2.charAt(0));  // a
        System.out.println(string2.charAt(6));  // s
        System.out.println(string2.charAt(7));  // throws exception

        //method 3 -> indexOf()
        String string3 = "animals";
        System.out.println(string3.indexOf('a'));         // 0
        System.out.println(string3.indexOf("al"));        // 4
        System.out.println(string3.indexOf('a', 4));      // 4
        System.out.println(string3.indexOf("al", 5));     // -1

        //method 4 -> substring()
        String string4 = "animals";
        System.out.println(string4.substring(3));  // mals
        System.out.println(string4.substring(string4.indexOf('m'))); // mals
        System.out.println(string4.substring(3, 4)); // m
        System.out.println(string4.substring(3, 7)); // mals

        System.out.println(string4.substring(3, 3)); // empty string
        System.out.println(string4.substring(3, 2));  // throws exception
        System.out.println(string4.substring(3, 8)); // throws exception

        //method 5, 6 -> toUpperCase(); toLowerCase()
        String string5 = "animals";
        System.out.println(string5.toUpperCase());  // ANIMALS
        System.out.println("Abc123".toLowerCase());  // abc123


        //method 7, 8 -> equals(); equalsIgnoreCase()
        System.out.println("abc".equals("ABC"));  // false
        System.out.println("ABC".equals("ABC"));  // true
        System.out.println("abc".equalsIgnoreCase("ABC"));  // true


        //method 9, 10 -> startsWith(); endsWith()
        System.out.println("abc".startsWith("a")); // true
        System.out.println("abc".startsWith("A")); // false
        System.out.println("abc".endsWith("c")); // true
        System.out.println("abc".endsWith("a")); // false


        //method 11 -> contains()
        System.out.println("abc".contains("b")); // true
        System.out.println("abc".contains("B")); // false

        //method 12 -> replace()
        System.out.println("abcabc".replace('a', 'A')); // AbcAbc
        System.out.println("abcabc".replace("a", "A")); // AbcAbc


        //method 13 -> trim()
        System.out.println("abc".trim());           // abc
        System.out.println("\t   a b c\n".trim()); // a b c


    }
}
