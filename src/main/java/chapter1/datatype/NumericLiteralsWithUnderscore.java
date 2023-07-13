package chapter1.datatype;
//literal = a number which is present in the code using different type of base
public class NumericLiteralsWithUnderscore {
    public static void main(String[] args) {
        int million1 = 1000000;
        int million2 = 1_000_000; //since Java7
        System.out.println(million1);
        System.out.println(million2);

        //double notAtStart = _1000.00;        // DOES NOT COMPILE
        //double notAtEnd = 1000.00_;          // DOES NOT COMPILE
        //double notByDecimal = 1000_.00;      // DOES NOT COMPILE
        double annoyingButLegal = 1_00_0.0_0;  // this one compiles
    }
}
