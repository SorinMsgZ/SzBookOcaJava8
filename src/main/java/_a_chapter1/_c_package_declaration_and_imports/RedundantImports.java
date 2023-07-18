package _a_chapter1._c_package_declaration_and_imports;
import java.lang.System; //redundant
import java.lang.*; //redundant
import java.util.Random;

public class RedundantImports {

    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10));
    }
}
