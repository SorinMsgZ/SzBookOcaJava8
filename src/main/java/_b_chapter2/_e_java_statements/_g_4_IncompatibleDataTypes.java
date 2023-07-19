package _b_chapter2._e_java_statements;

public class _g_4_IncompatibleDataTypes {
    public static void main(String[] args) {
       /* for(long y = 0, int x = 4; x < 5 && y<10; x++, y++) {   // DOES NOT COMPILE
            System.out.print(x + " ");
        }*/

         for(long y = 0, x = 4; x < 5 && y<10; x++, y++) {   // DOES NOT COMPILE
            System.out.print(x + " ");
        }
    }
}
