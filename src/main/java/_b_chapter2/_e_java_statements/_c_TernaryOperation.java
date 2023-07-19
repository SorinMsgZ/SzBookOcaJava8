package _b_chapter2._e_java_statements;

public class _c_TernaryOperation {
    public static void main(String[] args) {
        int y = 1;
        int z = 1;
        final int x = y < 10 ? y++ : z++;
        System.out.println(y + "," + z); // Outputs 2,1

        int _y = 1;
        int $z = 1;
        final int $$x = _y>=10 ? _y++ : $z++;
        System.out.println(_y+","+$z); // Outputs 1,2
    }
}
