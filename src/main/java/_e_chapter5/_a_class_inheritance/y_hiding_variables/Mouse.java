package _e_chapter5._a_class_inheritance.y_hiding_variables;

public class Mouse extends Rodent {
    protected int tailLength = 8;

    public void getMouseDetails() {
        System.out.println("[tail=" + tailLength + ",parentTail=" + super.tailLength + "]");
    }

    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        mouse.getRodentDetails();
        mouse.getMouseDetails();
    }
}
