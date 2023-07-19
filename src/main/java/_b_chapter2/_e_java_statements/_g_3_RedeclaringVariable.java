package _b_chapter2._e_java_statements;

public class _g_3_RedeclaringVariable {
    public static void main(String[] args) {
       /* int x = 0;
        for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) {   // DOES NOT COMPILE
            System.out.print(x + " ");
        }*/

        int x = 0;
        long y = 10;
        for(y = 0, x = 4; x < 5 && y < 10; x++, y++) {
            System.out.print(x + " ");
        }
    }
}
