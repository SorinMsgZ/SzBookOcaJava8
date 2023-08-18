package _d_chapter4._d_passing_data;

public class ChooseRightOverloadedMethod {

    /*public static String glide(int i, int j) {return "exact match by type";}

    public static String glide(long i, long j) {return "larger primitive type";}

    public static String glide(Integer i, Integer j) {return "autoboxed type";}*/

//    public static String glide(int... nums) {return "varargs when exact match by type";}
    public static String glide(long... nums) {return "varargs when larger primitive type";}

    public static void main(String[] args) {

        System.out.println(glide(1,2));
    }
}
