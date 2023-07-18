package _b_chapter2._d_additional_binary_operators;

public class LogicalOperators {

 /*   FIGURE 2.1 The logical true tables for

        &,
        | (inclusive OR),
        and ^ (exclusive OR)

            Here are some tips to help remember this table:
                ■ AND is only true if both operands are true.
                ■ Inclusive OR is only false if both operands are false.
                ■ Exclusive OR is only true if the operands are different.

         && and ||

            The short-circuit operators are nearly identical to the logical operators, & and |, respectively,
            except that the right-hand side of the expression may never be evaluated if the final result can be determined
            by the left-hand side of the expression.


Alternatively, when they’re applied to numeric data types, they’re referred to as bitwise operators,
 as they perform bitwise comparisons of the bits that compose the number.
  */

    public static void main(String[] args) {

        //numeric bitwise comparisons
        int x = 2 & 3;
        System.out.println(x);

        int y = 4;
        long z = 1;

        long a = y & z;
        System.out.println(a);
    }
}
