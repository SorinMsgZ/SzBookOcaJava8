package _e_chapter5._a_class_inheritance._7_hiding_methods;

public class ParentMarsupial {
    public static boolean isBiped() {
        return false;
    }
    public void getMarsupialDescription() {
        System.out.println("Marsupial walks on two legs: "+isBiped());
    }
}
