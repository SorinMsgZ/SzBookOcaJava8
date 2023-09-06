package _b_chapter2._d_additional_binary_operators;

public class CompoundAssignmentOperators {
    static int y, z;
    public static void main(String[] args) {
        int x = (y=1) + (z=2);
        System.out.println(x); //3
        
        //int a+=1; does NOT compile because a is not defined before!
    }
}
