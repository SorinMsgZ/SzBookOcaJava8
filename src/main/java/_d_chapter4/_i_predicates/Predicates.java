package _d_chapter4._i_predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Predicates {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<String>();
        animals.add(new String("fish"));

        print(animals, a -> a.startsWith("f"));
    }
    private static void print(List<String> animals, Predicate<String> checker) {
        for (String animal : animals) {
            if (checker.test(animal))
                System.out.print(animal + " ");
        }
        System.out.println();
    }
}
