package _b_chapter2._e_java_statements;

public class _g_2_MultipleTermsForLoopStatement {
    public static void main(String[] args) {
        int x = 0;
        for(long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
            System.out.print(y + " ");
        }
        System.out.print(x);
    }
}
