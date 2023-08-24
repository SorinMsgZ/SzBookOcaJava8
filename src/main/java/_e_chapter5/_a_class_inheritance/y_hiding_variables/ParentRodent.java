package _e_chapter5._a_class_inheritance.y_hiding_variables;

public class ParentRodent {
    protected int tailLength = 4;
    public void getRodentDetails() {
        System.out.println("[parentTail="+tailLength+"]");
    }
}
