package _b_chapter2._e_java_statements;

public class _g_5_VariablesOutsideLoop {
    public static void main(String[] args) {
        for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) {
            System.out.print(y + " ");
        }
        //System.out.print(x);  // DOES NOT COMPILE
    }
}
