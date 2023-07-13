package chapter1.packages;
import java.lang.System; //redundant
import java.lang.*; //redundant
import java.util.Random;
import java.util.*; //redundant
public class RedundantImports {

    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10));
    }
}
