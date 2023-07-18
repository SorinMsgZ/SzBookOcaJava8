package _a_chapter1._b_main_method;

public class MainDecompositionModeUnusual {

    /*public static void main(String[] args) {
        System.out.println("it will compile");
    }*/

    public static void main(String[] someName) {
        System.out.println("it will compile although the name of the parameter is 'someName' instead of 'ars'");
    }

    /*static void main(String[] args) {
        System.out.println("error because 'public' is missing");

    }*/

    /*public void main(String[] args) {
        System.out.println("error because 'static' is missing");
    }*/

    /*public static int main(String[] args) {
        System.out.println("error because the return type is 'int' instead of 'void'");
        return 1;
    }*/

    /*public static void someName(String[] args) {
        System.out.println("error because the method name is other than 'main'");
    }*/

    /*public static void main(Integer[] args) {
        System.out.println("error because the args type is 'Integer' instead of 'String'");
    }*/
}
